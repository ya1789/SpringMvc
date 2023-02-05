package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDAO;
import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;
    @Autowired

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @Override
    public List<Car> getNumOfCars(int numberToShow) {

        return carDAO.getNumOfCars(numberToShow);
    }

}
