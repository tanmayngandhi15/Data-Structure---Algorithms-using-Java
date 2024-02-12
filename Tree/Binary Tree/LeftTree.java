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
    
    
    public void printLeftTree(Node node, int count) {
        
        count++;
        
        if (node == null) {
            
            return;
        }
        
        System.out.print(node.value+", ");
        
        if (count == 0) {

            printLeftTree(node.left,count);
        } else {
            
            printLeftTree(node.left,count);
            printLeftTree(node.right,count);
        }

    }
    
    
}

public class LeftTree {
    public static void main(String args[]) {
        
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        binarytree bt = new binarytree();
        
        Node root = bt.addTree(arr);
        
        System.out.println("Root: "+root.value);
        
        bt.printLeftTree(root,-1);
      
    }
}