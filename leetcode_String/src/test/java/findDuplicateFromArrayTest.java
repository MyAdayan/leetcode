import org.junit.Test;

import static org.junit.Assert.*;

public class findDuplicateFromArrayTest {

    @Test
    public void duplicate() {
        int[] array = {2,1,4,3,6,5,2};
        int length = array.length;
        int[] duplication = new int[1];
        findDuplicateFromArray findDuplicateFromArray = new findDuplicateFromArray();
        boolean duplicate = findDuplicateFromArray.duplicate(array, length, duplication);
        System.out.println(duplicate);

        int i = -8;
        int result= i>>>1;
        System.out.println(result);

    }
}