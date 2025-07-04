public class liinkedlist {
   public static  class Node{
           int data;
           Node next;
           public Node(int data){
            this.data = data;
            this.next = null;
           }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Add Node in at last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
         head = tail =newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //add in middle

   
        public void print(){
        if(head == null){
            System.out.println("The LinkedList is empty");
        }
        Node temp = head;
        while(temp==null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

     public void addMid(int idx ,int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0 ;
        while(i < idx-1){
            temp=temp.next;
            i++;
        } 
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //Remove from first;
public void removeFirst(){
    if(size == 0){
        System.out.println("LL is empty");
    }
    else if(size==1){
        head = tail = null;
        size =0;
    }
    head = head.next;
    size--;
}

public void removeLast(){
    if(size == 0 ){
        System.out.println("ll is empty");
    }
    else if(size == 1){
        head = tail = null;
        size = 0;
    }
    Node prev = head;
    for(int i = 0 ; i< size -2; i++){
        prev=prev.next;
    } 
    prev.next = null;
    prev = tail;
    size--;
        
}

    public static void main(String args[]){
      LinkedList ll = new LinkedList();
      ll.addLast(1);
      ll.addLast(2);
      ll.addLast(3);
      ll.addLast(4);
      ll.addFirst(5);
      ll.print();
    }
}                     
