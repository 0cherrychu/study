package com.ktds.edu;

public abstract class FormlaOne {
	
	protected int maxSpeed = 300;
	
	public void racing(){
		go();
		turboOn();//변할 수 있는 것
		stop();
	}
	
	private void go(){
		System.out.println("최고속력으로 달립니다.");
		System.out.println("현재 속력은"+ maxSpeed + "입니다.");
	}
	
	private void stop(){
		System.out.println("멈춥니다.");
	}
	
	protected abstract void turboOn();

}
