package ocpStudy;

public class Exam02 {

    public static void main(String[] args){
        class X {

        }
        final class Y extends X{

        }
    }
/*
컴파일이 실패한다 이유는 x나 y 둘중 하나는 toString() 메서드를 구현해야한다.
 */
}
