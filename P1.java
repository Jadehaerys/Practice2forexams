import java.util.*;


public class P1{
    public static void main(String [] elton){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.print("[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 4; i >= 0; i--){
            System.out.print(arr[i] + " ");
            
        }




    }

}