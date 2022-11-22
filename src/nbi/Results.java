package nbi;

import java.io.Serializable;

public class Results implements  Serializable{

	String gender;
	String email;
	String phone;
	String cell;
	String nat;
	private String getGender() {
		return gender;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getPhone() {
		return phone;
	}
	private void setPhone(String phone) {
		this.phone = phone;
	}
	private String getCell() {
		return cell;
	}
	private void setCell(String cell) {
		this.cell = cell;
	}
	private String getNat() {
		return nat;
	}
	private void setNat(String nat) {
		this.nat = nat;
	}
	public static void main(String[] args) {
		

	}

}
