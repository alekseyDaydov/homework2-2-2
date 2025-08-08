public interface Checkable {
    default void check(Car car) {
    };
    default void check(Bicycle bicycle) {
    };
    default void check(Truck truck) {
    };
}
