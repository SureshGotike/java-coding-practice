package DSA;
public class Stack {
    public static void main(String args[]){
        System.out.println("Welcome stack");

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Elements after push \n");
        stack.display();

        stack.pop();
        System.out.println("Elements after pop \n");
        stack.display();

        System.out.println("Peek element is "+ stack.peek());
    }


    int capacity = 10;
    int size = 0;
    int[] stack = new int[capacity];
    int top = -1;


    private void push(int data){
        if(size == capacity){
            System.out.println("Stack is already full");
            return;
        }
        stack[++top] = data;
        size++;
    }


    private void pop(){
        if(top == -1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("popped element is "+ stack[top]);
        top--;
        size--;
    }


    private int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
            return stack[top];
    }

    private void display(){

        for(int i=top; i>=0; i--){
            System.out.println(stack[top-i]);
        }

    }


}
