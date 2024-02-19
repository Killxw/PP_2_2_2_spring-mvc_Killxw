package web.db;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsList {
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("BMW", 2007, 5));
        carsList.add(new Car("Mazda", 2002, 2));
        carsList.add(new Car("Honda", 2022, 7));
        carsList.add(new Car("Haval", 2012, 3));
        carsList.add(new Car("Toyota", 2001, 4));
    }
    public List<Car> getCars(){
        return carsList;
    }
}
