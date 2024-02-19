package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList (List<Car> carList, int val);
}
