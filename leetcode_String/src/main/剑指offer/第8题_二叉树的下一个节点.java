import sun.reflect.generics.tree.Tree;

public class ��8��_����������һ���ڵ� {

    public static void main(String[] args) {

    }

    public TreeLinkNode GetNext(TreeLinkNode pNode){

        //���һ���ڵ����������Ϊ�գ���ô�ýڵ����һ���ڵ���������������ڵ�
        if (pNode.right != null){
            TreeLinkNode node = pNode.right;
            while(node.left != null){
                node = node.left;
            }
            return node;
        }else{
            //���������ҵ�һ��������ָ����������ýڵ�����Ƚڵ�
            while(pNode.next != null){
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode){
                    return parent;
                }
                pNode = pNode.next;
            }
        }

        return null;
    }

}

class TreeLinkNode{
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
    TreeLinkNode(int val){
        this.val = val;
    }

}