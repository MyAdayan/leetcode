import org.junit.Test;

import static org.junit.Assert.*;

public class ToLowerCaseTest {

    @Test
    public void toLowerCase() {
        ToLowerCase test_class = new ToLowerCase();
        String string = "AbCDe";
        System.out.println(test_class.toLowerCase(string));

    }
}