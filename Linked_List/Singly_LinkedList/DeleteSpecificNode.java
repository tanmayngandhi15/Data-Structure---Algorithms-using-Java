class Node {
    int value;
    Node next;
}
 
class myLinkedList {
    Node head;
    public void addData(int no) {
        Node node = new Node();
        node.value = no;
        node.next = null;

        if (head==null) {
            head = node;
        } else {
            Node current = head;
            while(current.next!=null) {
                current = current.next;
            }
            current.next = node;
        }
    }
    public void show() {
        Node current = head;
        while(current!=null) {
            System.out.print(current.value+"->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteAt(int at) {

        if (head == null) {
            return;
        }
        
        if (head.value == at) {
            head = head.next;
        }
            
            Node current = head;
            
            while(current.next != null && current.next.value != at) {
                
                current = current.next;
                if(current == null) {
                    return;
                }
            }
            
           if (current.next != null) {
           current.next = current.next.next;
           }

    }

}

public class DeleteSpecificNode {
    public static void main(String[] args) {
        myLinkedList myList = new myLinkedList();
        myList.addData(200);
        myList.addData(400);
        myList.addData(500);
        myList.addData(700);
        myList.addData(800);
        myList.addData(900);
    
        myList.show();

        myList.deleteAt(800);

        myList.show();

    }
}