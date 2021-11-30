package web.model;


public class Car {
    private String brand;
    private String owner;
    private int year;

    public Car(String brand, String owner, int year) {
        this.brand = brand;
        this.owner = owner;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "[" + owner + " has a " + brand + " which was made in " + year + "]";
    }
}
