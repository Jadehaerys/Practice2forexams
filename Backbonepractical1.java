

public class Backbonepractical1{

    private String dept[][];
    private String search;
   
    public Backbonepractical1(String dept[][]){

        this.dept = dept;
    }

    public void populate(java.util.Scanner sc){

        for(int i = 0; i < this.dept.length; i++){
            System.out.print("Enter Product: ");
            this.dept[i][0] = sc.nextLine();

            System.out.print("Enter Price: ");
            this.dept[i][1] = sc.nextLine();
        }
    }

    public void Display(){
       
        for(int i = 0; i < this.dept.length; i++ ){

            System.out.println("Product Name: " + this.dept[i][0] + " Price: " + this.dept[i][1]);

        }

        System.out.println();
    }
    

    public void Search(java.util.Scanner sc){
        System.out.print("How many do you Want to Order?: ");
        int limiter = sc.nextInt();
        sc.nextLine();
        int key = 0;
        int sum = 0;
        do{
            System.out.print("Enter Product to search: ");
            search = sc.nextLine();
      
        

        for(int i = 0; i < this.dept.length; i++ ){

        
        
            if (this.dept[i][0].equals(search)){


            
                sum += Integer.parseInt(this.dept[i][1]);
                key++;


            }

        }
           
    }while(key < limiter);
    System.out.println("The total Price is: " + sum);
}

    

}