public class ServiceStation implements Checkable {
    @Override
    public void check(Car car) {
        car.check(car);
    }

    @Override
    public void check(Bicycle bicycle) {
        bicycle.check(bicycle);
    }

    @Override
    public void check(Truck truck) {
        truck.check(truck);
    }
}
