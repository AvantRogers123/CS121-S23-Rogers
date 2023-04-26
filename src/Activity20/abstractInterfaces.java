package Activity20;

public class abstractInterfaces {
    public static void main(String[] args) {
        package interfaces;

        public interface Vehicle {
            public void start();
        }

        public class Car implements Vehicle {
            public void start() {
                System.out.println("Car started.");
            }
        }

        public class Motorcycle implements Vehicle {
            public void start() {
                System.out.println("Motorcycle started.");
            }
        }

        public class VehicleTest {
            public static void main(String[] args) {
                Vehicle car = new Car();
                Vehicle motorcycle = new Motorcycle();

                car.start();
                motorcycle.start();
            }
        }

    }
}
