package com.ktds.edu;

public class Asurada extends FormlaOne {

	@Override
	protected void turboOn() {
		super.maxSpeed *= 5;
		System.out.println("�ְ� �ӷ��� �����߽��ϴ�.");
		System.out.println("���� �ӵ��� " + super.maxSpeed + "�Դϴ�.");
	}
	
	
}
