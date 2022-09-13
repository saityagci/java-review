package task2;

public class FastCar implements CarPredicate{
    @Override
    public boolean test(Car car) {

        return car.getTopSpeed()>160 ;
    }
}
