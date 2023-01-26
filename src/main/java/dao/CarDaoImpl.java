package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public List<Car> show(int numberToShow) {
        return cars.stream().limit(numberToShow).collect(Collectors.toList());
    }
}
