public class Limerick extends Poem{

   private String title;
   
   public Limerick(String title){
   super("Limerick", 5);
   this.title = title;

   
   }
   
  public String getTitle(){
  
   return this.title;
  
  }

   public void Display(){
    
      System.out.println("The title is " + getTitle());
      System.out.println("The Name is " + getName());
      System.out.println("The number of lines of a Limerick is " +  getNumlines());
   }

}