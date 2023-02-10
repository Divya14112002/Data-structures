import java.util.*;
class Node{
    int data;
    Node next;
}
class Linkedlist{
    Node head=null;
    Node createNode(int data){
        Node nn=new Node();
        nn.data=data;
        nn.next=null;
        return nn;
    }
    void InsertAtBeginning(int data){
        Node nn=createNode(data);
        nn.next=head;
        head=nn;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Linkedlist ll=new Linkedlist();
		ll.InsertAtBeginning(100);
		ll.InsertAtBeginning(200);
		ll.InsertAtBeginning(300);
		ll.display();
	}
}
