
import java.util.*;


public class Act3{
    public static void main(String [] john){
        int size;
        Scanner sc  = new Scanner(System.in);
        while(true){

   
        System.out.print("Enter how many departments must be atleast 5: ");
         size = sc.nextInt();
            sc.nextLine();
        if(size >= 5){
         break;
        }
    
        }

        String [][] arr = new String [size][2];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[j].length; j++){
                if(j == 0){
                    System.out.print("Enter Department: ");
                    arr[i][j] = sc.nextLine();
                }

                else if(j > 0){
                    System.out.print("Enter Supervisor Name: ");
                    arr[i][j] = sc.nextLine();

                }



            }
        }

        
        int key = 0;
        do{
            System.out.print("Enter deparment name to search: ");
        String departmentName = sc.nextLine();
            boolean found = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[j].length; j++){

                if(arr[i][j].equals(departmentName)){
                    System.out.print("Supervisor Name: " + arr[i][j+1]);

                    found = true;
                    key = 1;
                    break;
                }

             

            }
            if(found){
                break;
            }
        }
      
        
    }while(key <= 0);

        
sc.close();
}
}