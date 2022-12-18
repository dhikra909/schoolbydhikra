package nbi;

import java.io.FileInputStream;
import java.util.Scanner;

public class bdf {

		// TODO Auto-generated method stub
		static void searchPdf() throws Throwable {

			boolean isExit = true;

			while (isExit) {

			Scanner sc = new Scanner(System.in);

			System.out.println("**********************************");
			// Reading the word to be found from the user
			System.out.println("Enter the word you want to search pdf ");
			String input = sc.next();

			// consuming the <enter> from input above
			sc.nextLine();
			boolean word2 = false;
			int wordCount = 0;

			// Reading the String of the file
			Scanner sc1 = new Scanner(new FileInputStream("evaluationFilePdf.pdf"));
			while (sc1.hasNextLine()) {
			String word1 = sc1.nextLine();
//			     System.out.println(line);
			if (word1.indexOf(input) != -1) {
			word2 = true;
			wordCount = wordCount + 1;
			}
			}
			if (word2) {
			System.out.println("PDF File contains the  word");
			System.out.println("Number of word is: " + wordCount);
			System.out.println("__________________________________");

			} else {
			System.out.println("PDF File does not contain the word");
			System.out.println("__________________________________");

			}
			System.out.println("if you want to search another word press 1 and 2 to exit ");
			Integer s = sc.nextInt();
			if (s == 1) {
			isExit = true;
			} else if (s == 2) {
			isExit = false;
			System.out.println("Good Bye");
			}

			}
			}
	}


