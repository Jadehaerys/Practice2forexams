import java.util.*;

public class insertionSort{
    public static void main(String [] args)
    {


        int [] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.print("Populate the array: ");
        for(int i = 0; i <= 4; i++){
            
        arr[i] = sc.nextInt();

        }

        encapInsertion e = new encapInsertion(arr);

        e.insertionsort();
    }
}