package ocpStudy.javaBasic;

class Number{
    int num = 0;
    static int sNum = 0;
    static void print(){
        System.out.print("static method");
    }
    void printInstance(){
        System.out.print("basic method");
    }
}

public class ClassStatic {
    /* static 키워드는 정적이다 라는 의미를 가지며 클래스 로더가 클래스를 로드할 때
    로딩되어 static 영역에 할당된다. 이 때 가비지 컬렉터가 관려를 하지 못하며
    모든 객체가 메모리를 공유한다.
    * */
    public static void main(String[] args){
        Number num1 = new Number();
        Number num2 = new Number();

        num1.num++;
        num1.sNum++;

        System.out.println(num2.num);
        System.out.println(num2.sNum);

        Number.print(); // static method 는 인스턴스 생성 없이도 호출이 가능하다. 보통 유틸리티 메서드를 만들 때 사용함
        /*
        * 0
        * 1
        * 이 출력된다. 인스턴스를 따로 생성하였으나, static 변수(클래스 필드)는 공유되어 1이 나온 것을 확인할 수 있다.
        * */
    }
}
