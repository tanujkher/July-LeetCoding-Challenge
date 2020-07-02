import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class binary_tree_level_order_traversal_II {
    public static void main(String[] args) {
        System.out.println("Simple hashmap solution");
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class tree {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        getLevelOrder(root, map, 0);
        List<List<Integer>> ans = new ArrayList<>();
        for (int val : map.keySet()) {
            ans.add(0, map.get(val));
        }
        return ans;
    }

    private void getLevelOrder(TreeNode node, HashMap<Integer, List<Integer>> map, int i) {
        if (node == null) {
            return;
        }
        if (map.containsKey(i)) {
            map.get(i).add(node.val);
        } else {
            List<Integer> bans = new ArrayList<>();
            bans.add(node.val);
            map.put(i, bans);
        }
        getLevelOrder(node.left, map, i + 1);
        getLevelOrder(node.right, map, i + 1);
    }
}