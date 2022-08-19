package designPatterns.DIPackage;

public class MainClass {
    /* 이렇듯 자동차 이름과 가격, 중량만 설정해주어 매개변수로 던져주고
    * 내가 생산하고자 하는 차량의 객체만 던져주면 알아서 작업을 해준다.
    * 스프링에서는 이 복잡한 작업을 DI를 통해 해결한다.*/
    public static void main(String...args){
        CarSpecDTO spec = new CarSpecDTO();
        CarServiceRefact createCar = new CarServiceRefact(new Bus(spec));
        CarServiceRefact createCar2 = new CarServiceRefact(new Sedan(spec));
    }
}
