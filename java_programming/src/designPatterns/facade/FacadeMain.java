package designPatterns.facade;

public class FacadeMain {
    public static void main(String... args){
        K2Rifle k2 = new K2Rifle();
        /* k2 소총 사격에 30발을 넣어준다. */
        k2.burstThree(30);
        /* 클라이언트(여기서는 메인클래스)는 K2 객체의 복잡한 세부 기능들을
        알필요가 없다. 본인이 원하는 하나의 기능을 호출하면 하위 메서드들은
        자동으로 호출되기 때문이다.
        * */
    }
}
