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
    public List<Car> getCarList(Integer val) {
        if (val == null) {
            return carsList.getCars();
        } else {
            return carsList.getCars().stream()
                    .limit(Math.min(val, carsList.getCars().size()))
                    .collect(Collectors.toList());
        }
    }
}
