import sun.reflect.generics.tree.Tree;

public class 第8题_二叉树的下一个节点 {

    public static void main(String[] args) {

    }

    public TreeLinkNode GetNext(TreeLinkNode pNode){

        //如果一个节点的右子树不为空，那么该节点的下一个节点是有子树的最左节点
        if (pNode.right != null){
            TreeLinkNode node = pNode.right;
            while(node.left != null){
                node = node.left;
            }
            return node;
        }else{
            //否则，向上找第一个左连接指向的树包含该节点的祖先节点
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