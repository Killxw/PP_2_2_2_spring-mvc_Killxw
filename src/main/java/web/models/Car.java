package web.models;

public class Car {
    private String model;
    private int year;
    private int series;

    public Car(String model, int year, int series) {
        this.model = model;
        this.year = year;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
    @Override
    public String toString() {
        return this.getModel() + " " + this.getSeries() + " " + this.getYear();
    }
}
