package inner_class;

public class Bank {
    private static int accID;
    private String name;
    private String email;
    private String address;
    private locker Locker;
   
    static int getAccID(){
        accID=1000;
        accID++;
        return accID;
    }

    public Bank(String name,String email,String address){
        Bank.getAccID();
        this.name=name;
        this.email=email;
        this.address=address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
     
    @Override
    public String toString() {
        if(Locker == null)
        return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
        else{
            return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", address='" + getAddress() + "'" +Locker+
            "}"; 
        }
       
    }
    public void assignLocker(int duration) {
        Locker = new locker(duration);
        Locker.charges();
    }
 private  class locker{
       //private static int lockerID;
       private int duration;
       
     /*   void lid(){
        lockerID=100;

       } */
       locker(int duration){
        this.duration=duration;
       }
       public int charges(){
          return this.duration*300;
       }
       
      public String toString(){
        return "duration"+this.duration;
      }
    }

}
