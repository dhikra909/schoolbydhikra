package nbi;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.io.IOException;
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
//		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://randomuser.me/api/?results=" + num + "&password=" + pass
						+ "&nat="+nat + "&gender=" + gender + "&seed="+seed + "&page=" + page 
						+"&inc="+include + "&noinfo")).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String res = response.body();
		
		System.out.println("\n"+res);
		
		Gson gs = new Gson();
		Reif data = gs.fromJson(res, Reif.class);

		
		int size = data.getResults().size();
		for (int i = 0; i < size; i++) {
			System.out.println();
			System.out.println("name : " + data.getResults().get(i).getName().getFirst());
			System.out.println("Email : " + data.getResults().get(i).getEmail());
			System.out.println("Phone : " + data.getResults().get(i).getPhone());
			System.out.println("Nationality : " + data.getResults().get(i).getNat());
			System.out.println("Gender : " + data.getResults().get(i).getGender());
		//	System.out.println("Seed : " + data.getInfo().getSeed());
		//	System.out.println("Password : " + data.getResults().get(i).getLogin().getPassword());
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