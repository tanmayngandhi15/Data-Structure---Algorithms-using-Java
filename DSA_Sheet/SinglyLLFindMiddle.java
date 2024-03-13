// Find Middle of the Singly Linked List

class Node {
    
    int value;
    Node next;
  
}

class myLinkedList {
    
    Node head;
    
    public void addNode(int no) {
        
        Node node = new Node();
        node.value = no;
        
        if (head == null) {
            
            head = node;
        } else {
            
           Node current = head;
            
            while (current.next != null) {
                
                current = current.next;
            }
            
            current.next = node;
        }
        
    }
    
    public void printNode() {
        
        Node current = head;
        
        while (current != null) {
            
            System.out.print(current.value+" -> ");
            
            current = current.next;
        }
        
    }
    
    public void printMid() {
        
        System.out.println("\n");
        
        if (head != null) {

           int no = findMid(head, head);
           System.out.println(no);
        }
        
        
    }
    
    public int findMid(Node curr1, Node curr2) {
        
        if (curr2.next == null || curr2.next.next == null) {
            
            return curr1.value;
        }
        
       return findMid(curr1.next, curr2.next.next);
    }
 
}

public class SinglyLLFindMiddle {
    
    public static void main(String[] args) {
        
        myLinkedList ll = new myLinkedList();
        
        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(50);
        ll.addNode(70);
        ll.addNode(100);
        
        ll.printNode();
        
        ll.printMid();
        
    }
    
}