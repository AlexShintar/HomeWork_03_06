public class ServiceStation {
    public static void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        vehicle.checklist(vehicle);
    }
}