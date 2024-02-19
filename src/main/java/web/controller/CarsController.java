package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.db.CarsList;
import web.models.Car;
import web.service.CarServicelmp;


import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarsList carsList;

    @Autowired
    private CarServicelmp carServicelmp;

    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam(required = false) Integer count) {
        List<Car> cars;
        if (count != null && count >= 1 && count < 5) {
            cars = carServicelmp.getCarList(carsList.getCars(), count);
        } else {
            cars = carsList.getCars();
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
