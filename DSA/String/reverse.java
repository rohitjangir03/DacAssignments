package String;

public class reverse {
    public static void reverseString(int index, String abc){
         if(index==0){
            System.out.println(abc.charAt(index));
            return;
         }
         System.out.print(abc.charAt(index));
         reverseString(index-1, abc);

    }
    public static void main(String[] args) {
        String abc = "rohit is a good boy";
        reverseString(abc.length()-1, abc);
    }
}
