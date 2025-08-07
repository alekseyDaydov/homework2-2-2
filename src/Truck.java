public class Truck extends Vehicle implements TyreImpl, EngineImpl, TrailerImpl {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return super.toString() + "Truck";
    }
}
