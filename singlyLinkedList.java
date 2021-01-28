public class SinglyLinkedList {    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
  
    public Node head = null;    
    public Node tail = null;    
        
  
    public void insertNode(int data) {    
        Node newNode = new Node(data);     
        if(head == null) {        
            head = newNode;    
            tail = newNode;    
        }    
        else {       
            tail.next = newNode;    
            tail = newNode;    
        }    
    }    
           
    public void display() {    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println(" Nodes are: ");    
        while(current != null) {     
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
       SinglyLinkedList ls= new SinglyLinkedList();        
       ls.insertNode(1);    
       ls.insertNode(2);    
       ls.insertNode(3);    
       ls.insertNode(4);    
            
       ls.display();    
    }    
}    
