import java.util.*;
class stackclass{
    // Using linked-list


    // static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data=data;
    //         next=null;
    //     }

    // }
    // static class Stack{
    //     public static Node head;
    //     public static boolean isEmpty(){
    //     return head==null;
    //}
    //     public static void push(int data){
    //         Node newNode =new Node(data);
    //         if(head==null){
    //             head=newNode;
    //             return;
    //         }
    //         else{
    //             newNode.next=head;
    //             head=newNode;
    //         }

    //     }
    //     public static int pop(){
    //         if(head==null){
    //             return -1;
    //         }
    //         else{
    //             int x=head.data;
    //             head=head.next;
    //             return x;
    //         }
    //     }
    //     public static int peek(){
    //         if(head==null){
    //             return -1;
    //         }
    //         return head.data;
    //     }

    // }
    // using Array-List
    // static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty(){
    //         return list.size()==0;
    //     }
    //     public static void push(int data){
    //         list.add(data);
    //     }
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }
    //     public static int peek(){
    //         return list.get(list.size()-1);
    //     }

    // }
    public static void main(String[] args){
    // LIFO structure last in first out structure
        // Stack s = new Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    // IMPLICT STACK : we dont make them system automatically make them
    // EXPLICT STACK : we make them

}
