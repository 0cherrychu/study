package com.ktds.edu;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	public static void main(String[] args) {
		
		List<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("���â","010-2737-2604"));
		friends.add(new Friend("�̸���","mc.jang@hucloud.co.kr"));
		friends.add(new CompanyFriend("������", "111", "��īü�����ȭ��"));
		//Friend companyFriend = new CompanyFriend("��ī��", "111", "��īü�����ȭ��");
		
		/*System.out.println("�̸� : "+ companyFriend.getName());
		System.out.println("��ȭ��ȣ : "+ companyFriend.getPhoneNumber());
		System.out.println("ȸ�� ��: " + ((CompanyFriend)companyFriend).getCompanyName());*/
		
		friends.add(new ArmyFriend("���â", "010-****-****","15���", "����"));
		
		for (Friend friend : friends) {
			/*System.out.println(friend);
			System.out.println(friend.getClass());
			System.out.println(Friend.class);
			System.out.println(CompanyFriend.class);*/
			
			System.out.println("�̸�: " + friend.getName());
			System.out.println("��ȭ��ȣ: " + friend.getPhoneNumber());
			
			if ( friend.getClass() == CompanyFriend.class ){
				System.out.println("ȸ�� �� : " + ((CompanyFriend)friend).getCompanyName());
			}
			
			
		}
	}

}
