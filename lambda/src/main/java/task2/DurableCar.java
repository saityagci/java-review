package task2;

public class DurableCar implements CarPredicate{
    @Override
    public boolean test(Car car) {
        return car.getModel().equalsIgnoreCase("Toyota");
    }
}
