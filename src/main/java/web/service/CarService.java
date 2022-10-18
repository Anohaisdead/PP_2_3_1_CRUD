package service;

import model.Car;
import java.util.List;

public interface CarService {

    public List<Car> show();

    public List<Car> show(int id);
}