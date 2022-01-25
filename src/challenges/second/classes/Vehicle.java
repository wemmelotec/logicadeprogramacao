package challenges.second.classes;

public class Vehicle {

    private Automaker automaker;
    private String model;
    private String color;
    private int year;

    public Vehicle(Automaker automaker, String model, String color, int year) {
        this.automaker = automaker;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Automaker getAutomaker() {
        return automaker;
    }

    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String prettyPrint() {
        return "{" + model + "\t" + color + "\t" + year +"}";
    }
}
