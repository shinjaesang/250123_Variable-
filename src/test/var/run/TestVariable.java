package test.var.run;

import test.var.sample.*;

public class TestVariable {
	public static void main(String[] args) {
		//변수(variable) 테스트
		//클래스가 가진 메소드 실행을 하려면
//		클래스명 래퍼런스변수 = new 생성자();
		VariableSample samp = new VariableSample();
//		래퍼런스변수.메소드명();
//		samp.useVariable();
//		samp.initVariable();
		samp.testWrapper();
	}

}
