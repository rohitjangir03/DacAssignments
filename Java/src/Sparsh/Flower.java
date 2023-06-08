package Sparsh;

public class Flower extends Plant {
    private String color;
    private String smell;

    public Flower(String plantName, String plantType, String lifeSpan, double price, String color, String smell) {
        super(plantName, plantType, lifeSpan, price);
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return this.smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return super.toString() + " Color:" + this.color + " Smell:" + this.smell;
    }
}