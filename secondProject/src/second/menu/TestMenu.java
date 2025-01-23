package second.menu;

//기능 제공용 클래스임(디스플레이 메뉴) : main()메소드 없음
public class TestMenu { //TestMenu 클래스
	//생성자 함수(Constructor) 없음 => 컴파일 시에 기본 생성자  클래스명() 가 자동 추가됨
	
	//멤버 함수 (Method) : 기능(function)
	public void displayMenu() {//메소드
		System.out.println("프로그램 실행시 출력되는 메뉴입니다.");
		System.out.println("=========================");
		System.out.println("1. 내 정보 등록");
		System.out.println("2. 내 정보 보기");
		System.out.println("3. 내 정보 삭제");
		System.out.println("4. 내 정보 수정");
		System.out.println("5. 끝내기");
	}
}
