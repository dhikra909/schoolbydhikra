package main;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
	
	static int factorial(int m) {
		if (m == 0)
			return 1;
		else
			return (m * factorial(m - 1));
	}
	
	Scanner sc = new Scanner(System.in);
	public static BigInteger calculationofFacctorial(int n) {
		BigInteger Facctorial = new BigInteger("1");
		for (int i = 2; i < n; i++) {
			Facctorial = Facctorial.multiply(BigInteger.valueOf(i));

		}
		return Facctorial;

	}
   
	public void  factorial() {
	   
	
	   
	
		
		System.out.println("Enter tne number of factorial:");
		int factorialNum =sc.nextInt();
		BigInteger Facctorial = calculationofFacctorial(factorialNum);
		
		System.out.println("factorial of : \t"+ factorialNum +"\t is :\t"+Facctorial );
		

			
}
}