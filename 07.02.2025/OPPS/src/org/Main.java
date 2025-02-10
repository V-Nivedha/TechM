package src.org;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Toyota", "Corolla", 2022);
        cars[1] = new ElectricCar("Tesla", "Model S", 2023, 400);

        cars[2] = new Car("Ford", "F-150", 2020);
        cars[3] = new ElectricCar("Nissan", "Leaf", 2022, 350);

        cars[4] = new Car("Audi", "A4", 2022);
        for (Car car : cars) {
            car.startEngine();

        }
    }
}

