//Singly Linked List
class linkedList{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next= null;
        }
    }
     //add at first position
    public void addFirstElement(String data){
        Node newNode= new Node(data) ;
        if(head ==null){
            head =newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
   // add at last position
    public void addLastElement(String data){
        Node newNode = new Node(data);
         if(head ==null){
            head =newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next; 
         }
         temp.next = newNode;
    }
    //add at given index
    public void insertBetween(int index,String data){
        Node newNode = new Node(data);
         if(head==null){
            newNode = head;
            return;
         }

         Node temp = head;
         for(int i=0;i<index-1;i++){
            if(temp==null){
                System.out.println("Invalid Index");
                return;
            }
            temp=temp.next;
         }
         newNode.next=temp.next;
         temp.next=newNode;
    }
    
    //add after a string
    public void addAfterString(String data,String var){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data.equalsIgnoreCase(var)){
                 newNode.next=temp.next;
                 temp.next=newNode;  
            }
            temp=temp.next;
        }      

    }
    //delete at first
    public void deleteFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }
    //delete at last
    public void deleteLast(){
        if(head==null || head.next==null){
            head=null;
            return;
        }
        Node pre = head;
        Node next = head.next;
        while(next!=null){
              next=next.next;
              pre=pre.next;
        }
        pre.next=null;
    }
    //display method
    public void display(){ 
        if(head ==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
    }
    //reverse linked list
    public void reverse(){
        if(head==null){
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }
    //reverse using recursion
    public Node reverseRecur(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newNode = reverseRecur(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    //size of the linked list
    public void size(){
        int size = 0;
        Node curr = head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        System.out.println("size of the list:"+size);
    }
    //find middle node
    public Node middle(Node head){
        Node hear = head;
        Node turtle = head;
        while(hear.next!=null && hear.next.next!=null){
            hear = hear.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    
    //delelte n th node
    public Node removeNth(Node head,int n){
        if(head.next==null){
            return null;
        }
        int size =0;
        Node curr = head;
        while(curr!=null){
        
            curr=curr.next;
             size++;
        }
        if(size==n){
            return head.next;
        }
         int idx  = size-n;
         Node prev = head;
         int i=1;
         while(i<idx){
            prev=prev.next;
            i++;
         } 
            prev.next = prev.next.next;
        return head;
    }
    //linked list is palindrome or not
    public boolean palindrome(Node head){
      if(head==null||head.next==null){
        return true;
      }
      Node middle = middle(head);
      Node secHalf = reverseRecur(middle.next);
      Node firhalf = head;
      while(secHalf!=null){
        if(secHalf.data != firhalf.data){
            return false;
        } 
        secHalf=secHalf.next;
        firhalf=firhalf.next;
      }
      return true;
    }

    public static void main(String[] args) {
       linkedList list = new linkedList();
       list.addFirstElement("adding");
       list.addLastElement("End");
       list.addLastElement("hello");
       list.addLastElement("zz");
    //   list.insertBetween(1,"helo");
       
      // list.deleteFirst();
    //  list.deleteLast();
    list.reverse();
       list.display();
       list.size();
       list.head = list.reverseRecur(list.head);
       list.display();
    //   list.removeNth(list.head, 3);
    //   list.display();
    //   boolean a = list.palindrome(list.head);
     //  System.out.println(a);
       
    }
}