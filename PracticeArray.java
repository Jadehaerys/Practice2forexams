import java.util.Scanner;

public class PracticeArray {
   public PracticeArray() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of the Array: ");
      int size = sc.nextInt();
      int[][] arr = new int[size][size];
      int[][] arr2 = new int[size][size];
      int[][] arr3 = new int[size][size];
      practicearrayb b = new practicearrayb(arr, arr2, arr3, size);
      b.Display(sc);
   }
}

