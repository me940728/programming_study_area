package designPatterns.decorate;

public class NPerformParts extends SelectItem{

    public NPerformParts(String label, double price, Statements statements){
        super(label, price, statements);
    }
    @Override
    public double getPrice() { return this.price + statements.getPrice(); }
}
