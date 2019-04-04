import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Stack;

public class ��6��_��β��ͷ��ӡ���� {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        //ͷ�巨������������
        ListNode head = new ListNode(-1);
        while (listNode != null){
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }

        //����ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while(head != null){
            ret.add(head.val);
            head = head.next;
        }

        return ret;
    }

    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode){

        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> ret = new ArrayList<>();
        while(!stack.isEmpty()){
            ret.add(stack.pop());
        }
        return ret;
    }



}
