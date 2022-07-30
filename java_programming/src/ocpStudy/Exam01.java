package ocpStudy;

import java.util.function.Consumer;

public class Exam01 {
	public static void main(String[] args){
		/*
		아래문제는 Consumer 함수적 인터페이스의 순차적 연결을 묻는 문제다.
		Consumer 객체는 소비만 하는 인터페이스 이다. 소비 == 리턴 값이 없음.
		 */
		Consumer<String> c1 = arg -> System.out.println(arg);
		c1.accept("c1 Accepted"); // 인자 전달 메서드(승인하다)
		Consumer<String> c2 = arg -> System.out.println(arg);
		c2.accept("c2 Accepted");
		// c1이 실행되고, 매개변수로 전달된 c1이 실행 되는데 이때 두 메서드로 전달되는 인자는 after then 이다.
		c1.andThen(c1).accept("after then"); // 함수적인터체이스 연결 메서드
		c2.accept("c2 Accepted again");
	}

}
