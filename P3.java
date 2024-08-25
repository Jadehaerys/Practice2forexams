import java.util.*;

public class P3{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            System.out.print("[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to Count: ");
        int search = sc.nextInt();
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
      
            if(arr[i] == search){

           counter++;
           
            }


        }

        System.out.print(search + " occurs " + counter + " times");


    }
}