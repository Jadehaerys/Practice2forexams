import java.util.*;


public class GeometricFigure{

   public static void main(String [] elton){
   
   
      Scanner sc = new Scanner(System.in);
      String choice;
      
      System.out.print("Enter how many Shapes: ");
      int size = sc.nextInt();
      sc.nextLine();
      
      Shape[] s = new Shape[size];
      
      for(int i = 0; i < size; i++){
         
         System.out.print("Enter Figure Type: ");
         choice = sc.nextLine();
      
         if(choice.equalsIgnoreCase("Square")){
         s[i] = new Square();
         System.out.print("Enter the value of the Sides: ");
         s[i].width = sc.nextDouble();
         s[i].figureType = "Square";
         sc.nextLine();          
         
         
         
         }
         
         else if(choice.equalsIgnoreCase("Triangle")){
         
         s[i] = new Triangle();
         System.out.print("Enter the value of the Width: ");
         s[i].width = sc.nextDouble();
         System.out.print("Enter the value of the Heigth: ");
         s[i].height = sc.nextDouble();
         s[i].figureType = "Triangle";
         sc.nextLine(); 
         
         
         
         }
      
      
      }
      
      for(int i = 0; i < size; i++){
      
      if(s[i].figureType.equalsIgnoreCase("Square")){
      
      System.out.print("The Figure Type is " + s[i].figureType);
      System.out.printf("\nThe Sides of the square is %.2f\n", s[i].width);
      System.out.printf("The area of the Square is %.2f\n", s[i].CalculateArea());
      System.out.println();
      
      
      }
      
      else if(s[i].figureType.equalsIgnoreCase("Triangle")){
      
       System.out.print("The Figure Type is " + s[i].figureType);
      System.out.printf("\nThe width of the triangle is %.2f\n", s[i].width);
      System.out.printf("The height of the triangle is %.2f\n", s[i].height);
      System.out.printf("The area of the Square is %.2f\n", s[i].CalculateArea());
      System.out.println();

      
      
      }
      
      
      
      }
      
      
   
   
   }

}