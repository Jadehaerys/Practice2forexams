import java.util.*;


public class PracticalBatch1{
            public static void main(String [] args){

                Scanner sc = new Scanner(System.in);


                String prod[][] = new String[5][2];

                Backbonepractical1 b = new Backbonepractical1(prod);

                b.populate(sc);
                b.Display();
                b.Search(sc);

            }
}