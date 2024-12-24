public class Stack {
    int maxSize;
    int[] stackArray;
    int top;

    public Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value){
        if (top < maxSize){
            stackArray[++top] = value;
        }
        else{
            System.out.print("Stack overflow");
        }
    }

    public int pop(){
        return stackArray[top--];
    }

    public static void main(String[] args){
    }
}
