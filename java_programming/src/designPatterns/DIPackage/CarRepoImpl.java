package designPatterns.DIPackage;

public class CarRepoImpl implements CarRepo{
    @Override
    public void createNewCar(CarRepoImpl val) {
        System.out.println("자동차 생산 시작");
        /* 자동차 생산 지시서 작동 코드 넣는 곳 */
    }
}
