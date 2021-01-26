package by.programming_with_classes.aggregation_and_composition.task2;

public class Runner {
    public static void main(String[] args) {
        Car porsche911 = new Car("Maserati Gx9");
        System.out.printf("We created a car %s. Trying to drive:%n", porsche911.getModelName());
        porsche911.run();

        Engine engine = new Engine(370, 2.981);
        porsche911.setEngine(engine);
        System.out.printf("%nA %d hp engine is installed. A volume of %.3f liters. Trying to drive:%n",
                engine.getPower(), engine.getVolume());
        porsche911.run();

        int whellDiameter = 19;
        porsche911.setWheels(new Wheel(whellDiameter), new Wheel(whellDiameter), new Wheel(whellDiameter), new Wheel(whellDiameter));
        System.out.printf("%nWheels are installed. Trying to drive:\n");
        porsche911.run();

        porsche911.getWheels().get(2).breakWheel();
        System.out.println("\nSTOP! Something broke.\nTrying to drive:");
        porsche911.run();

        porsche911.changeWheel();
        System.out.println("\nTrying to drive:");
        porsche911.run();

        System.out.println("...");
        porsche911.setFuel(false);
        porsche911.run();
        porsche911.refuel();
        porsche911.run();

        System.out.println("\nCar model: " + porsche911.getModelName());
    }
}
