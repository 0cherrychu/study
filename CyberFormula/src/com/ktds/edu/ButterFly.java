package com.ktds.edu;

public class ButterFly extends FormlaOne {
	
	@Override //���� ã���� override
	protected void turboOn() {
		//this or super, 
		super.maxSpeed *= 15;
		System.out.println("�ְ� �ӷ��� ����!!!!");
		System.out.println("���� �ӵ��� " + super.maxSpeed + "�Դϴ�.");
	}
	
	
}
