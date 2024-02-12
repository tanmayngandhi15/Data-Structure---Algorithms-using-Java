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
    
    
    public void levelOrder(Node node1, Node node2, int level) {
        
        level++;
        
        if (node1 == null && node2 == null) {
            
            return;
        }
        
        if (level == 0) {
            
            System.out.println(node1.value);
        }
        
        if (node1.left != null) {
            
            System.out.print(node1.left.value+", ");
        }
        if(node1.right != null) {
            
            System.out.print(node1.right.value+", ");
        }
        
        if (level > 0) {
            
            if (node2.left != null) {
                
                System.out.print(node2.right.value+", ");
            }
            
            if (node2.right != null) {
                
                System.out.print(node2.right.value+", ");
            }
            
        }
        
        System.out.println("");
        
        levelOrder(node1.left,node2.right,level);
        
    }
    
    
}

public class Levelorder {
    public static void main(String args[]) {
        
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        binarytree bt = new binarytree();
        
        Node root = bt.addTree(arr);
        
        System.out.println("Root: "+root.value);
        
        bt.levelOrder(root,root,-1);
      
    }
}