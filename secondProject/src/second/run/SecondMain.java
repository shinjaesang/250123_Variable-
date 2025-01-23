package second.run;

import second.menu.TestMenu; 
//second.menu 패키지 안에 TestMenu 클래스를 가져와라
//현재 패키지 안에 없는 클래스(다른 패키지에 속한 클래스)는 반드시 임포트함

//실행용 클래스 : main()이 있음
public class SecondMain { //SecondMain 클래스
	
	public static void main(String[] args) {// 메인 메소드
		//객체지향 프로그래밍 언어들에서의 클래스 사용법 : 
		//클래스명 레퍼런스변수(임의 작성 가능/TestMenu()의 주소가 저장되어있음 = 포인터 = 레퍼런스)
		//= new 생성자함수();
		//TestMenu menu = new TestMenu(); //TestMenu() - > 기본 생성자(빈괄호 생성자)
		//클래스가 가진 메소드를 실행시키려면
//		레퍼런스변수.메소드명();
		//menu.displayMenu();
		//(.)은 접근연산자
		
		new TestMenu().displayMenu();
	}
	
}
