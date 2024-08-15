
public class Encap{

   private int arr[][];

public Encap(int[][] arr){

   this.arr = arr;

}

public void populate(java.util.Scanner sc){

   for(int i = 0; i < arr.length; i++){
    for(int j = 0; j < arr.length; j++){
    System.out.print("["+i+"]" + " [" + j +"]: ");
    arr[i][j] = sc.nextInt();
    
    }
   
   }

}

public void print(){

   System.out.print("Printed Array: \n");
   for(int i = 0; i < arr.length; i++){
    for(int j = 0; j < arr.length; j++){
    System.out.print(arr[i][j] + " ");
  
    }
   System.out.println();
   }

}

public void Odd(){
int counter = 0;
int sum = 0;
   System.out.print("Odd Numbers are: ");
   for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr.length; j++){
      
      if(arr[i][j] % 2 != 0){
      System.out.print(arr[i][j] + " ");
      counter++;
      sum += arr[i][j];
      }
       
      }
   }
   System.out.print("\nCounter: "+ counter);

   System.out.print("\nSum: " + sum);

}

public void Even(){
int counter = 0;
int sum = 0;
   System.out.print("\nEven Numbers are: ");
   for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr.length; j++){
      
      if(arr[i][j] % 2 == 0){
      System.out.print(arr[i][j] + " ");
      counter++;
      sum += arr[i][j];
      }
       
      }
   }
   System.out.print("\nCounter: "+ counter);

   System.out.print("\nSum: " + sum);

}

}