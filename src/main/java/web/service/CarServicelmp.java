package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public class CarServicelmp implements CarService {
    @Override
    public List<Car> getCarList(List<Car> carList, int val) {
        if(val > carList.size() + 1){
            return carList;
        }
        return carList.subList(0, val);
    }
}
