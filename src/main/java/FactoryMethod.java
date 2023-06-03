public class FactoryMethod {
    interface CarCreation {
        public Car createCar();
    }

    class LamboCreation implements CarCreation {
        @Override
        public Car createCar() {
            System.out.println("lambo created");
            return new Lambo();
        }
    }

    class FerrariCreation implements CarCreation {
        @Override
        public Car createCar() {

            System.out.println("ferrari created!!");
            return new Ferrari();
        }
    }

    class Ferrari extends Car {

    }
    class Lambo extends Car {

    }
    abstract class Car {

    }
    class CarCreationFactory {
        public CarCreation of(String name) {
            return switch (name) {
                case "lambo" -> new LamboCreation();
                case "ferrari" -> new FerrariCreation();
                default -> null;
            };
        }
    }
    public CarCreation create() {
        var carCreationFactory = new CarCreationFactory();
        return carCreationFactory.of("ferrari");
    }
    public static void main(String[] args) {
        System.out.println("hello tai");


    }
}
