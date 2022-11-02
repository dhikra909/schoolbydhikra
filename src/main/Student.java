package main;
import java.util.ArrayList;
import java.util.List;

public class Student implements iStudent{
	
	@Override
	 public void work (){
        System.out.println("this student work");
   }
	@Override
	public String firstName(String fname) {
	       return fname;
}
	//writ set and get for properity

	     String studentName;
	     String studentEmail; 

	     List<Subject> listSubject=  new ArrayList<>();
		
	    public void setListSubject(List<Subject> listSubject) {
	    	this.listSubject=listSubject;
	    }
	    public List<Subject> getListSubject(){
	    	return listSubject;
	    }
	 // Getter
	    public String getStudentName() {
	      return studentName;
	    }
	    
	    // Setter
	    public void setStudentName(String studentName) {
	      this.studentName = studentName;
	    }
	 
	    public String getStudentEmail() {
		      return studentName;
		    }
		    
		    // Setter
		    public void setStudentEmail(String studentName) {
		      this.studentName = studentName;
		    }
}
