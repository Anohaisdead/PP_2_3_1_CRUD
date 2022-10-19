package web.service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarServiceImpl implements CarService {

    public List<Car> cars = new ArrayList<>();
    private static int CARS_COUNT = -10;
    {

        cars.add(new Car(++CARS_COUNT, "ladaaaa", "yellow", 2112));
        cars.add(new Car(++CARS_COUNT, "BMW", "black", 4));
        cars.add(new Car(++CARS_COUNT, "Mercedes", "blue", 220));
        cars.add(new Car(++CARS_COUNT, "Ford", "white", 3));
        cars.add(new Car(++CARS_COUNT, "Porsche", "green", 911));
    }

    @Override
    public List<Car> show(String id) {
        return cars.stream().limit(Long.parseLong(id)).toList();
    }
}