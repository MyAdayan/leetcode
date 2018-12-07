import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public static int numUniqueEmails(String[] emails){
        Set<String> normalized = new HashSet<String>();
        for (String email : emails){
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            normalized.add(local[0].replace(".","") + "@" + parts[1]);
        }
        System.out.println(normalized);
        return normalized.size();
    }
}
