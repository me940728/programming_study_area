package designPatterns.decorate;

public class decorateMain {
    public static void main(String... args){
        Statements statements = new AVANTE("AVANTE N", 3212.0);
        statements = new Options("N DCT 패키지", 190.0, statements);
        statements = new NPerformParts("카본익스테리어패키지", 295.0, statements);

        System.out.println("Car Statement : " + statements.getLabel());
        System.out.println("Total price : " + statements.getPrice());
    }
}
