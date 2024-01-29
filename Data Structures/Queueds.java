import java.util.*;

public class Queueds {
    //FIFO: first in first out
    //Enque : Add
    //Dequeue : Remove
    //Front : Peek


    // using Array

    // static class Queue{
    //     static int arr[];
    //     static int size;
    //     static int rear=-1;
    //     Queue(int n){
    //         arr = new int[n];
    //         this.size=n;
    //     }
    //     public static boolean isEmpty(){
    //         return rear==-1;
    //     }
    //     // Enqueue
    //     public static void add(int data){
    //         if(rear==size-1){
    //             return;
    //         }
    //         rear++;
    //         arr[rear]=data;
    //     }
    //     //Dequeue
    //     public static int remove(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int x=arr[0];
    //         for(int i=0;i<size-1;i++){
    //             arr[i]=arr[i+1];
    //         }
    //         size--;
    //         rear--;
    //         return x;
    //     }
    //     //peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return arr[0];
    //     }
    // }


    // using Linked-list

    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         next=null;

    //     }
    // }
    // static class Queue{
    //     static Node head=null;
    //     static Node tail=null;
    //     public static boolean isEmpty(){
    //         return head==null && tail==null;
    //     }
    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head= newNode;
    //             tail=newNode;
    //             return;
    //         }
    //         tail.next=newNode;
    //         tail=newNode;

    //     }
    //     public static int remove(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int front = head.data;
    //         if(head==tail){
    //             head=tail=null;
    //             return front;
    //         }
            
    //         head=head.next;
    //         return front;
    //     }
    //     public static int peek(){
    //         if(head==null){
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }

    // using Two stacks

    // static class Queue{
    //     static Stack<Integer> s1 = new Stack<>();
    //     static Stack<Integer> s2 = new Stack<>();
    //     public static boolean isEmpty(){
    //         return s1.isEmpty();
    //     }
    //     public static void add(int data){
    //         while(!s1.isEmpty()){
    //             s2.add(s1.pop());
    //         }
    //         s1.add(data);
    //         while(!s2.isEmpty()){
    //             s1.add(s2.pop());
    //         }
    //     }
    //     public static int remove(){
    //         return s1.pop();
    //     }
    //     public static int peek(){
    //         return s1.peek();
    //     }
    // }


    public static void main( String[] args){
        //Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove(); 
        }
    }
}
