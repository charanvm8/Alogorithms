package introductionToAlgos.chapter10;

public class Stack {

    int[] arr = new int[16];
    int top = 0;

    public boolean isEmpty(){
        return this.top == 0;
    }

    public void push(int val){
        arr[++top] = val;
    }

    public int pop(){
        return arr[top--];
    }

    public boolean contains(int val){
        for(int i=0;i<top;i++){
            if(arr[i]==val){
                return true;
            }
        }
        return false;
    }


}
