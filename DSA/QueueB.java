public class QueueB{
    static class Queue{
       int arr[];
       int size;
       int rear;
       
       Queue(int size){
        this.size=size;
        arr =  new int[size];
        rear =-1;
       }
         public  boolean isEmpty(){
           return rear == -1;
        }
         public boolean isFull(){
            return rear==size-1;
         }

       public void add(int data){
        if(isFull()){
           System.out.println("Array is full");
           return;
        }
          arr[++rear]=data;
       }
       
       public int  remove(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
         int front = arr[0];
         for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
         }
         return front;
       }

       public int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
          return arr[0];
    }

    public void display(){
        for(int i=0;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(4);
        q.add(3);
        q.add(7);
        q.add(2);
       
        q.display();
         System.out.println("-------------------");
        q.remove();
        q.display();
         System.out.println("-------------------");
         q.peek();
    }
}
