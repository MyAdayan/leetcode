import java.util.Stack;

public class 第九题_用两个栈实现队列 {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int node){
        in.push(node);
    }

    public int pop() throws Exception{
        if (out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if (out.isEmpty()){
            System.out.println("queue is empty");
        }
        return out.pop();
    }

}
