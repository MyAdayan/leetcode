import org.junit.Test;

public class SortQuickSortTest {

    @Test
    public void quickSort() {
        int[] arr = {1,3,6,8,4,0,9,2,5,7};
        int left = 0;
        int right = arr.length-1;
        Sort_QuickSort Qs = new Sort_QuickSort();
        int[] result = Qs.quickSort(arr,left,right);
        for (int number: result){
            System.out.println(number);
        }

    }
}