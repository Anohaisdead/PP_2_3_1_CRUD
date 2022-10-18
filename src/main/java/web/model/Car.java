package model;

public class Car {

    private int id;
    private String model;
    private String color;
    private int series;

    public Car(int id, String model, String color, int series) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return this.id + " " + this.getModel() + " " + this.getColor() +
                " " + this.getSeries();

    }
}