package main;
import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	     
	     private String subName;
	      
	      List<Mark> listMark=new ArrayList<>();
		
	     

		    public List<Mark> getListMark() {
			return listMark;
		}

		    
		    //writ srt and get for list
		public void setListMark(List<Mark> listMark) {
			this.listMark = listMark;
		}

			public String getSubName() {
		      return subName;
		    }
		    
		    // Setter
		    public void setSubName(String Sname) {
		      this.subName = Sname;
		    }
}

