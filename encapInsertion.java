public class encapInsertion {

    private int[] arr;

    public encapInsertion(int[] arr) {

        this.arr = arr;

    }

    public int[] getArr() {
        return this.arr;
    }

public void insertionsort(){
    int a = 1;
    while(a < getArr().length){

        int temp = getArr()[a];
        int b = a - 1;

        while(b >= 0 && getArr()[b] > temp){
            getArr()[b+1] = getArr()[b];
            --b;

        }
        getArr()[b + 1] = temp;
        ++a;


    }
        System.out.print("Sorted Array: ");
    for(int i = 0; i <= 4; i++){
        System.out.print(getArr()[i] + " ");
    }


}

}