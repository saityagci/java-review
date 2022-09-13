package Review;

public class NewCar implements CarPredicate{
    @Override
    public boolean test(Car car) {
        return car.getYear()>2015;
    }
}
