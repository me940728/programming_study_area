package designPatterns.decorate;
/* 장식할 타깃 아반떼 차량 클래스 */
public class AVANTE implements Statements{
    private String label; /* 주문 내역 라벨링하여 담을 변수 */
    private double price; /* 가격을 담을 변수 */
    /* 생성자 */
    public AVANTE(String label, double price){
        this.label = label;
        this.price = price;
    }
    @Override
    public double getPrice() { return this.price; }
    @Override
    public String getLabel() { return this.label; }
}
