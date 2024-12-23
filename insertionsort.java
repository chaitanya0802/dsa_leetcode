public class insertionsort {

    private void sort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            
        }

        for (int val : arr) {
            System.out.print(val + ", ");
        }
    }

    public static void main(String[] args){
        insertionsort o = new insertionsort();
        o.sort(new int[]{4,5,8,6,77,2,44,1,55,3,8,1});
    }
}
