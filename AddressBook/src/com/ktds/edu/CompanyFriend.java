package com.ktds.edu;

public class CompanyFriend extends Friend{
	
	public CompanyFriend(String name, String phoneNumber, String companyName) {
		super(name, phoneNumber);//friend �����ڸ� ȣ���ض�
		this.companyName = companyName;
	}

	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Override
	public String getName() {
		//System.out.println("Company Name : " + super.getName());
		return companyName + "�� " + super.getName();
	}
	
}
