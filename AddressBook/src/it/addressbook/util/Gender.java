package it.addressbook.util;

public enum Gender {
	Male("M"), Female("F");
	
	private String genderCode;
	
	private Gender(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderCode() {
		return genderCode;
	}
	
}
