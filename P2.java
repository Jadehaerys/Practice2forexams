import java.util.*;


public class P2{
    public static void main(String [] elton){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();

        int [] arr = new int [size];

        for(int i = 0; i < arr.length; i++){
            System.out.print("[" + i + "]: ");
            arr[i] = sc.nextInt();

        }

        int max = arr[0];
        int min = arr[0];

        for(int number : arr){

            if(number > max){
                max = number;
            }
            else if(number < min){
               min = number;
            }
        }

        System.out.print("Max is: " + max);
        System.out.print("\nMin is: " + min);


    }
}