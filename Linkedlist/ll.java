import java.util.*;
class Node{
    int data;
    Node next;
}
class Linkedlist{
    Node head=null;
    Node createnode(int data){
        Node nn=new Node();
        nn.data=data;
        nn.next=null;
        return nn;
    }
    void InsertAtbeginning(int data){
        Node nn=createnode(data);
        nn.next=head;
        head=nn;
    }
    void InsertAtEnd(int data){
        Node nn=createnode(data);
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
    void Insertatparticularpo(int data,int pos){
        Node nn=createnode(data);
        Node temp=head;
        if(head==null){
            head=nn;
        }else{
            while(--pos>0){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
    }
    void Deletebeginning(){
        if(head!=null){
            head=head.next;
        }
    }
    void DeleteAtend(){
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    void DeleteAtparticularpos(int pos1){
        Node temp=head;
        Node prev=null;
        while(--pos1>0){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
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
                    System.out.println("Element found"); 
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
		int n=sc.nextInt();
		int pos=sc.nextInt();
		int pos1=sc.nextInt();
		int key=sc.nextInt();
		for(int i=0;i<n;i++){
		    ll.InsertAtbeginning(sc.nextInt());
		}
		ll.InsertAtEnd(sc.nextInt());
		ll.Insertatparticularpo(sc.nextInt(),pos);
		ll.Deletebeginning();
		ll.DeleteAtend();
		ll.DeleteAtparticularpos(pos1);
		ll.Finding(key);
		ll.display();
	}
}


