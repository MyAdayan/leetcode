import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class FindPath_34 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null){
            return resultList;
        }
        list.add(root.val);

        if (target == 0 && root.left == null && root.right == null){
            resultList.add(new ArrayList<>(list));
        }else{
            FindPath(root.left,target);
            FindPath(root.right,target);
        }
        //每返回上一层一次就要回退一个节点
        list.remove(list.size()-1);
        return resultList;

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode (int val) {
            this.val = val;
        }

    }
}
