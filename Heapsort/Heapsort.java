public class Heapsort {
    static int size = Main.a.length-1;
    public static int[] heapSort(int[] a){
        maxHeap(a); //puts the largest number at the front of the list
        for(int i = size;i >=1; i--){ //Starts from the back of the list
            int temp= a[0];
            a[0]=a[i];
            a[i]=temp; //Switches the first and last number of the list so highest number is at the end
            size = size-1; //reduce the size of the list
            heapify(a,size,0); //heapify to get the largest number at the front
            for (int j = 0; j < size; j++) {
                System.out.print(a[j]+ " ");
            }
            System.out.println();

        }
        return a;
    }
    public static void maxHeap(int[] a){

        for (int i = (size/2); i >=1; i--)
        {
            heapify(a,size, i);
//            System.out.println(a[i]);
        }
    }
    //Takes in array, heap size and index as parameters
    //finds the largest number in the array and swaps it with first number
    public static void heapify(int[] a,int heap, int index){
        int l = 2*index, r = (2*index)+1, largest = index;
        if(l <= heap && a[l] > a[index]){
            largest = l;
        }
        if(r <= heap && a[r] > a[largest]){
            largest = r;
        }
        if(largest != index){
            int lol = a[index];
            a[index]=a[largest];
            a[largest] = lol;
            heapify(a, heap, largest);
        }
    }

}
