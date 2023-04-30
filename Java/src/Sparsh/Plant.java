package Sparsh;

public class Plant {
    private int plantID;
    private String plantName;
    private String plantType;
    private String lifeSpan;
    private double price;
    private static int counter;

    public static int plantId() {
        counter = 1001;
        return counter++;
    }

    public Plant(String plantName, String plantType, String lifeSpan, double price) {
        this.plantID=plantId();
        this.plantName = plantName;
        this.plantType = plantType;
        this.lifeSpan = lifeSpan;
        this.price = price;
    }

    public String getPlantName() {
        return this.plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getPlantType() {
        return this.plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public String getLifeSpan() {
        return this.lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "plantID:" + this.plantID +
                " plantName='" + getPlantName() + "'" +
                ", plantType='" + getPlantType() + "'" +
                ", lifeSpan='" + getLifeSpan() + "'" +
                ", price='" + getPrice() + "'";
    }

}
