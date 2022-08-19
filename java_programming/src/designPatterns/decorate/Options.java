package designPatterns.decorate;

public class Options extends SelectItem{
    public Options(String label, double price, Statements statements){
        super(label, price, statements);
    }
    @Override
    public double getPrice() { return this.price + statements.getPrice(); }
}
