
public class Main {

    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for (int i = 0; i < 100; i++){
            Thing brick = new Thing("Brick", i + 1);
            Suitcase suitcase = new Suitcase(1000);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
        
    }

}
