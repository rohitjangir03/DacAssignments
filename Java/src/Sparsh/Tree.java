package Sparsh;

public class Tree extends Plant {
    private String leafShape;
    private String soilType;

    public Tree(String plantName, String plantType, String lifeSpan, double price, String leafShape, String soilType) {
        super(plantName, plantType, lifeSpan, price);
        this.leafShape = leafShape;
        this.soilType = soilType;
    }

    public String getLeafShape() {
        return this.leafShape;
    }

    public void setLeafShape(String leafShape) {
        this.leafShape = leafShape;
    }

    public String getSoilType() {
        return this.soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    @Override
    public String toString() {
        return super.toString() + " leafShape:" + this.leafShape + " SoilType" + this.soilType;
    }
}