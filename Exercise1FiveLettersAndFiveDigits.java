import java.util.*;


public class Exercise1FiveLettersAndFiveDigits{

  public static void main(String [] args){
  
  
   Scanner sc = new Scanner(System.in);
   int Lettercount = 0;
   int Digitcount = 0;
   String n;
   
  do { 
   System.out.print("Enter a code that has atleast 5 letters and 5 digits: ");
   n = sc.nextLine();
   
   FiveLettersDigits f = new FiveLettersDigits(n);
   
   f.Display(Digitcount,Lettercount);
   
   if(f.isValid()){
   
   break;
   
   }
  } while (true);
  


  }
   
}