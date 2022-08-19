package designPatterns.DIPackage;
/* 자동차 공장에서 자동차를 만들기 위한 코드 */
public class CarService {

    /* 만약 아래 처럼 코드를 작성하면 Sedan 만 만드는 코드가 되어 버린다.
    * 세단뿐 아니라 트럭, 버스, 탱크 같은 다른 종류의 차를 만드려면
    * new Truck(), new Bus(), new Tank() 를 일일히 코드를 수정해주거나,
    * 별도의 메서드를 만드는 등 작업이 추가되고 나중에 유지보수시 유연성과 복잡도가 증가하게 된다.
    * 이를 자동차서비스가 세단에 의존적이다 라고 표현한다. */
    public void createNewCar(){
        CarRepoImpl car = new Sedan(new CarSpecDTO()); /* 자동차스펙은 이미 입력되었다고 가정 */
        car.createNewCar(car);
    }
}
