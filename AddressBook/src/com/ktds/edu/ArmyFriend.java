package com.ktds.edu;

public class ArmyFriend extends CompanyFriend {
	
	private String grade;

	public ArmyFriend(String name, String phoneNumber, String companyName, String grade) {
		super(name, phoneNumber, companyName);
		this.grade = grade;
	}
	
	@Override
	public String getName() {
		return  super.getName()+ " ÀÇ" + grade ;
	}
}
