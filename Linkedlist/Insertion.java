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
    void InsertAtEnd(int data){
        Node nn=createNode(data);
        Node temp=head;
        if(head==null){
            head=nn;
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }
    }
    void InsertAtParticularPosition(int data,int pos){
        Node nn=createNode(data);
        Node temp=head;
        if(head==null){
            head=nn;
        }
        else{
            while(--pos>0){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
    }
    void Finding(int key){
        Node temp=head;
        int flag=0;
        if(head==null){
            System.out.println("Head-Null");;
        }
        else{
            while(temp!=null){
                if(temp.data==key)
                {
                    System.out.print("Element found"); 
                    flag=1;
                    break;
                }
                temp=temp.next;
            }
            if(flag==0){
                System.out.println("Element Not found");
            }
                
        }
        
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Linkedlist ll=new Linkedlist();
		int pos=sc.nextInt();
		int key=sc.nextInt();
		ll.InsertAtBeginning(100);
		ll.InsertAtBeginning(200);
		ll.InsertAtBeginning(300);
		ll.display();
		ll.InsertAtEnd(400);
		ll.display();
		ll.InsertAtParticularPosition(500,pos);
		ll.display();
		ll.Finding(key);
		ll.display();
	}
}


