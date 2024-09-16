public class Haiku extends Poem{

   private String title;
   
   public Haiku(String title){
   super("Haiku", 3);
   this.title = title;

   
   }
   
  public String getTitle(){
  
   return this.title;
  
  }

   public void Display(){
    
      System.out.println("The title is " + getTitle());
      System.out.println("The Name is " + getName());
      System.out.println("The number of lines of a Haiku is " +  getNumlines());
   }

}