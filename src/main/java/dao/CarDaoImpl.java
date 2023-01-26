package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDAO {
    public static int CARS_COUNT;
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(CARS_COUNT++,"model1", 123, 1986));
        cars.add(new Car(CARS_COUNT++,"model2", 124, 1987));
        cars.add(new Car(CARS_COUNT++,"model3", 125, 1988));
        cars.add(new Car(CARS_COUNT++,"model4", 126, 1989));
        cars.add(new Car(CARS_COUNT++,"model5", 127, 1980));
    }
    @Override
    public List<Car> getNumOfCars(int numberToShow) {
        if (numberToShow >= 5) {
            numberToShow = 5;
        }
        return cars.stream().limit(numberToShow).toList();
    }
}
