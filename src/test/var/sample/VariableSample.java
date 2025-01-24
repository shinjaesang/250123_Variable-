package test.var.sample;

/**
 * 변수 연습을 위한 샘플 클래스이다.
 * 변수 선언과 값 대입 및 변수 사용에 대한 예제를 제공한다.
 * 변수 초기화와 기본(primitive) 자료형(type)에 대해 확인한다.
 */
public class VariableSample {
	/**
	 * 기본 생성자이다.
	 */
	public VariableSample() {
		
	}
	/**
	 * 변수 선언, 값 기록, 변수 사용에 대한 예제 메소드이다.
	 */
	public void useVariable() {
		//메소드 블럭{} 안에서 만들어진 변수 : 지역변수(Local Variable)
		//지역변수는 메모리(RAM) 의 stack에 할당됨(allocation = 방 만듬)
		
		//1. 변수선언 : 값 기록할 방 만들기
		//만드는 법 -> 자료형 변수명;
		int first;
		int second;
		
		//2. 변수방에 값 기록하기 : 대입 연산자(=) 사용함
//		변수명 = 기록할 
		first = 120;
		second = 230;
		
		//3. 변수 사용 : 변수 공간에 기록된 값의 사용을 의미함
		System.out.println("첫번째 값: " + first);
		System.out.println("두번째 값: " + second);
		System.out.println("더하기 결과 : " + (first + second));
		System.out.println("빼기 결과 : " + (first - second));
		System.out.println("곱하기 결과 : " + (first * second));
		System.out.println("나누기 결과 : " + (second / first));
	}
	
//	변수 초기화 테스트용 메소드
	public void initVariable() {
//		변수 선언과 동시에 초기값 기록하는 것 : 변수 초기화
//		초기값  : 변수방에 첫 번째로 기록되는 값
//		자료형 변수명 = 초기값;
		boolean yn = true;
		byte bnum = 100;
		short snum = 24;
		int age = 28;
		long pay = 35000000L;
		float tax = 0.5f; //.5f로도 사용 가능 == 0.5f
		double weight = 124.5; // 124.5 == 124.5d
		char level = 'A';
		
		System.out.println("yn : " + yn);
		System.out.println("bnum" + bnum);
		System.out.println("snum : " + snum);
		System.out.println("age : " + age + " 세");
		System.out.println("급여 : " + pay + " 원");
		System.out.println("세율 : " + (tax * 100) + "%");
		System.out.println("무게 : " + weight + " kg");
		System.out.println("등급 : " + level);
	}
	
//	기본 자료형(Primitive Type)에 대한 클래스가 제공됨 : java.lang 패키지에 있음
//	래퍼(Wrapper) 클래스라고 함
//	기본 자료형의 메모리 할당 크기(BYTES), 기록되는 비트갯수(SIZE), 최대값(MAX_VALUE), 최소값(MIN_VALUE) 등이 제공됨
//	기본 자료형과 관련된 메소드들도 제공됨
/*
 * boolean =>Boolean
 * byte => Byte
 * short => Short
 * int => Integer
 * long => Long
 * float => Float
 * double => Double
 * char => Character
 */
	public void testWrapper() {//일반적인 방법과 다른 이유는 위치한 메모리의 영역이 다르기 때문
//		클래스에 소속된 멤버 사용방법 1 : => 클래스명 래퍼런스변수 = new  생성자();	래퍼런스변수.메소드();	레퍼런스.필드명
//		클래스에 소속된 멤버 사용방법 2 : 멤버 선언 구문에 public static 이 표시되어 있으면 바로 => 클래스명.메소드();		클래스명.필드명  
		System.out.println("int 메모리 할당 크기: " + Integer.BYTES + "바이트"); //파란글씨에 기울어진 단어는 static임
		System.out.println("int 기록 비트수: " + Integer.SIZE + "비트");
		System.out.println("int 최대값: " + Integer.MAX_VALUE);
		System.out.println("int 최소값: " + Integer.MIN_VALUE);
		System.out.println();
		System.out.println("Long 메모리 할당 크기: " + Long.BYTES + "바이트");
		System.out.println("Long 기록 비트수: " + Long.SIZE + "비트");
		System.out.println("Long 최대값: " + Long.MAX_VALUE);
		System.out.println("Long 최소값: " + Long.MIN_VALUE);
		System.out.println();
		System.out.println("Double 메모리 할당 크기: " + Double.BYTES + "바이트");
		System.out.println("Double 기록 비트수: " + Double.SIZE + "비트");
		System.out.println("Double 최대값: " + Double.MAX_VALUE);
		System.out.println("Double 최소값: " + Double.MIN_VALUE);
		System.out.println();
		System.out.println("Float 메모리 할당 크기: " + Float.BYTES + "바이트");
		System.out.println("Float 기록 비트수: " + Float.SIZE + "비트");
		System.out.println("Float 최대값: " + Float.MAX_VALUE);
		System.out.println("Float 최소값: " + Float.MIN_VALUE);
		System.out.println();
		System.out.println("Char 메모리 할당 크기: " + Character.BYTES + "바이트");
		System.out.println("Char 기록 비트수: " + Character.SIZE + "비트");
		System.out.println("Char 최대값: " + (int)Character.MAX_VALUE);
		System.out.println("Char 최소값: " + (int)Character.MIN_VALUE);
	}
}
