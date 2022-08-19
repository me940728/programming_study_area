package designPatterns.DIPackage;

public class Sedan extends CarRepoImpl{
    String name; // 자동차의 이름
    int tire; // 타이어 갯수
    int price; // 차량 가격
    String weight; // 차량 중량
    Sedan(CarSpecDTO val){
        this.name = val.getName();
        this.tire = val.getTire();
        this.price = val.getPrice();
        this.weight = val.getWeight();
    }

}
