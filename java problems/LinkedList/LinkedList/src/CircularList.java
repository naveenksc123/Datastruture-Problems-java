
import java.util.*;
class nodes{
    int data;
    nodes next;
    nodes(int data){
        this.data=data;
        this.next=null;
    }
}
public class CircularList {
    static nodes head=null;
    static nodes tail=null;
    static void insertatend(int data){
        nodes newnode=new nodes(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=newnode;
        }else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }
    }
    static void display(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        nodes temp=head;
        do{
          System.out.print(temp.data+" ");
          temp=temp.next;
          if(temp!=head){
              System.out.print("-->");
          }
        }while(temp!=head);
        System.out.println(" -> back to head");

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter nodes");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter value for node " + i + ": ");
            int value = sc.nextInt();
            insertatend(value);
        }
        display();
        sc.close();
    }
}
