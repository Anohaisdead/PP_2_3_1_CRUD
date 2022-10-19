package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    private CarServiceImpl carService;
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }



    @GetMapping(value = "/cars") // при переходе в браузере на "/cars" мы попадем на метод printCars и он вернет cars.html
    public String printCars(@RequestParam(name = "count", required = false, defaultValue = "5") String id, ModelMap model) {
        model.addAttribute("cars", carService.show(id));
        return "cars";
    }

}