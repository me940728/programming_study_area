package DIPackage;

public class CarSpecDTO {
    private String name; // 자동차의 이름
    private int tire; // 타이어 갯수
    private int price; // 차량 가격
    String weight; // 차량 중량

    /* 게터 세터 */
    public void setName(String name) {
        this.name = name;
    }
    public void setTire(int tire) {this.tire = tire;}
    public void setPrice(int price) {
        this.price = price;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getTire() {
        return tire;
    }
    public int getPrice() {
        return price;
    }
    public String getWeight() {
        return weight;
    }
}
