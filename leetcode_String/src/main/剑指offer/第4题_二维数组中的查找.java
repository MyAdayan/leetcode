public class 第4题_二维数组中的查找 {

    public static void main(String[] args) {
        int[][] arr2 = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        boolean result = Find(5,arr2);
        System.out.println(result);
    }

    public static boolean Find(int target,int[][] matrix){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int r=0;
        int c=cols -1;

        while(r <= rows -1 && c>=0){
            if (target == matrix[r][c]){
                return true;
            }else if (target > matrix[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }

}
