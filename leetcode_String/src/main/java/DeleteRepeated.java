import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author yuxinzhao
 */

public class DeleteRepeated {

    private String str;
    private TreeSet<String> noReapted;

    public DeleteRepeated(){
        Scanner in = new Scanner(System.in);

        System.out.print("����һ���ַ�����");
        str = in.nextLine();

        noReapted = new TreeSet<>();
    }

    public void removeRepeated(){
        for (int i = 0; i < str.length(); i++) {
            noReapted.add(""+str.charAt(i));
            //str.charAt(i)���ص���char�ͣ������ȼ�һ�������ո�ת����String��
            //TreeSet�����ܱ�֤�ظ��Ĳ����룬��������
        }

        str = "";
        for (String index:noReapted){
            str += index;
        }

        //���
        System.out.println(str);

    }

    public static void main(String[] args) {
        DeleteRepeated dr = new DeleteRepeated();
        dr.removeRepeated();
    }

}
