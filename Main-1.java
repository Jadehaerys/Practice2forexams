import java.util.*;

public class Main{
   public static void main(String [] args){
      int MaxSize = 10;
      Scanner sc = new Scanner(System.in);
     int row;
      int col;
    while(true){
  
      System.out.print("Enter the size of the array row: ");
       row = sc.nextInt();
      
      System.out.print("Enter the size of the array col: ");
      col = sc.nextInt();
      
      if(row <= 10 && col <= 10){
      
         break;
      } 
      
      }
      int [][] arr = new int [row][col];
     int choice;
      
 do{     
   System.out.print("\n------MENU-----\n");
   System.out.println("-1. POPULATE-");
   System.out.println("-2.  PRINT  -");
   System.out.println("-3.  ODD  -");
   System.out.println("-3.  EVEN  -");
   choice = sc.nextInt();
   
     Encap e = new Encap(arr);
      

   
   switch(choice){
      
      case 1: e.populate(sc);
      break;
      case 2: e.print();
      break;
      case 3: e.Odd(); 
      break;
      case 4: e.Even();
      break;
      default: System.out.print("Exiting Program");
      
      
      }}while(choice != 5);
   
   
      

      
      
      
   }

}

