package Revision;

public class Box {
    private int a;
    private int b;
    private int c;
    public Box(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
   

    @Override
    public String toString() {
        return "{" +
            " a='" + a + "'" +
            ", b='" + b + "'" +
            ", c='" + c + "'" +
            "}";
    }

}
