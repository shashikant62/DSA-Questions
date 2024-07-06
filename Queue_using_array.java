class Queue_using_array{
    // public static int arr[]=new arr[100];
    public static class queue{
        int arr[]=new int[100];
        int front,rear;
        queue(){
            front=0;
            rear=0;
        }

        void enqueue(int x){
            if(rear==arr.length){
                System.out.println("queue is full");
            }
            arr[rear]=x;
            rear++;
        }

        int dequeue(){
            if(rear==front){
                System.out.println("queue is empty");
                return -1; 
            }
            int x=arr[front];
            if(front==rear){
                front=rear=-1;
            }
            front++;
            return x;
        }
    void display(){
        for(int i=front;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
    public static void main(String args[]){
        queue q=new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.enqueue(1);
        q.display();
    }
}
