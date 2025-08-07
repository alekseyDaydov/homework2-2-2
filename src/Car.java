public class Car extends Vehicle implements TyreImpl, EngineImpl {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return super.toString() + "Car";
    }
}
