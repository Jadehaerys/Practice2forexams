public class Couplet extends Poem{

   private String title;
   
   public Couplet(String title){
   super("Couplet", 2);
   this.title = title;

   
   }
   
  public String getTitle(){
  
   return this.title;
  
  }

   public void Display(){
    
      System.out.println("The title is " + getTitle());
      System.out.println("The Name is " + getName());
      System.out.println("The number of lines of a Couplet is " +  getNumlines());
   }

}