package web.service;

import web.dao.CarDAO;
import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    public CarServiceImpl() {
        this.carDAO = new CarDaoImpl();
    }

    @Override
    public List<Car> getNumOfCars(int numberToShow) {

        return carDAO.getNumOfCars(numberToShow);
    }

}
