class Node {
    
    int value;
    Node left;
    Node right;
}

class binarytree {
    
    int index = -1; 
    
    public Node addTree(int[] nodes) {
        
        index++;
        
        if (nodes[index] == -1) {
            
            return null;
        }
        
        Node node = new Node();
        node.value = nodes[index];
        
        node.left = addTree(nodes);
        node.right = addTree(nodes);
        
        return node;
        
    }
    
    
    public void printLeaf(Node node) {
        
        if (node == null) {
            
            return;
        }

        printLeaf(node.left);
        printLeaf(node.right);
        
        if (node.left == null && node.right == null) {
            
            System.out.print(node.value+", ");
        }
        
    }
    
}

public class LeafNodes {
    public static void main(String args[]) {
        
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        binarytree bt = new binarytree();
        
        Node root = bt.addTree(arr);
        
        System.out.println("Root: "+root.value);
        
        bt.printLeaf(root);
      
    }
}