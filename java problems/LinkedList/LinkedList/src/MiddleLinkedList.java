
import java.util.*;
class middlenode{
    int data;
    middlenode next=null;
    middlenode(int data){
        this.data=data;
        this.next=null;
    }
}
public class MiddleLinkedList {
    static void display(middlenode head){
        middlenode temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("-->");
            }
            temp=temp.next;
        }
    }
    static middlenode middle(middlenode head){
        middlenode fast=head;
        middlenode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main (String []args){
       Scanner sc=new Scanner(System.in);
        middlenode head=null;
        middlenode tail=null;
       System.out.print("Enter the number of node:");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           System.out.print("enter the values:");
           int value =sc.nextInt();
           middlenode newnode= new middlenode(value);
           if(head==null){
             head=newnode;
             tail=newnode;
           }else{
               tail.next=newnode;
               tail=newnode;
           }
       }
        System.out.println("orginal list");
       display(head);
       middlenode mid=middle(head);
       if(mid!=null){
           System.out.println("Middle node: " + mid.data);
       } else {
           System.out.println("List is empty.");
       }
    }
}
