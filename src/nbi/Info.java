package nbi;
import java.io.Serializable;

public class Info implements  Serializable{

	private String seed;
	private int results;
	private int page;
	private String version;
	
	public String getSeed() {
		return seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}

	public int getResults() {
		return results;
	}

	public void setResults(int results) {
		this.results = results;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
