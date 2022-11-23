package nbi;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.io.IOException;
import java.io.Serializable;


    public class Renfo implements  Serializable {
    	
    	
    	
	public static void main(String[] args) throws Exception, InterruptedException {
	    HttpClient client =  HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?page=5&results=5&password=upper,lower,1-16&seed=hoor")).build();
		HttpResponse<String> response =client.send(request, HttpResponse.BodyHandlers.ofString());
		String res=response.body();
		System.out.println(res);
		Gson gs=new Gson();
		
		Reif data = gs.fromJson(res, Reif.class);
		System.out.println(data.getInfo().getPage());
		System.out.println(data.getInfo().getResults());
		System.out.println(data.getInfo().getSeed());
		System.out.println(data.getInfo().getVersion());
		System.out.println(data.getInfo().hashCode());
		System.out.println(data.getInfo().toString());
		System.out.println(data.getInfo().getClass());
		System.out.println(data.getResults().get(0).getEmail());
		System.out.println(data.getResults().get(0).getPhone());
//		System.out.println(data.getResults().get(3).getEmail());
		System.out.println(data.getInfo().getSeed());
		System.out.println(data.getResults().get(0).getLogin().getPassword());
}
    }