public class bubblesortb{

    private String[] arr;
    private int size;
 
 
 
 public bubblesortb(String[] arr, int size){
 
    this.arr = arr;
    this.size = size;
 
 }
 
 public String[] getArr(){
    
    return this.arr;
 }
 
 public int getSize(){
 
    return this.size;
 
 }
 
 public void display(java.util.Scanner sc){
    
    
    for(int i = 0; i < size; i++){
    
    getArr()[i] = sc.next();
    
    }
 
    for(int i = 0; i < getArr().length; i++){
       for(int j = 0; j < getArr().length - i - 1; j++){
       
       if(getArr()[j].charAt(0) > getArr()[j+1].charAt(0)){
       String container = getArr()[j];
       getArr()[j] = getArr()[j+1];
       getArr()[j+1] = container;
       
       
       }
       
       }
         
    }
     
       System.out.print("Sorted Names: ");
       for(int i = 0; i < getSize(); i++){
       
          System.out.print(getArr()[i] + " ");
       
       }
 
 
 }
 
 
 }