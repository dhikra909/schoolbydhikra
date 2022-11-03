package main;

import java.util.Scanner;

public class Fiboonacci {

	public void Fiboonacci() {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
	int inputusers1 = 0;
	int inputusers2 = 1;
	System.out.println("Enter tne number of Fibonacci series:");
	
	
    int count = sc.nextInt();
	int inputusers3;
	System.out.print(inputusers1+" "+inputusers2 );
	for (int v=2;v<count;++v)
	{
		inputusers3 =inputusers1 + inputusers2;
	if (inputusers3 <= 100)
	{
		 System.out.print(""+ inputusers2+" ");
		 inputusers1= inputusers2;
		 inputusers2 = inputusers3;
	}
	}
	}
}
