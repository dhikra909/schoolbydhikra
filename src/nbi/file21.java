
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class file21{
//
//	 public static void main(String args[]) throws IOException , FileNotFoundException {
//		 
//		 System.out.println("Enter the path to folder to search for files");
//	      Scanner s1 = new Scanner(System.in);
//	      String folderPath = s1.next();
//	      File folder = new File(folderPath);
//	      
//	      if (folder.isDirectory()) {
//	         File[] listOfFiles = folder.listFiles();
//	         if (listOfFiles.length < 1)System.out.println( "There is no File inside Folder");
//	         
//	         else System.out.println("List of Files & Folder");
//	         for (File file : listOfFiles) {
//	            if(!file.isDirectory())System.out.println(file.getCanonicalPath().toString());
//	          //Reading the word to be found from the user
//	  	      Scanner sc1 = new Scanner(System.in);
//	  	      System.out.println("*******************************");
//	  	      System.out.println("Enter the word to be found");
//	  	      String word = sc1.next();
//	  	      boolean flag = false;
//	  	      int count = 0;
//	  	      System.out.println("Contents of the line");
//	  	      //Reading the contents of the file
//	  	     // Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\user021\\eclipse-workspace\\Jamail_course_Repo\\src\\JSONFile.txt"));
//	  	      Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\user022\\eclipse-workspace\\main\\gsonf.txt"));
//	  	      while(sc2.hasNextLine()) {
//	  	         String line = sc2.nextLine();
//	  	         System.out.println(line);
//	  	         if(line.indexOf(word)!=-1) {
//	  	            flag = true;
//	  	            count = count+1;
//	  	         }
//	  	      }
//	  	      if(flag) {
//	  	         System.out.println("File contains the specified word");
//	  	         System.out.println("Number of occurrences is: "+count);
//	  	      } else {
//	  	         System.out.println("File does not contain the specified word");
//	  	      }
//	         } 
//	      } 
//	      else System.out .println("There is no Folder @ given path :" + folderPath);
//		 
//	     
//	         
//	   }
//	}
package nbi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class file21 {

	public static void main(String[] args) throws Throwable {
		Set<String> uniqueStringHS = new HashSet();
		boolean menue = true;
		do {
			Scanner sa = new Scanner(System.in);
			System.out.println("=====Welcome to my project=========");
			System.out.println("=====choose one option=====");
			System.out.println("========================");

			System.out.println("1.writr/read file");
			System.out.println("2.search file");
			System.out.println("3.search PDF file");
			System.out.println("========================");

			{
				String bb = sa.next();
				int option = Integer.parseInt(bb);
				switch (option) {
				case 1:

					String ur1 = "https://randomuser.me/api/?results=";
					HttpClient client = HttpClient.newHttpClient();
					System.out.println(ur1);
					HttpRequest request = HttpRequest.newBuilder().uri(URI.create(ur1)).build();
					HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
					String res = response.body();
					System.out.println("\n");
					try {
						FileWriter file = new FileWriter("gsonf.txt");
						file.write(res.toString());
						file.close();

					} catch (IOException e) {

						e.printStackTrace();
					}
					System.out.println(" file created");

					try {
						FileReader read = new FileReader("gsonf.txt");
						BufferedReader bufferedReader = new BufferedReader(read);
						String line;
						while ((line = bufferedReader.readLine()) != null) {
							System.out.println(line);
						}
						read.close();
					} catch (IOException e) {

						e.printStackTrace();
					}
					break;
				case 2:

					System.out.println("file created");
// Reading the words to be found from the user
					Scanner sc1 = new Scanner(System.in);
					ArrayList<String> theDuplicateString = new ArrayList<>();

					System.out.println("How many word string do you want to enter");
					int amtOfWord = sc1.nextInt();
					for (int i = 0; i < amtOfWord; i++) {
						System.out.println("Enter the words to be found");
						String word = sc1.next();
						String theDuplicteString;
						if (!theDuplicateString.contains(word)) {
							theDuplicateString.add(word);
						}

						boolean words = false;
						int count = 0;
						System.out.println("Contents of the line");
// Reading the contents of the file
						Scanner sc2 = new Scanner(new FileInputStream("gsonf.txt"));
						while (sc2.hasNextLine()) {
							String line1 = sc2.nextLine();
							System.out.println(line1);
							if (line1.indexOf(word) != -1) {
								words = true;
								count = count + 1;
							}
						}
						if (words) {
							System.out.println("File contains the specified words");
							System.out.println("Number of occurrences is: " + count);

						} else {
							System.out.println("File does not contain the specified words");

						}
					}
					break;
				case 3:
//					bdf.searchPdf();
//					break;

					Scanner sc = new Scanner(System.in);

					System.out.println("**********************************");
					// Reading the word to be found from the user
					System.out.println("Enter the word you want to search in pdf ");
					String input = sc.next();

					// consuming the <enter> from input above
					sc.nextLine();
					boolean word2 = false;
					int wordCount = 0;

					// Reading the String of the file
					Scanner sc11 = new Scanner(
							new FileInputStream("C:\\Users\\user022\\eclipse-workspace\\APIav\\sample.pdf"));
					while (sc11.hasNextLine()) {
						String word1 = sc11.nextLine();
//					     System.out.println(line);
						if (word1.indexOf(input) != -1) {
							word2 = true;
							wordCount = wordCount + 1;
						}
					}

					if (word2) {

						System.out.println("PDF File contains the  word");
						System.out.println("Number of word is: " + wordCount);
						Path temp = Files.copy(Paths.get("C:\\Users\\user022\\Desktop\\sample.pdf"),
								Paths.get("C:\\Users\\user022\\Desktop\\"
										+ "newfile\\sample2.pdf"));
						if (temp != null) {
							System.out.println("File renamed and moved successfully");
						}
						System.out.println("__________________________________");

					} else {

						System.out.println("PDF File does not contain the word");
						System.out.println("__________________________________");

					}
					System.out.println("if you want to search another word press 1 and 2 to exit ");
					int s = sc.nextInt();
					if (s == 1) {

					} else if (s == 2) {

						System.out.println("Good Bye");

					}

				}

			}

		} while (menue = true);

	}
}
