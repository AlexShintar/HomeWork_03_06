public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checklist(Vehicle vehicle) {
        this.updateTyre();
        this.checkEngine();
    }
}