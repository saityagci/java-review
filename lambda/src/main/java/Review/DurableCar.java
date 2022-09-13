package Review;

public class DurableCar implements CarPredicate{
    @Override
    public boolean test(Car car) {
        return car.getModel().equalsIgnoreCase("Toyota");
    }
}
