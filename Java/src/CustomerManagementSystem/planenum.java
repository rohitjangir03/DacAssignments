package CustomerManagementSystem;

public enum planenum {
   //name with cost
    SILVER(1000), GOLD(2000) ,DIAMOND(5000), PLATINUM(10000);

   private double cost;

   private planenum(double cost) {
       //super(name,ordinal) : this super will be called implicitly java.lang.Enum
       this.cost = cost;
   }
   //getter
   public  double getCost() {
       return this.cost;
   }
   //toString
   @Override
   public String toString() {
       return name() + " @" + this.cost;
   }
}