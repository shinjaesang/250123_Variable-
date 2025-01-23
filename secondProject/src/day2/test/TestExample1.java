package day2.test;

public class TestExample1{
	
	public void example() {
		System.out.println("이름 : 신재상");
		System.out.println("나이 : 27");
		System.out.println("키 : 190.0");
		System.out.println("몸무게 : 99.3");
		System.out.println("성별 : M");
		System.out.println("전화번호 : 010-8641-5042");
		System.out.println("이메일 : ss504299@naver.com");
	}
	
	public void exampleVariable() {
		String name = "신재상"; 
//		String name = '신재상';  //문자 나열값은 반드시 ""(double quotation)으로 묶어야 함
//		String name = 신재상;  //문자 나열값에 따옴표 묶지 않으면 변수로 해석함
		int age = 27;
//		short sage = (short)age;  //4byte 크기의 값이 2바이트 크기의 방에 기록될 수는 없음, 형변환 필요함
		double height = 190.0;
//		float hh = 190.0f; //190.0 값의 자료형은 double (8byte)임 => float(4byte), 값 뒤에 접미사 f 붙임
		double weight = 99.3;
		char gender = 'M';
//		char gg = "M"; //문자하나 타입인 char (character)는 값에 반드시 ''(single quotation)사용해야 함
//		char gg = M; //따옴표 없으면 변수로 해석
		String number = "010-8641-5042";
		String email = "ss504299@naver.com";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세 ");
		System.out.println("키 : " + height + " cm");
		System.out.println("몸무게 : " + weight + " kg");
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + number);
		System.out.println("이메일 : " + email);
		
		}
	
	public static void main(String[] args) { 
		//클래스가 가진 메소드 실행 :  
		//클래스명 래퍼런스변수  = new 생성자();
		//래퍼런스변수.메소드();
		TestExample1 test = new TestExample1();
		test.example();
		
		//new 생성자().메소드(); - 간결한 방법
//		new TestExample1().example();
		
		System.out.println(); // 빈줄 추가(enter)
		test.exampleVariable(); // 같은 래퍼런스변수를 사용하는 것이 메모리적으로 효율적
		
		//간단한 코드
//		System.out.println(); 
//		new TestExample1().exampleVariable(); 
	}
	
}