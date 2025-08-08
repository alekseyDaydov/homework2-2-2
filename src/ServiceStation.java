public class ServiceStation {
    public void check(Car car) {
        car.check(car);
    }

    public void check(Bicycle bicycle) {
        bicycle.check(bicycle);
    }

    public void check(Truck truck) {
        truck.check(truck);
    }
}
