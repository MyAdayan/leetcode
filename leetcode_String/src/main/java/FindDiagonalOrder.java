public class FindDiagonalOrder {

    /**
     *
     Last Edit: October 19, 2018 2:11 AM

     I don't think this is a hard problem. It is easy to figure out the walk pattern. Anyway...
     Walk patterns:

     If out of bottom border (row >= m) then row = m - 1; col += 2; change walk direction.
     if out of right border (col >= n) then col = n - 1; row += 2; change walk direction.
     if out of top border (row < 0) then row = 0; change walk direction.
     if out of left border (col < 0) then col = 0; change walk direction.
     Otherwise, just go along with the current direction.
     Time complexity: O(m * n), m = number of rows, n = number of columns.
     Space complexity: O(1).
     */

    public int[] findDiagonalOrder(int[][] matrix) {
        if (check(matrix)) {
            return new int[0];
        }

        int m = matrix.length, n = matrix[0].length;

        int[] result = new int[m * n];
        int row = 0, col = 0, d = 0;
        //通过画图可以看出来，行走的方向有两个，一个是右上方，一个是左下方。即下面的两个方向。
        int[][] dirs = {
                {-1, 1},
                {1, -1}};
        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];
            //第一次是往右上方走。d=0，右上方。d=1，左下方。
            row += dirs[d][0];
            col += dirs[d][1];

            //下面是分别处理四种越界的方式。
            if (row >= m) {
                row = m - 1;
                col += 2;
                d = 1 - d;
            }
            if (col >= n) {
                col = n - 1;
                row += 2;
                d = 1 - d;
            }
            if (row < 0) {
                row = 0;
                d = 1 - d;
            }
            if (col < 0) {
                col = 0;
                d = 1 - d;
            }
        }

        return result;
    }

    private boolean check(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return true;
        }
        return false;
    }
}
