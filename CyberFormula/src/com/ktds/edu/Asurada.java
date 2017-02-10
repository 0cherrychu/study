package com.ktds.edu;

public class Asurada extends FormlaOne {

	@Override
	protected void turboOn() {
		super.maxSpeed *= 5;
		System.out.println("최고 속력이 증가했습니다.");
		System.out.println("현재 속도는 " + super.maxSpeed + "입니다.");
	}
	
	
}
