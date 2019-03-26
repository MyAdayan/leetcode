import java.util.Scanner;

public class Å£¿ÍÍø2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i%j>=k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
