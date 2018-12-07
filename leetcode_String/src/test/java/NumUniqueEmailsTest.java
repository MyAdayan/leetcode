import org.junit.Test;

public class NumUniqueEmailsTest {

    @Test
    public void numUniqueEmails() {
        NumUniqueEmails test_class = new NumUniqueEmails();
        String[] string = {"yuxinzaho+mark@qq.com"};
        System.out.println(test_class.numUniqueEmails(string));
    }
}