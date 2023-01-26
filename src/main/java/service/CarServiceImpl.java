package service;

import dao.CarDaoImpl;
import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private CarDaoImpl carDAO;

    public CarServiceImpl() {
        this.carDAO = new CarDaoImpl();
    }

    @Override
    public List<Car> getNumOfCars(int numberToShow) {

        return carDAO.getNumOfCars(numberToShow);
    }

}
