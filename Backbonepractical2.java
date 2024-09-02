

public class Backbonepractical2{

    private String [][] arr;




    public Backbonepractical2(String[][] arr){

        this.arr = arr;

    }
    public void populate(java.util.Scanner sc){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[j].length; j++){
                if(j == 0){
            System.out.print("Enter Departments: ");
            arr[i][j] = sc.nextLine();
                }
                else if(j > 0){
            System.out.print("Enter Staffs: ");
            arr[i][j] = sc.nextLine();
        }
        
            }
        }

        System.out.print("\nHere are the List of Departments and their staffs");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[j].length; j++){

                if(j == 0){
                System.out.print("Departments: " + arr[i][j] + "\n");
                }
                else if(j > 0){
                System.out.print("Staffs: " + arr[i][j] + "\n");
                }
                
            }

            System.out.println();

        }



    }

    public void Search(java.util.Scanner sc){


        System.out.print("Search Department to find: ");
        String department = sc.nextLine();
        int key = 0;
    
       
        for(int i = 0; i < arr.length; i++){
            if(arr[i][0].equals(department)){
            for(int j = 0; j < arr[j].length; j++){

                
                
                    if(j == 0){
                    System.out.print("Deparment: " + arr[i][j] + "\n");
                        
                    }
                    else if (j > 0){
                        System.out.print("Staffs: " + arr[i][j] + "\n");
                    }

              
            
                
            }
           
        }
      }
    }


}