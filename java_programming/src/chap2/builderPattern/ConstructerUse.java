package chap2.builderPattern;
/*
* 생성자에 매개변수가 많다면 빌더를 고려하라!
* 정적팩터리 메서드나 생성자는 매개변수가 많아질수록 대응하기 어렵다는 단점이 존재한다.
* 예를 등어 식품영양정보를  표현하는 클래스를 정의한다면 필수항목 외에 지방 트랜스지방 포화지방 등 여러 항목이 추가 될 것이다.
* 하지만 대부분의 함령으 0이라면 이 문제에 대응하기 위해 n개의 메서드를 추가하여 대응하여야 한다... (복잡성 증가)
* 이에 대응하기 위한 것이 자바빈즈 패턴이다.
* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
* 방법은 매개변수가 없는 생성자를 만든 후 세터메서드를 호출해 원하는 매개변수 값을 설정하는 방식이다.
* */
public class ConstructerUse {
    /* 점증적 생성자 패턴인 기존 방식*/
    private final int servingSize; // 1회 제공량
    private final int calories; // 칼로리
    private final int fat; // 지방
    public ConstructerUse(int servingSize, int calories) {
        this.servingSize = servingSize;
        this.calories = calories;
        this.fat = 0; // 값을 넣을 필요가 없는 코드가 추가됨...
    }
    public ConstructerUse(int servingSize, int calories, int fat) {
        this.servingSize = servingSize;
        this.calories = calories;
        this.fat = fat;
    }
}
