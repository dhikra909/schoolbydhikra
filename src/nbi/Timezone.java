package nbi;
import java.io.Serializable;

public class Timezone implements  Serializable{ 

	private String offset ;
	private String descripton;
	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public String getDescripton() {
		return descripton;
	}
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}


}
