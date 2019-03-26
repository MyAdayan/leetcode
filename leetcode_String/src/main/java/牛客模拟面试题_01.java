import java.util.Scanner;

public class 牛客模拟面试题_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String now_position = in.nextLine();
        String password = in.nextLine();
        int result = function(length, now_position, password);
        System.out.println(result);

    }

    public static int function(int length, String now_position, String password) {
        char[] chars_now_position = now_position.toCharArray();
        char[] chars_password = password.toCharArray();

        int cha;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int i_position = chars_now_position[i] - '0';
            int i_password = chars_password[i] - '0';

            cha = Math.abs(i_password-i_position);
            if (cha <= 5){
                count += cha;
            }else {
                count += 10 - cha;
            }
        }
        return count;
    }
}
