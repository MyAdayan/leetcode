public class findDuplicateFromArray2 {
    public int getDuplication(int[] numbers) {
        if (numbers == null || numbers.length < 1) {
            return -1;
        }

        int start = 1;
        int end = numbers.length - 1;
        while (end >= start) {
            int middle = start + ((end - start) >> 1);

            //调用log n次
            int count = countRange(numbers, start, middle);
            if (start == end) {
                if (count > 1) {
                    return start;
                }
                break;
            }else{
                //无法找出所有的重复数字
                if (count > (middle - start) + 1){
                    end = middle;
                }else{
                    start = middle + 1;
                }
            }
        }
        return -1;
    }

    private int countRange(int[] numbers,int start,int end){
        if (numbers == null){
            return 0;
        }
        int count = 0;
        for (int e : numbers){
            if (e > start && e <= end){
                ++count;
            }
        }
        return count;
    }
}
