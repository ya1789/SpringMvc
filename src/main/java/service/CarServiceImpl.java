package service;

import dao.CarDAO;
import dao.CarDaoImpl;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private CarDaoImpl carDAO;

    public CarServiceImpl() {
        this.carDAO = new CarDaoImpl();
    }

    @Override
    public List<Car> show(int numberToShow) {

        return carDAO.show(numberToShow);
    }

}
