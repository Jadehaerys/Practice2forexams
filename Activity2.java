import java.util.*;



public class Activity2{
   public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      int choice;
      ArrayList<String> emp = new ArrayList<>();
      
   do{     
      System.out.print("\n------Company Manager-----\n");
      System.out.println("-1. Add New Employee-");
      System.out.println("-2.  Search an Employee  -");
      System.out.println("-3.  Update Employee  -");
      System.out.println("-4.  Delete an Employee -");
      System.out.println("-5.  Display All Employees -");
      System.out.println("-6.  Exiting Program.... -");
         choice = sc.nextInt();
         sc.nextLine();
      

   
   switch(choice){
      
      case 1: 
      
         System.out.print("Enter new Employee: ");
         String name = sc.nextLine();
         emp.add(name);
         break;
         
      case 2: 
      
         System.out.print("Find a name: ");
         String nameSearch = sc.nextLine();
         boolean contained = emp.contains(nameSearch);
         
         
         if(contained == true){
         System.out.print("Name Found at Index: " + emp.indexOf(nameSearch));
        
         }
         else{
         System.out.print("Name Not Found");
         }
         break;
         
      case 3:  
         System.out.print("What Employee to Update: ");
         int placement = sc.nextInt();
         sc.nextLine();
         System.out.print("Name of Updated Employee: ");
         String nameSet = sc.nextLine();
         emp.set(placement, nameSet);
      break;
      
      case 4:    
      for(int i = 0; i < emp.size(); i++ ){
         System.out.print("[" + i + "]: " + emp.get(i) + " ");
     }   
         System.out.print("Which Employee to Remove: ");
         int removed = sc.nextInt();
         emp.remove(removed);
      break;
      
      case 5:
         for(int i = 0; i < emp.size() - 1; i++){
            for(int j = 0; j < emp.size() - i -1; j++){
              
               if(emp.get(j).toUpperCase().compareTo(emp.get(j+1).toUpperCase()) > 0){
               String temp = emp.get(j);
               emp.set(j, emp.get(j+1));
                emp.set(j+1, temp);
              
           }
         }
         
         }
         System.out.print("Employees are: ");
         for(String employee: emp){
           
            System.out.print(employee + " ");
            
         }
      break;
    
      case 6: System.out.print("Exiting Program");
      break;
      
      }}while(choice != 6);
   
   }

}