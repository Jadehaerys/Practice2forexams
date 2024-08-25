import java.util.*;

public class P5{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int[][] arr = new int[size][size];
        int[][] arr2 = new int[size][size];
       

        System.out.print("Populate Array 1\n");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print("[" + i + "]" + "[" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println();

        System.out.println();
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                arr2[i][j] = arr[i][j] * arr[i][j];
            }
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                System.out.print("[" + i + "]" + "[" + j + "]: " + arr2[i][j] + " ");
            }
            System.out.println();
        }


    }


}