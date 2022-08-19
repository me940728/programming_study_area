package designPatterns.decorate;

public abstract class SelectItem implements Statements{
    protected Statements statements;
    protected String label;
    protected double price;
    /* 생성자 */
    public SelectItem(String label, double price, Statements statements){
        this.label = label;
        this.price = price;
        this.statements = statements;
    }
    /* 가격을 넣는 기능 구현은 구현부에 넣어줌*/
    @Override
    public abstract double getPrice();
    @Override
    public String getLabel(){ return statements.getLabel() + ", " + this.label; }
}
