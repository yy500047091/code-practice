package practice;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrderTraversal {
    public static List<Integer> levelOrderTraversal(TreeNode root) {
        List<Integer> levelOrder = new ArrayList<>();
        if (root == null) {
            return levelOrder;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, List<Integer>> levelMap = new HashMap<>();

        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            levelMap.put(level, currentLevel);
            level++;
        }

        // Convert the HashMap to a single level-order list
        for (int i = 0; i < level; i++) {
            levelOrder.addAll(levelMap.get(i));
        }

        return levelOrder;
    }

    public static void main(String[] args) {
        // Example binary tree: [1, 2, 3, 4, 5, 6, 7]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> result = levelOrderTraversal(root);
        System.out.println(result); // Output: [1, 2, 3, 4, 5, 6, 7]
    }
}
