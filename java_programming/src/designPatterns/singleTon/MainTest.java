package designPatterns.singleTon;

public class MainTest {

    public static void main(String...args){
        /* 기존 방식으로 객체 생성 => 중복 발생 */
        NormalPatterns normalOne = new NormalPatterns();
        NormalPatterns normalTwo = new NormalPatterns();
        normalOne.NormalInstance(); // 메서드 call
        normalTwo.NormalInstance(); // 메서드 call
        /* 싱글톤 방식으로 객체 생성 */
        SingletonPatterns singleOne = SingletonPatterns.getInstance();
        SingletonPatterns singleTwo = SingletonPatterns.getInstance();

    }
}
