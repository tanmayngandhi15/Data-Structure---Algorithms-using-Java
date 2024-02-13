
class Node {
    
    int value;
    Node left;
    Node right;
}

class binarySearchTree {
    
    public Node addNode(Node current, int no) {

        Node node = new Node();
        node.value = no;
        
        if (current == null) {
            
            current = node;
        } else {
            
            if (no > current.value) {

                  current.right = addNode(current.right,no);
                  
            } else {
 
                  current.left = addNode(current.left,no);
            }
  
        }
        
       return current; 
    }
    
    
    public void printInorder(Node root) {
        
        if(root == null) {
            return;
        }
        
        
        printInorder(root.left);
        
        System.out.print(root.value+", ");
        
        printInorder(root.right);
        
        
    }
    
    
}


public class InorderTraversal {
    public static void main(String args[]) {
      
      int[] arr = {5,1,3,4,2,7};
      Node root = null;
      
      binarySearchTree bst = new binarySearchTree();
      
      for(int no: arr) {
      
        root = bst.addNode(root,no);
      }
      
      bst.printInorder(root);
      
    }
}