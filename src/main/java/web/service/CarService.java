package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList (List<Car> carList, Integer val);
    List<Car> getList ();
}
