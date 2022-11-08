package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class registeration {

	public void registeration() {
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stk = new Stack<>();
		Set<String> hashEmailSet = new HashSet<String>();
		Set<String> hashEmailSetU = new HashSet<String>();
		List<School> schoolList = new ArrayList<>();
		List<String> listDuplicateEmail = new ArrayList<>();
		
		School schObj = new School(); // object for school
//	  	  List<School> schoolList=new ArrayList<>();
			System.out.println("Enter School Name: ");


			schObj.setSchoolName(schInput);// object chaining
			schoolList.add(schObj);

			Student studentObj = new Student();// student object

			System.out.println("Enter student name:");
			String stuName = sc.next();
			stk.push(stuName);
			studentObj.setStudentName(stuName);
			schObj.studentList.add(studentObj);
			studentObj.work();
			System.out.println("Enter Email:");
			String emailInput = sc.next();
			stk.push(emailInput);
			studentObj.setStudentEmail(emailInput);
			schObj.studentList.add(studentObj);
			listDuplicateEmail.add(emailInput);
//	   	 Set<String> hashEmailSetU = new HashSet<String>();
			hashEmailSetU.add(emailInput);
		
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
		System.out.println("Enter student first name: ");
		String firstName = sc.next();
		System.out.println("Enter student age: ");
		int studentage = sc.nextInt();

		System.out.println("press 1 to add new subject , press 0 to exit");
		int exitInput = sc.nextInt();
		stk.push(firstName);
		studentObj.firstName(firstName);

		String v = Integer.toString(exitInput);
		stk.push(v);



}
}