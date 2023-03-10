public abstract class Vehicle {
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++)
            System.out.println("Меняем покрышку");
    }
    public void checklist(Vehicle vehicle) {
        this.updateTyre();
    }
}


