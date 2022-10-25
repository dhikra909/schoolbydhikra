package main;
import java.util.*;

public class School {
	static int factorial (int m) {
		if (m == 0)
			return 1;
		else 
			return(m * factorial (m-1) );
	}

	String schoolName;

	static boolean isExit = true;
	static boolean isExitSubject = true;
	static boolean userpass= true;

	List<Student> studentList = new ArrayList<>();
	Stack<String> stk = new Stack<>();

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	// Getter
	public String getSchoolName() {
		return schoolName;
	}

	// Setter
	public void setSchoolName(String SN) {
		this.schoolName = SN;
	}

	static void menueFunction() {
		System.out.println("Select one of the options:");
		System.out.println("1. Registeration");
		System.out.println("2. Print Email");
		System.out.println("3. Print Repeated Email");
		System.out.println("4. Report");
		System.out.println("5. History");
		System.out.println("6. Currency");
		System.out.println("7. Factorial");
		System.out.println("8. Exit");
	}
	static void submenueFunction() {
		System.out.println("Select one of the options:");
		System.out.println("1. Factorial");
		System.out.println("2. Fibonacci series");
		System.out.println("3. Back to main menue");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stk = new Stack<>();
		Set<String> hashEmailSet = new HashSet<String>();
		Set<String> hashEmailSetU = new HashSet<String>();
		List<School> schoolList = new ArrayList<>();
		List<String> listDuplicateEmail = new ArrayList<>();
		boolean subMenuExit = true;
		int currency;
		double feesAmount = 0;
		double amountCal = 0;
		double amount;
		boolean isExit=true;
		
		
	    String  username, password;
	    while (userpass) {
	    	System.out.println("Enter username: ");
	        username =  sc.nextLine();
	        System.out.println("Enter password: ");//alm909
	        password = sc.nextLine();
	        if (username.equals("dhikra") && password.equals("alm909")) {
	        	 System.out.println("username successful ");
	        
		do {
			menueFunction();

			int studentMenue = sc.nextInt();

			switch (studentMenue) {
			case 1:

				while (isExit) {
					School schObj = new School(); // object for school
//			  	  List<School> schoolList=new ArrayList<>();
					System.out.println("Enter School Name: ");
					String schInput = sc.next();
					stk.push(schInput);

					schObj.setSchoolName(schInput);// object chaining
					schoolList.add(schObj);

					Student studentObj = new Student();// student object

					System.out.println("Enter student name:");
					String stuName = sc.next();
					stk.push(stuName);
					studentObj.setStudentName(stuName);
					schObj.studentList.add(studentObj);

					System.out.println("Enter Email:");
					String emailInput = sc.next();
					stk.push(emailInput);
					studentObj.setStudentEmail(emailInput);
					schObj.studentList.add(studentObj);
					listDuplicateEmail.add(emailInput);
//			   	 Set<String> hashEmailSetU = new HashSet<String>();
					hashEmailSetU.add(emailInput);


					isExitSubject = Boolean.TRUE;
					while (isExitSubject) {
						Subject subjectObj = new Subject();// object for subject
						System.out.println("Enter Subject Name: ");
						String subInput = sc.next();
						subjectObj.setSubName(subInput);
						stk.push(subInput);

						Mark markObj = new Mark(); // object for mark
						System.out.println("Enter Marks: ");
						Integer markInput = sc.nextInt();
						String m = Integer.toString(markInput);
						markObj.setSubMark(markInput);
						stk.push(m);

						subjectObj.listMark.add(markObj);
						studentObj.listSubject.add(subjectObj);

						System.out.println("press 1 to add new subject , press 0 to exit");
						int exitInput = sc.nextInt();

						String v = Integer.toString(exitInput);
						stk.push(v);
						if (exitInput == 0) {

							isExitSubject = false;
						}
					}
					System.out.println("press 1 to add new student , press 0 to exit");
					int exitInput2 = sc.nextInt();
					String b = Integer.toString(exitInput2);
					stk.push(b);
					if (exitInput2 == 0) {
						isExit = false;
					}
				}
				break;
			case 2:
				// Printing elements of HashSet object
				System.out.println(hashEmailSetU);
//	    	        Set<String> hashEmailSetU = new HashSet<String>();
				break;

			case 3:
//	    		 List<String> listDuplicateEmail=  new ArrayList<>();
				for (String email : listDuplicateEmail) {
					if (hashEmailSet.add(email) == false) {
						System.out.println("Deplicate email is: " + " " + email);
					}
				}

				break;

			case 4:
				System.out.println("___ ++++Report:++++___");// for each method for array list
				for (School sch : schoolList) {
					System.out.println(sch.schoolName);
					for (Student h : sch.studentList) {
						System.out.println(
								"Student Name :" + h.getStudentName() + "\n The Email is :" + h.getStudentEmail());
						for (Subject j : h.listSubject) {
							for (Mark m : j.getListMark()) {
								System.out.println("Student mark of " + j.getSubName() + ":" + " " + m.getSubMark());
								System.out.println("\tStudent Fees Amount: " + amountCal + "OMR");

							}
						}
					}
				}

				break;
			case 5:

				System.out.println("***** The history is ******");
				// printing history
				while (stk.empty() == false) {
					System.out.println(stk.pop());
					// {@code true} if and only if this stack contains
					// no items; {@code false} otherwise.
				}
				break;
			case 6:
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
//					Math.round(amountCal);
					currencyName = "AED";

				}

				else if (currency == 3) {

					amountCal = feesAmount * 2.60;
//					Math.round(amountCal);
					currencyName = "USD";


				}


				currencyMap.put(currencyName, amountCal);
				comparisionMap.put(studentConversionName, currencyMap);
//	    		System.out.println( " map 1 is " + currencyMap);

				
				System.out.println(comparisionMap);

	
				break;

			case 7:
			do {
				submenueFunction() ;
				int studentSubMenue = sc.nextInt();
				switch(studentSubMenue) {
				case 1:
					int i,fact =1;
					System.out.println("Enter tne number of factorial:");
					System.out.println("\n");
					int factorialNum =sc.nextInt();
					
					fact =  factorial(factorialNum) ;
					System.out.println("factorial of : \t"+ factorialNum +"\t is :\t"+fact );
					
					
//					int fact =1;
//			   System.out.println("Enter tne number of factorial:");
//			   int userInput =sc.nextInt();
//			   for (int k=1; k<=userInput; k++)
//			   {
//				   fact= fact *k;
//				   System.out.println(k);
//			   }
//				   System.out.println("Factory of : \t"+ userInput +"\t is :\t"+fact );   
				  break; 
				 case 2:
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
					
//                   System.out.println("Enter tne number of Fibonacci series:");
//					 int userInput1 = sc.nextInt();
//					 
//					 int n1=0,n2=1,n3,v,count= userInput1;
//					 System.out.print(n1+" "+n2);
//					 
//					 for (v=2;v<count;++v) {
//						 n3=n1+n2;
//					 System.out.print( " "+n3);
//					 n1=n2;
//					 n2=n3;
					 
							 
					 }
					 
					 
					 break;
				
			   
				  case 3:
					  subMenuExit = false;
					  break;
					
				
				}
				
			}while(subMenuExit);
			break;
			
			 case 8:
				System.out.println("Exiting bye....");
				System.exit(0);
				break;
			}
		
		} while (isExit);
	
		
	    }
	        System.out.println("login failed please try again ");
	    }
             userpass = false;
		
           
           }
}