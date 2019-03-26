public class Sort_QuickSort {

    public int[] quickSort(int[] arr,int left,int right){
        if (left < right){
            int partitionIndex = partition(arr,left,right);
            quickSort(arr,left,partitionIndex - 1);
            quickSort(arr,partitionIndex + 1,right);
        }
        return arr;
    }

    private int partition(int[] arr,int left,int right){
        //�趨��׼ֵ��pivot��
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index - 1);
        return index - 1;
    }

    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
