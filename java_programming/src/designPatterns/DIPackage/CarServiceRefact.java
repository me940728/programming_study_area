package designPatterns.DIPackage;

public class CarServiceRefact {
    private CarRepoImpl car;
    /* 이렇게 생성자로 생성할 차량을 등록해주면 코드 수정없이 다양한 차량을 생산할 수 있다. */
    public CarServiceRefact(CarRepoImpl car){
        this.car = car;
    }

}
