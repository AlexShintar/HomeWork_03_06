public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("car1", 4);
        Vehicle car2 = new Car("car2", 4);
        Vehicle truck = new Truck("truck1", 6);
        Vehicle truck2 = new Truck("truck1", 8);
        Vehicle bicycle = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Bicycle("bicycle2", 2);

        Vehicle[] garage = {car, car2, bicycle, bicycle2, truck, truck2};

        for (Vehicle vehicle : garage) {
            ServiceStation.check(vehicle);
        }
    }
}