public class Stack {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class stackflow {
        public static Node head;

        public boolean isEmpty() {
            return head == null;

        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            } 
                newNode.next = head;
                head = newNode;
            
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            // if(head.next==null){
            // head = null;
            // return top;
            // }
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
        //pushing at bottom
        public  void pushAtBottom(int data,stackflow ss){
            if(isEmpty()){
                ss.push(data);
                return;
            }
            int top = ss.pop();
            pushAtBottom(data, ss);
            ss.push(top);
        }
         //reverse
        public void reverse(stackflow ss){
          if(isEmpty()){
            return;
          }
          int top = ss.pop();
          reverse(ss);
          pushAtBottom(top, ss);
        }
    }

    public static void main(String[] args) {
        stackflow ss = new stackflow();
        ss.push(10);
        ss.push(4);
        ss.push(6);
        ss.push(7);
        ss.reverse(ss);
        while (!ss.isEmpty()) {
            System.out.println(ss.peek());
            ss.pop();
        }
    }

}
