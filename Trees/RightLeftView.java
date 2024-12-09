package Trees;


import java.util.ArrayList;
import java.util.List;

// Node structure for the binary tree
class RlNode {
    int data;
    RlNode left;
    RlNode right;

    // Constructor to initialize
    // the node with a value
    RlNode(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class RightLeftView {

    // Function to return the Right view of the binary tree
    public List<Integer> rightsideView(RlNode root) {
        // List to store the result
        List<Integer> res = new ArrayList<>();

        // Call the recursive function
        // to populate the right-side view
        recursionRight(root, 0, res);

        return res;
    }

    // Function to return the Left view of the binary tree
    public List<Integer> leftsideView(RlNode root) {
        // List to store the result
        List<Integer> res = new ArrayList<>();

        // Call the recursive function
        // to populate the left-side view
        recursionLeft(root, 0, res);

        return res;
    }

    // Recursive function to traverse the
    // binary tree and populate the left-side view
    private void recursionLeft(RlNode root, int level, List<Integer> res) {
        // Check if the current node is null
        if (root == null) {
            return;
        }

        // Check if the size of the result list
        // is equal to the current level
        if (res.size() == level) {
            // If equal, add the value of the
            // current node to the result list
            res.add(root.data);
        }

        // Recursively call the function for the
        // left child with an increased level
        recursionLeft(root.left, level + 1, res);

        // Recursively call the function for the
        // right child with an increased level
        recursionLeft(root.right, level + 1, res);
    }

    // Recursive function to traverse the
    // binary tree and populate the right-side view
    private void recursionRight(RlNode root, int level, List<Integer> res) {
        // Check if the current node is null
        if (root == null) {
            return;
        }

        // Check if the size of the result list
        // is equal to the current level
        if (res.size() == level) {
            // If equal, add the value of the
            // current node to the result list
            res.add(root.data);

            // Recursively call the function for the
            // right child with an increased level
            recursionRight(root.right, level + 1, res);

            // Recursively call the function for the
            // left child with an increased level
            recursionRight(root.left, level + 1, res);
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        RlNode root = new RlNode(1);
        root.left = new RlNode(2);
        root.left.left = new RlNode(4);
        root.left.right = new RlNode(10);
        root.left.left.right = new RlNode(5);
        root.left.left.right.right = new RlNode(6);
        root.right = new RlNode(3);
        root.right.right = new RlNode(10);
        root.right.left = new RlNode(9);

        RightLeftView solution = new RightLeftView();

        // Get the Right View traversal
        List<Integer> rightView = solution.rightsideView(root);

        // Print the result for Right View
        System.out.print("Right View Traversal: ");
        for (int node : rightView) {
            System.out.print(node + " ");
        }
        System.out.println();

        // Get the Left View traversal
        List<Integer> leftView = solution.leftsideView(root);

        // Print the result for Left View
        System.out.print("Left View Traversal: ");
        for (int node : leftView) {
            System.out.print(node + " ");
        }
        System.out.println();
    }
}


