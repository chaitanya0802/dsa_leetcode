public class QuickSort {

    public void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivot = arr[high];
            int i = low -1;

            for (int j = low; j <= high - 1 ; j++){
                if (arr[j] < pivot){
                    //increment i
                    i++;

                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            //adjust pivot 
            int t = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = t;

            // now i+1 is going to be pivot
            //call recursevely for divided parts 
            quickSort(arr, low, i+1-1);
            quickSort(arr, i+1+1, high);

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
