package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.db.CarsList;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServicelmp implements CarService {

    private final CarsList carsList;

    @Autowired
    public CarServicelmp(CarsList carsList) {
        this.carsList = carsList;
    }

    @Override
    public List<Car> getCarList(List<Car> carList, Integer val) {
        return carList.stream()
                .limit(val != null && val >= 1 && val < 5 ? val : carList.size())
                .collect(Collectors.toList());
    }
    public List<Car> getList(){
        return carsList.getCars();
    }
}
