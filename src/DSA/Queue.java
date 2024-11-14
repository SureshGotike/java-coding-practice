package DSA;
public class Queue {

    public static void main(String[] args) {
        System.out.println("Hello, Queue!");

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.print("Elements after enqueue \n");
        queue.display();
        queue.dequeue();
        System.out.print("Elements after dequeue \n");
        queue.display();
    }


    int front = 0;
    int rear = -1;
    int capacity  = 10;
    int[] queue = new int[capacity];
    int size = 0;


    private void enqueue(int data){
        if(capacity == size){
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = data;
        size ++;
    }

    private void dequeue(){
        if(size == 0){
            System.out.println("No elements present in the queue");
            return;
        }
        System.out.println("Removed element is "+ queue[front]);
        front++;
        size--;
    }

    private void display(){
        for(int i=0; i<size; i++){
            System.out.println(queue[front+i]+ " ");
        }
    }
}
