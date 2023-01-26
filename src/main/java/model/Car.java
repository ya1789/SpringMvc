package model;

public class Car {
    private static long id;
    private static String model;
    private static int series;
    private static int year;

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Car.id = id;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Car.year = year;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static int getSeries() {
        return series;
    }

    public static void setSeries(int series) {
        Car.series = series;
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
