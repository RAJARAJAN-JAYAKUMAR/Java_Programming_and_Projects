package oops;

public class Stack {
    int s[] = new int[10];
    int topOfStack;
    Stack(){
        topOfStack = -1;
    }
    void push(int item){ //check stack is full or not
        // topOfStack = topOfStack+1;
        // s[topOfStack] = item;
        if(topOfStack==9){ 
            System.out.println("Stack is full");
        }else{
            s[++topOfStack] = item;
        }
    }
    int pop(){ //check stack is empty or not
            if(topOfStack>=0){
                return s[topOfStack--]; // it returns the value first and decrease the topofstack value
            }
            else{
                System.out.println("Stack is empty");
                return -1;
            }
        }
}
