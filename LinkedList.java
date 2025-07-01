public class LinkedList {
    public static class Node{
             int data;
             Node next;

             public Node(int data){
                this.data=data;
                this.next = null;
             }
         }
         public static Node head;
         public static Node tail;
         public void addFirst(int data){
          
          
          //1. Create a new node 
          Node newNode =new Node(data);
          // If LinkedList is Empty
          if(head == null){
            head = tail = newNode;
            return ;
          }

         // 2.newNode next = head 

         newNode.next = head;
        
          // head = newNode 
          head = newNode;

         }
         public void addLast(int data){
          Node newNode = new Node(data);
          if(head == null){
            head = tail = newNode;
            return;
          }
          tail.next = newNode;
          tail = newNode;
         }
         public void print(){
          if(head == null){
            System.out.println("LinkedList is empty");
          }
          Node temp = head;
          while(temp!=null){
                     System.out.print(temp.data+"->");
                     temp = temp.next;
          }
          System.out.println();
         }
       public static void main(String args[]){
         LinkedList ll = new LinkedList();
         ll.addFirst(2);
         ll.print();
         ll.addFirst(1);
         ll.print();
         ll.addLast(3);
         ll.print();
         ll.addLast(4);
         ll.print();

         
    }
}
