package com.ktds.edu;

public abstract class FormlaOne {
	
	protected int maxSpeed = 300;
	
	public void racing(){
		go();
		turboOn();//���� �� �ִ� ��
		stop();
	}
	
	private void go(){
		System.out.println("�ְ�ӷ����� �޸��ϴ�.");
		System.out.println("���� �ӷ���"+ maxSpeed + "�Դϴ�.");
	}
	
	private void stop(){
		System.out.println("����ϴ�.");
	}
	
	protected abstract void turboOn();

}
