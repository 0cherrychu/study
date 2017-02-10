package com.ktds.edu;

public class LoggerMain {

	public static void main(String[] args) {
		
		Logger logger = new MemberLogger();
		logger.log("허유진 님이 로그인 했습니다.");
		logger.log("허유진 님이 로그아웃 했습니다.");
		logger.log("허유진 님이 로그인 했습니다.");
		logger.log("허유진 님이 탈퇴 했습니다.");
		
	}

}
