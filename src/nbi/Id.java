package nbi;
import java.io.Serializable;

public class Id implements  Serializable{  
	private String name ;
	private String value;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
