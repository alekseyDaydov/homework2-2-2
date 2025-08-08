public class Bicycle extends Vehicle implements TyreImpl {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return super.toString() + "Bicycle";
    }

}
