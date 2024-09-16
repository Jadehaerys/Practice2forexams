import java.util.*;


public class DemoPoems{

   public static void main(String [] args){
   
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter Title for Couplet: ");
   String title1 = sc.nextLine();
   
    System.out.print("Enter Title for Limerick: ");
   String title2 = sc.nextLine();
   
    System.out.print("Enter Title for Haiku: ");
   String title3 = sc.nextLine();
   System.out.println();
   
   Couplet c = new Couplet(title1);
   Limerick l = new Limerick(title2);
   Haiku h = new Haiku(title3);
   
   c.Display();
   System.out.println();
   l.Display();
    System.out.println();
   h.Display();
    System.out.println();
   
   
   }

}