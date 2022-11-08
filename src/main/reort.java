package main;

import java.util.ArrayList;
import java.util.List;

public class reort {

	public void reort() {
		double amountCal = 0;
		List<School> schoolList = new ArrayList<>();
		
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

}
}