package Sparsh;

public class Herb extends Plant {
    private String medicalUse;
    private String foundLocation;

    public Herb(String plantName,String plantType, String lifeSpan,double price, String medicalUse,String foundLocation){
          super(plantName,plantType,lifeSpan,price);
          this.medicalUse=medicalUse;
          this.foundLocation=foundLocation;
    }
    @Override
    public String toString(){
        return super.toString()+" medicalUse:"+this.medicalUse+" foundLocation:"+this.foundLocation;
    }
}
