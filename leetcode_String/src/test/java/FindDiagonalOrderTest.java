import org.junit.Test;

import static org.junit.Assert.*;

public class FindDiagonalOrderTest {

    @Test
    public void findDiagonalOrder() {
        int[][] array_2D = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        int[] result = null;
        FindDiagonalOrder test_class = new FindDiagonalOrder();
        result = test_class.findDiagonalOrder(array_2D);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}