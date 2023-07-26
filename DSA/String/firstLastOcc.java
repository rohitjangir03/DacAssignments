package String;

public class firstLastOcc {
    public static void main(String[] args) {
     String str = "abcadaserfsasadasdadfdads";
     int n = str.length();
     char element = 'a';
     for(int i =0;i<n-1;i++){
        if(str.charAt(i)==element){
            System.out.println("firstOcur "+i);
            break;
        }
        System.out.println("element not found");
     }
     for(int i=n-1;i>-1;i--){
        if(str.charAt(i)==element){
            System.out.println("LastOcur "+i);
            break;
        }
     }
    }
}
