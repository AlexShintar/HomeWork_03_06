public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck1", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Vehicle[] garage = {car, car2, bicycle, bicycle2, truck, truck2};

        ServiceStation station = new ServiceStation();
        for (Vehicle vehicle : garage) {
            station.check(vehicle);
        }
    }

}