public class FiveLettersDigits{

    private String input;
    private boolean isValid;
    
 
    public FiveLettersDigits(String input){
    
       this.input = input;
      
    
    
    
    }
    
    public String getInput(){
    
       return this.input;
    
    }
    public boolean isValid() {
         return this.isValid;
     }
  
    public void Display(int D, int L){
    StringBuilder str = new StringBuilder();
    int Letter = L;
    int Digit = D;
    for(int i = 0; i < getInput().length(); i++){
    char ch = getInput().charAt(i);
    if (Character.isLetter(ch)){
    
    Letter++;
    
    
    
    }
    
    if (Character.isDigit(ch)){
    
    Digit++;
    
    
    
    }
 
    
    
    
    
    }
    
   if (Letter < 5 && Digit < 5) {
    
    System.out.print("Digits and Letters are not more than or equal to 5\n");
    }
    
    else if (Digit < 5){
    System.out.print("Digits are not more than or equal to 5\n");
    }
 
    else if (Letter < 5){
    
    System.out.print("Letters are not more than or equal to 5\n");
    
    }
    else if (Letter >= 5 && Digit >= 5){
    
    System.out.print("Valid input\n");
    this.isValid = true; 
    
    }
    
    
    
    }
 
  
    
   }