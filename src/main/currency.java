package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class currency {
	public void currency() {
		int currency;
		double feesAmount = 0;
		double amountCal = 0;

		Scanner sc = new Scanner(System.in);
		Stack<String> stk = new Stack<>();
		Map<String, Double> currencyMap = new HashMap<>();
		Map<String, Map<String, Double>> comparisionMap = new HashMap<>();

		String currencyName = "KWD";

		System.out.println("Enter student name who want to convert:");
		

		String studentConversionName = sc.next();
		stk.push(studentConversionName);

		System.out.println("Choose Currency you want to convert:\n" + "1-KWD \n" + " 2-AED \n" + " 3-USD");

		currency = sc.nextInt();
		String s = Integer.toString(currency);
		stk.push(s);
		

		System.out.println("Enter Fees Amount");

		feesAmount = sc.nextDouble();
		String s1 = Double.toString(feesAmount);
		stk.push(s1);
		

		if (currency == 1) {

			amountCal = feesAmount * 0.80;
		

		}

		else if (currency == 2) {

			amountCal = feesAmount * 9.54;
//			Math.round(amountCal);
			currencyName = "AED";

		}

		else if (currency == 3) {

			amountCal = feesAmount * 2.60;
//			Math.round(amountCal);
			currencyName = "USD";


		}


		currencyMap.put(currencyName, amountCal);
		comparisionMap.put(studentConversionName, currencyMap);
//		System.out.println( " map 1 is " + currencyMap);

		
		System.out.println(comparisionMap);

	}
}