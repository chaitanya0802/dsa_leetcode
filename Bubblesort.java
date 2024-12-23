public class Bubblesort {

    public void sort(int[] arr){
        for(int i = 0; i<arr.length - 1; i++){

            for (int j = 0;  j < arr.length - i -1; j++ ){

                //swap 
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        for (int val : arr) {
            System.out.print(val + ", ");
        }
    }

    public static void main(String[] args){
        Bubblesort o = new Bubblesort();

        o.sort(new int[]{4,7,2,85,77,62,41,5,12,7,33,4,54,1,9,4});
    }
}
