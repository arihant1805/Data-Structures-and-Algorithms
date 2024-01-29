// import java.util.*;
class LL{
	Node head;
	class Node{
		String data;
		Node next;
		Node(String x){
			this.data = x;
			this.next = null;
		}
	}
	public void addFirst(String x){
		Node newNode = new Node(x);
		newNode.next = head;
		head = newNode;

	}
	public void reverse(){
		Node current;
		Node Next;
		Node previous=null;
		current=head;
		
		while(current!=null){
			Next = current.next;
			current.next=previous;
			previous=current;
			current=Next;
		}
	}
	public void addLast(String x){
		Node current;
		Node New = new Node(x);
		current = head;
		do{
		   current = current.next;
		}while(current.next != null);
		current.next = New;

	}
	public void set(String x,int a){
		if(a==0){
			addFirst(x);
			return;
		}
		Node A;
		A=head;
		for(int i=0;i<a-1;i++){
			A = A.next;
		}
		Node B=new Node(x);
		B.next=A.next;
		A.next=B;
	}
	public String get(int x){
		Node A;
		A=head;
		for(int i=0;i<x-1;i++){
			A = A.next;
		}
		return A.data;
	}
	public void print(){
		Node current;
		if(head == null){
           return;
		}
		current = head;
		do{
           System.out.print(current.data);
		   current = current.next;
		}while(current != null);
	}
}
class Project{
	public static void main(String[] args) {
	LL list1 = new LL();
	list1.addFirst("Arihant");
	list1.addFirst("is ");
	list1.addFirst("name ");
	list1.addFirst("Hello My ");
	list1.addLast(" jain");
	list1.set(" Kumar", 4);
	list1.reverse();
	list1.print();
	System.out.println();
	System.out.println(list1.get(4)+list1.get(5)+list1.get(6));
	
	}
}
