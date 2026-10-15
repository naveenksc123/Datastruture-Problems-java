import java.util.*;
class revnode{
    int data;
    revnode next;
    revnode(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseLinkedList {

    static void dispaly(revnode head){
        revnode temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("-->");
            }
            temp=temp.next;
        }
    }
    static revnode reverse(revnode head){
        revnode prev=null;
        revnode current=head;
        while(current!=null){
            revnode newnode=current.next;
            current.next=prev;
            prev=current;
            current=newnode;
        }
        return prev;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        revnode head=null;
        revnode tail=null;
        System.out.print("enter node :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("enter values :");
            int value=sc.nextInt();
            revnode newnode=new revnode(value);
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        System.out.print("orginal list"+" ");
        dispaly(head);
        head=reverse(head);
        System.out.print("reverse list");
        dispaly(head);
    }
}