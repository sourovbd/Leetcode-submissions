/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer> result = new ArrayList<>();
        if (root == null) 
            return result;
        result.add(root.val);
        buildTree(root, result);
        return result;
    }
    
    public void buildTree(Node curNode, List result) {
        if (curNode == null) {
            return;
        }
        for (Node node : curNode.children) {
            if (node == null) {
                return;
            }
            result.add(node.val);
            buildTree(node, result);
        }
    }
}