package SingleTon;

public class SingletonPatterns {
    /* private 이기 때문에 객체 내부에서만 호출, 정적영역에 할당 되어 메모리를 공유한다. */
    private static SingletonPatterns singleton = new SingletonPatterns();
    /* 싱글톤 생성자는 생성자가 private 이다 왜냐면 외부에서 new 로 메모리 생성을 막기 위해서다. */
    private SingletonPatterns() { System.out.println("Singleton Method"); }
    /* 싱글톤은 getInstance 메서드로 객체를 반환한다.  */
    public static SingletonPatterns getInstance() { return singleton; }
}
