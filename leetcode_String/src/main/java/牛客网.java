

import java.util.Scanner;

public class ţ���� {
    public static void main(String[] args) {

        char result = 'N';
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int count = Integer.parseInt(in);
        String directions = sc.nextLine();
        char[] chars = directions.toCharArray();

        //N��ʾ����S��ʾ�ϣ�E��ʾ����W��ʾ����L��ʾ����ת��R��ʾ����ת��
        for (int i = 0; i < chars.length; i++) {
            if ( chars[i]== 'L' && result == 'N'){
                result = 'W';
                continue;
            }
            if ( chars[i]== 'R' && result == 'N'){
                result = 'E';
                continue;
            }
            if ( chars[i]== 'L' && result == 'W'){
                result = 'S';
                continue;
            }
            if ( chars[i]== 'R' && result == 'W'){
                result = 'N';
                continue;
            }
            if ( chars[i]== 'L' && result == 'S'){
                result = 'E';
                continue;
            }
            if ( chars[i]== 'R' && result == 'S'){
                result = 'W';
                continue;
            }
            if ( chars[i]== 'L' && result == 'E'){
                result = 'N';
                continue;
            }
            if ( chars[i]== 'R' && result == 'E'){
                result = 'S';
                continue;
            }
        }
        System.out.println(result);
    }
}
