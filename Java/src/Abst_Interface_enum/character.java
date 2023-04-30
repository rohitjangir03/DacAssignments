package Abst_Interface_enum;

public class character extends abst {
    private int height ;
    private String color;

    public character(){
        super();
        this.height=1;
        this.color="green";
    }
    public  character(int plantID, String plantName, String plantType,int height,String color){
        super(plantID, plantName, plantType);
        this.height=height;
        this.color=color;
    }

    public void lifeSpan(){
        System.out.println("LifeSpan of these are from 50-70 Years");
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
            " height='" + this.height + "'" +
            ", color='" + this.color + "'" +
            "}";
    }

}
