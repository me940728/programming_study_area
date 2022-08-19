package designPatterns.builderPattern;
/* 점증적 생성자 패턴을 보완한 자바빈즈 패턴 */
public class JavaBeansPattern {
    /*기본값으로 초기화*/
    private int servingSize = -1; // 1회 제공량
    private int calories = 0; // 칼로리
    private int fat = 0; // 지방

    public JavaBeansPattern(){}
    /*훨씬 가독성이 높아졌다 하지만 객체 하나를 만드려면 메서드를 여러개 호출하는 단점이 존재...
    * 객체가 완성되기 전까지의 데이터의 consistency 무너진다는 의미 그래서 빌더 패턴을 사용*/
    public void setServingSize(int value) {servingSize = value;}
    public void setCalories(int value) {calories = value;}
    public void setFat(int value) {fat = value;}

}
