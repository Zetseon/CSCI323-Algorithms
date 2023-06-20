import java.lang.reflect.Array;

public class Main {
    static int[] a = {8,6,4,3,1,2,5,7};

    public static void main(String[] args) {
        Heapsort.heapSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }


    }
}



