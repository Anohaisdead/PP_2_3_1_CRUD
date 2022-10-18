package web.DAO;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CARS_COUNT = -10;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "lada", "yellow", 2112));
        cars.add(new Car(++CARS_COUNT, "BMW", "black", 4));
        cars.add(new Car(++CARS_COUNT, "Mercedes", "blue", 220));
        cars.add(new Car(++CARS_COUNT, "Ford", "white", 3));
        cars.add(new Car(++CARS_COUNT, "Porsche", "green", 911));
    }

    public List<Car> allCars() {
        return cars;
    }

    public void setCar(Car car) {
        cars.add(car);
    }

}