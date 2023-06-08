package Sparsh;

public class shurb extends Plant {
    private int height;
    private String purpose;

    public shurb(String plantName, String plantType, String lifeSpan, double price, int height, String purpose) {
        super(plantName, plantType, lifeSpan, price);
        this.height = height;
        this.purpose = purpose;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return super.toString() + " Height" + this.height + " Purpose" + this.purpose;
    }
}
