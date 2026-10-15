import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
     this.data=data;
     this.next=null;
    }
}
public class insertions {
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            if(temp.next!=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
    }
    static Node InsertAtFront(Node head, int data) {
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
        return head;
    }
    static Node InsertAtLast(Node head,int data){
        Node newnode=new Node(data);
        if(head==null){
            return newnode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    static Node InsertionAtSepcificPoistion(Node head,int data,int position){
        if(position<1){
            System.out.print("Invalid Positions");
            return head;
        }
        if(position==1){
           return InsertAtFront(head,data);
        }
        Node temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.print("Invalid position");
            return head;
        }
        Node newnode=new Node(data);
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int n=sc.nextInt();
        System.out.print("enter the data:");
          for(int i=0;i<n;i++){
              //System.out.print("enter the data");
              int data=sc.nextInt();
              head=InsertAtLast(head,data);
          }
          System.out.print("print orginal list:");
          display(head);
          System.out.print("enetr data front:");
          int frontdata=sc.nextInt();
          head=InsertAtFront(head,frontdata);
        System.out.print("print orginal list:");
        display(head);
        System.out.print("enetr data back:");
        int backdata=sc.nextInt();
        head=InsertAtLast(head,backdata);
        display(head);
        System.out.print("Enter data to insert: ");
        int insertData = sc.nextInt();
        System.out.print("Enter insertion position: ");
        int insertPosition = sc.nextInt();
        head = InsertionAtSepcificPoistion(head,insertData,insertPosition);
        System.out.print("After insertion: ");
        display(head);
    }
}

