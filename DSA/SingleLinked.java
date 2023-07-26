public class SingleLinked {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }  
    }
    public void addFirstElem(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLastElem(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void addAtIndex(int data,int idx){
         Node newNode = new Node(data);
         if(head==null){
            head=newNode;
            return;
         }
         Node temp = head;
         int i=0;
         while(i<idx-1){
              if(temp.next==null){
                System.out.println("Invalid Index");
                return;
              }
              i++;
              temp=temp.next;
         }
         newNode.next=temp.next;
         temp.next=newNode;
    }

    public void deleteFirstElem(){
        if(head==null || head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }

    public void deleteLastElem(){
        if(head==null || head.next==null){
            head=null;
            return;
        }
        Node temp = head.next;
        Node prev = head;
        while(temp.next!=null){
            temp=temp.next;
            prev=prev.next;
        }
        prev.next=null;
    }

    public void deleteAtIdx(int idx){
     int i=0;
     if(head==null){
        System.out.println("Empty list");
        return;
     }
     Node temp = head.next;
     Node prev = head;
     while(i<idx-1){
       if(temp==null){
        System.out.println("Invalid Index");
       }
       i++;
       temp=temp.next;
       prev=prev.next;
     }
     prev.next=temp.next;
    }
    public void deleteElement(int data){
        if(head==null){
            System.out.println("Empty list");
            return;
         }
        Node temp=head.next;
        Node prev=head;
        while(temp!=null){
            if(temp.data==data){
                prev.next=temp.next;
                return;
            }
            temp=temp.next;
            prev=prev.next;
        }
        System.out.println("Invalid data");
    }
    public void display(SingleLinked list){
        Node temp = head;
        if(temp==null){
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.println(" ");
    }

    public Node reverseRecu(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newNode = reverseRecu(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    public static void main(String[] args) {
        SingleLinked list = new SingleLinked();
        list.addFirstElem(10);
        list.addFirstElem(15);
        list.addFirstElem(20);
        list.addLastElem(50);
        list.addAtIndex(30,3);
        list.display(list);
       // list.deleteFirstElem();
      //  list.deleteLastElem();
     // list.deleteAtIdx(2);
     //list.deleteElement(10);
      list.head =  list.reverseRecu(list.head);
        list.display(list);
    }
  
}
