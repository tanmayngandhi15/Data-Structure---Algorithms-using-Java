class Node {
    
    int value;
    Node next;
    Node prev;
     
}

class myLinkedList {
    
    Node head;
    
    public void addData(int no) {
        
        Node node = new Node();
        node.next = null;
        node.prev = null;
        node.value = no;
        
        
        if (head==null) {
            head = node;
        } else {
            Node current = head;
            
            while(current.next!=null) {
                current = current.next;
            }

        node.prev = current;
        current.next = node;
        
        }

    }
    
    public void showData() {

        Node current = head;
        
        while(current!=null) {
            System.out.print(current.value+" -> ");
            current = current.next;
        }
        System.out.print("Null");
    }
 
}


public class TraverseAndDisplay {
    
    public static void main (String[] args) {
    
    myLinkedList ll = new myLinkedList();
    ll.addData(100);
    ll.addData(200);
    ll.addData(300);
    ll.addData(500);
    ll.addData(700);

    ll.showData();

    }
    
}