package nbi;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Reader;
import java.io.Serializable;

public class Renfo implements Serializable {

	public static void main(String[] args) throws Exception, InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of results: ");
		String num = sc.next();

		System.out.println("Enter gender : ");
		String gender = sc.next();

		System.out.println("Enter Pass : ");
		String pass = sc.next();

		System.out.println("Enter Nationality : ");
		String nat = sc.next();

		System.out.println("Enter Page No. : ");
		String page = sc.next();

		System.out.println("Enter Seed : ");
		String seed = sc.next();

		System.out.println("What u wanna include in ur screen : ");
		String include = sc.next();
//		
//		System.out.println("What u wanna exclude in ur screen : ");
//		String exclude = sc.next();
		
		//jokha - added parameters
		String url = "https://randomuser.me/api/?results=" + num + "&password=" + pass + "&nat=" + nat
				+ "&gender=" + gender /* + "&seed=" + seed */ + "&page=" + page + "&inc=" + include + "&noinfo";
		HttpClient client = HttpClient.newHttpClient();
		
		
		System.out.println(url);
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String res = response.body();
		
		System.out.println("\n" + res);

		
//		Read readf = new BufferedReader(new FileReader("gsonf.txt"));
		Gson gs = new Gson();
		
	

		try {
		FileWriter file = new FileWriter ("gsonf.txt");
			file.write(res.toString());
			file.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("file created");
		
		Reader readf = new BufferedReader(new FileReader("gsonf.txt"));
		Reif data = gs.fromJson(readf, Reif.class);
		
		List<Results> resultsList = data.getResults();
		

		for (Results re : resultsList) {
			System.out.println();
			// jokha - if condition + solve some mistakes in sop
			if (!(re.getName().getFirst() == null)) {
				System.out.println("name : " + re.getName().getFirst());
			}

			if (!(re.getEmail() == null)) {
				System.out.println("Email : " + re.getEmail());
			}

			if (!(re.getPhone() == null)) {
				System.out.println("Phone : " + re.getPhone());
			}

			if (!(re.getNat() == null)) {
				System.out.println("Nationality : " + re.getNat());
			}

			if (!(re.getGender() == null)) {
				System.out.println("Gender : " + re.getGender());
			}

//			if (re.getDob()!=null && re.getDob().getAge()!=null) {
//				System.out.println("Age : " + re.getDob().getAge());
//			}
			
			if (re.getLogin()!=null && re.getLocation().getCountry() != null) {
				System.out.println("Country : " + re.getLocation().getCountry());
			}
			
			// System.out.println("Seed : " + data.getInfo().getSeed());
			// System.out.println("Password : " +
			// data.getResults().get(i).getLogin().getPassword());
			System.out.println("\n******************************");

//		System.out.println(data.getInfo().getPage());
//		System.out.println(data.getInfo().getResults());
//		System.out.println(data.getInfo().getSeed());
//		System.out.println(data.getInfo().getVersion());
//		System.out.println(data.getInfo().hashCode());
			
//		System.out.println(data.getInfo().toString());
//		System.out.println(data.getInfo().getClass());
			
	}
}
}