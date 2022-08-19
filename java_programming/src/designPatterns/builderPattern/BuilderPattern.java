package designPatterns.builderPattern;
/*점증적 생성자와 자바빈즈의 장점을 가져온 빌더 패턴
* 필수 매개변수로만 생성자를 호출해 빌더 객체를 얻고, 빌더 객체가 제공하는
* setter 매서드로 원하는 선택 매개변수를 설정한다. 마지막으로 매개변수가 없는 builder 메서드를 호출
* 빌더 안에는 정적 멤버 클래스를 만들어 두는게 보통이다.
* */
public class BuilderPattern {
    /*점증적 생성자 + 자바빈즈 장점만 가져옴*/
    private final int servingSize; // 1회 제공량
    private final int calories; // 칼로리
    private final int fat; // 지방
    public static class Builder{
        private final int servingSize, calories; // 필수 매개변수
        private int fat = 0;         /*선택 매개변수 - 기본값 초기화*/
        /*빌더 생성자로 필수 매개변수 생성*/
        public Builder(int servingSize, int calories){
            this.servingSize = servingSize;
            this.calories = calories;
        }
        public Builder fat(int value){fat = value; return this;}
        public BuilderPattern build(){ return new BuilderPattern(this);}
    }
    private BuilderPattern(Builder builder){
        servingSize = builder.servingSize;
        calories = builder.calories;
        fat = builder.fat;
    }
    public static void main(String... args){
        BuilderPattern test = new BuilderPattern.Builder(10, 11)
                .fat(20).build();
    }
}
