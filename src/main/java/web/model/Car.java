package web.model;

public class Car {
    private long id;
    private String model;
    private int series;
    private int year;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car() {
    }
    public Car(long id, String model, int series, int year) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.year = year;
    }
}
