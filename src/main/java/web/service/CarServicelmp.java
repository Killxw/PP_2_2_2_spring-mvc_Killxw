package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.db.CarsList;
import web.models.Car;

import java.util.List;

@Service
public class CarServicelmp implements CarService {

    @Autowired
    private CarsList carsList;
    @Override
    public List<Car> getCarList(List<Car> carList, Integer val) {
        if (val != null && val >= 1 && val < 5) {
            return carList.subList(0, val);
        } else {
            return carList;
        }
    }
    public List<Car> getList(){
        return carsList.getCars();
    }
}
