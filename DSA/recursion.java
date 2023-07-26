public class recursion {
     public static int sumN(int n){
         if(n==0)
          return 0;
        int sum = n + sumN(n-1);
        return sum;
     }
    public static void main(String[] args) {
      System.out.println(sumN(5));
    }
}
