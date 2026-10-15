import java.util.*;
class mergenode{
    int data;
    mergenode next;
    mergenode(int data){
        this.data=data;
        this.next=null;
    }
}
public class MergeLinkedList {
    static mergenode createlist(Scanner sc,int n){
        mergenode head=null;
        mergenode tail=null;
        for(int i=0;i<n;i++){
            System.out.print("enter list:");
           int value=sc.nextInt();
            mergenode newnode=new mergenode(value);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        return head;
    }
    static mergenode merge(mergenode head1,mergenode head2){
        mergenode dummy=new mergenode(0);
        mergenode temp=dummy;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp=temp.next;
        }
        if(head1!=null){
            temp.next=head1;
        }else{
            temp.next=head2;
        }
        return dummy.next;
    }
    static mergenode display(mergenode head){
        mergenode temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("-->");
            }
            temp=temp.next;
        }
        return temp;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter number of node list1");
        int n1=sc.nextInt();
        mergenode head1=createlist(sc,n1);
        System.out.println("eneter number of node list2");
        int n2=sc.nextInt();
        mergenode head2=createlist(sc,n2);
        System.out.println("List 1: ");
        display(head1);
        System.out.println("List 2: ");
        display(head2);
        mergenode merge=merge(head1,head2);
        System.out.println("mergelist:");
        display(merge);
    }
}
