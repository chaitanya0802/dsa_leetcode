public class QuickSort {


    public void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivot = arr[high];

            

        }
    }
    

    public static void main(String[] args){
        QuickSort o = new QuickSort();

        int[] arr = {4,7,2,85,77,62,41,5,12,7,33,4,54,1,9,4};
        int low = 0;
        int high = arr.length - 1; 
        o.quickSort(arr, low, high);

        for (int val : arr) {
            System.out.print(val + " ");  
        }
    }
}
