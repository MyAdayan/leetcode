public class 第3题_数组中重复的数字 {

    public static void main(String[] args) {
        int[] arr = {2,3,1,0,2,5};
        int[] duplication = new int[arr.length];
        boolean bool = duplicate(arr,arr.length,duplication);
        System.out.println(bool);
        for (int i = 0; i < duplication.length; i++) {
            System.out.println(duplication[i]);
        }
    }

    public static boolean duplicate(int[] nums,int length,int[] duplication){

        if (nums == null || length <= 0){
            return false;
        }

        for (int i = 0; i < length; i++) {
            while( nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums,i,nums[i]);
            }
        }
        return false;
    }

    private static void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
