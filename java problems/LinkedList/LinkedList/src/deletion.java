import java.util.*;
class node{
    int data;
    node next;
    node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class deletion {
    static void display(node head){
        node temp=head;
        while(temp!=null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
    }
    static node delfirst(node head){
       if(head==null){
           System.out.print("null");
       }
       head=head.next;
       return head;
    }
    static node dellast(node head){
        if(head!=null){
            return null;
        }
        if(head.next!=null){
            return null;
        }
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
       temp.next=null;
        return head;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        node head=null;
        node tail=null;
        System.out.print("enter of number of values");
        int n=sc.nextInt();
        System.out.print("enter data values");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            node newnode=new node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        System.out.print("orginal list");
        display(head);
        System.out.println("1. Delete first");
        System.out.println("2. Delete last");
        System.out.println("3. Delete at specific position");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
  switch(choice){
      case 1:
          head=delfirst(head);
          break;
      case 2:
          head=dellast(head);
          break;
      default:
          System.out.print("invalid choice");
  }
  display(head);
    }
}
