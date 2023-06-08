package Abst_Interface_enum;

public abstract class abst {
    private int plantID;
    private String plantName;
    private String plantType;
    private static int counter;
    static void pid(){
        counter=1000;
        counter++;
    }

    public abst() {
        this.plantID = 100;
        this.plantName = "Money";
        this.plantType = "Herb";
    }

    public abst(int plantID, String plantName, String plantType) {
        this.plantID = counter;
        this.plantName = plantName;
        this.plantType = plantType;
    }

    public abst getDetails() {
        return this;
    }

    public abstract void lifeSpan();

    @Override
    public String toString() {
        return "PlantID=" + this.plantID + " plantName='" + this.plantName + "'" +
                ", plantType='" + this.plantType + "'";
    }

}
