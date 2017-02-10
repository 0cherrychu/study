package com.ktds.edu;

public class ButterFly extends FormlaOne {
	
	@Override //쉽게 찾아줌 override
	protected void turboOn() {
		//this or super, 
		super.maxSpeed *= 15;
		System.out.println("최고 속력이 증가!!!!");
		System.out.println("현재 속도는 " + super.maxSpeed + "입니다.");
	}
	
	
}
