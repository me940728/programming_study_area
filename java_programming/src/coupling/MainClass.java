package coupling;
/*
* @autor 최별규 
* */
public class MainClass {
    public static void main(String...args){
        TestClass tc = new TestClass();
        /* Parameter 기본형 타입으로 지정되어 있고, arguments 정수형 데이터 3이 전달되었다. */
        tc.setDataCoupling(3);

        /* Parameter 참조형 타입으로 지정되어 있고, arguments 정수형 배열 3개가 전달되었다. */
        tc.setStampCoupling(new int[3]);

        /* 호출하는 객체에서 제어를 지시하는 인자를 전달하여 대상 객체를 컨트롤하고 있다. */
        tc.controlMethod(true);

        /* 인자값으로 외부 파일을 가져온다. */
        tc.externalCoupling("./Test.txt");

        /* 인자로 실수를 보내준다. 내부적으로 여러 객체에서 같은 클래스를 호출하여 연산한다. */
        tc.commonCoupling(3.12);
        tc.commonCoupling2(3.13);

        /* 전달된 인자로 다른 객체의 값을 변경한다. */
        tc.contentsCoupling(3.222);
    }
}
