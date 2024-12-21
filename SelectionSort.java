public class SelectionSort {
    public void sort(int[] array){
        for (int i=0; i<array.length;i++){
            for (int j = i+1; j<array.length; j++){
                if (array[j]<array[i]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int val : array) {
            System.out.print(val + ", ");
        }
    }
    public static void main(String[] args){
        SelectionSort o = new SelectionSort();
        o.sort(new int[]{34,69,57,373,25,6,78,866});
    }
}
