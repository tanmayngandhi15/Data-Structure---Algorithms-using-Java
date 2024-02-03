class Node {
    String value;
    Node next;
}

class myStack {
    
    Node head;
    
    public void isEmpty() {
        System.out.println(head == null);
    }
 
    public void push(String subject) {
        
        Node node = new Node();
        node.value = subject;
        node.next = head;
        
        head = node;
    }

    // 
    public void peek() {
        System.out.println(head.value);
    }
    
    public void pop() {
        
        System.out.println(head.value);
        
        head = head.next;
    }
    
    public void show() {
        
        Node current = head;
        
        while(current != null) {
            System.out.print(current.value+" -> ");
            current = current.next;
        }
        System.out.print("null\n");
    }
    
}


public class ImplementStack {
    public static void main(String args[]) {
        
        myStack ms = new myStack();
        
        ms.isEmpty();
        
        ms.push("Maths");
        ms.push("Science");
        ms.push("Physics");
        ms.push("History");
        
        System.out.println();
        
        ms.show();
        
        System.out.println();
        
        ms.peek();
        
        System.out.println();
        
        ms.pop();
        
        System.out.println();
        
        ms.peek();
        
        System.out.println();
        
        ms.show();
     
    }
}