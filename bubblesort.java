import java.util.*;

public class bubblesort{

   public static void main(String [] args){
   
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Size of the array: ");
      int size = sc.nextInt();
      
      String[] arr = new String[size];
      
      
      bubblesortb b = new bubblesortb(arr, size);
      
      b.display(sc);
      
      
   
   }

}