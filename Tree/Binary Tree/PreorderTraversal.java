class Node {
    
    int value;
    Node left;
    Node right;
}

class BinaryTree {
    
    int index = -1; 
    
    public Node addNode(int[] nodes) {
        
        index++;
        
        if (nodes[index] == -1) {
            
            return null;
        }
        
        Node node = new Node();
        node.value = nodes[index];
        
        node.left = addNode(nodes);
        node.right = addNode(nodes);
        
        return node;
    }
    
    public static void preorder(Node node) {
        
        if (node == null) {
            return;
        }
        
        System.out.print(node.value+" -> ");
        
        preorder(node.left);
        preorder(node.right);
        
    }
  
    
}


public class PreorderTraversal {
    public static void main(String args[]) {
        
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
       BinaryTree binaryTree = new BinaryTree();
       Node root = binaryTree.addNode(arr);
       
       System.out.println("Root: "+root.value);
       
       binaryTree.preorder(root);
 
    }
}