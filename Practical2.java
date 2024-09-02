import java.util.*;

public class Practical2{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many Departments: ");
        int row  = sc.nextInt();

        System.out.print("Enter how many staffs: ");
        int col = sc.nextInt();
        sc.nextLine();

        String[][] depts = new String [row][col + 1];
        Backbonepractical2 v = new Backbonepractical2(depts);

        v.populate(sc);
        v.Search(sc);

        }

    }