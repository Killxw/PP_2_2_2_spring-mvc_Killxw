package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;



@Controller
public class CarsController {


    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam(required = false) Integer count) {
        model.addAttribute("cars", carService.getCarList(carService.getList(), count));
        return "cars";
    }
}
