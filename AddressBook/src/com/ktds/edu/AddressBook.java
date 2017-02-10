package com.ktds.edu;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	public static void main(String[] args) {
		
		List<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("장민창","010-2737-2604"));
		friends.add(new Friend("이메일","mc.jang@hucloud.co.kr"));
		friends.add(new CompanyFriend("도깨비", "111", "피카체리츄공화국"));
		//Friend companyFriend = new CompanyFriend("피카츄", "111", "피카체리츄공화국");
		
		/*System.out.println("이름 : "+ companyFriend.getName());
		System.out.println("전화번호 : "+ companyFriend.getPhoneNumber());
		System.out.println("회사 명: " + ((CompanyFriend)companyFriend).getCompanyName());*/
		
		friends.add(new ArmyFriend("장민창", "010-****-****","15사단", "병장"));
		
		for (Friend friend : friends) {
			/*System.out.println(friend);
			System.out.println(friend.getClass());
			System.out.println(Friend.class);
			System.out.println(CompanyFriend.class);*/
			
			System.out.println("이름: " + friend.getName());
			System.out.println("전화번호: " + friend.getPhoneNumber());
			
			if ( friend.getClass() == CompanyFriend.class ){
				System.out.println("회사 명 : " + ((CompanyFriend)friend).getCompanyName());
			}
			
			
		}
	}

}
