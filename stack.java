import java.util.*;
 
class Stack
{
    private int arr[];
    private int top;
    private int num;
 
    Stack(int size)
    {
        arr = new int[size];
        num = size;
        top = -1;
    }
 
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Stack OverFlow");
            System.exit(1);
        }
        arr[++top] = x;
        System.out.println("Inserted " + x);
    }
 

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println(" Stack UnderFlow");
            System.exit(1);
        }
 
        System.out.println("Removed " + peek());
        return arr[top--];
    }


    public int peek()
    {
        if (!isEmpty())
            return arr[top];
        else
            System.exit(1);
 
        return -1;
    }
 
    public int size()
    {
        return top + 1;
    }
 
    public Boolean isEmpty()
    {
        return top == -1;    
    }
 
    public Boolean isFull()
    {
        return top == capacity - 1;    
    }
 
    public static void main (String[] args)
    {
        Stack stack = new Stack(3);
 
        stack.push(1);        
        stack.push(2);        
 
        satck.pop();        
        stack.pop();        
        stack.push(3);      
 
        System.out.println("element  at the top is: " + stack.peek());
        System.out.println("size is " + stack.size());
 
        stack.pop();       
 
 
        if (stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");
    }
}
