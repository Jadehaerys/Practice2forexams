import java.util.*;
public class MethodsPractice{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of the Array: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        for(int i = 0; i < arr1.length; i++){
            
            System.out.print("[" + i + "]: ");
            arr1[i] = sc.nextInt();
        }

        Arrays.sort(arr1);

        System.out.print("Enter Number to find: ");
        int search = sc.nextInt();

        int index = Arrays.binarySearch(arr1, search);

        System.out.print(search + " is found at " + index);


        ArrayList<String> students = new ArrayList<>();

        System.out.println("\nEnter how many Students to add: ");
        int stdAdd = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < stdAdd; i++){
            System.out.print("\nEnter Name of Student: ");
            String name = sc.nextLine();

            students.add(name);
        }

        System.out.println("Array: " + students);



        
    }

}