import java.util.Scanner;
class Nodes{
    int data;
    Nodes prev;
    Nodes next;
    Nodes(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class DoubleLinkedList {
    static Nodes head=null;
    static Nodes tail=null;
    static void insertatfront(int data){
        Nodes newnode=new Nodes(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    static void insertatlast(int data){
        Nodes newnode=new Nodes(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    static void deleatatfront(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            head.next=head;
            head.prev=null;
        }
    }
    static void deleteatend(){
        if(tail==null){
            System.out.print("list is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            tail=tail.prev;
            tail.next=null;
        }
    }
    static void displayforward(){
        Nodes temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.prev!=null){
                System.out.print("<-->");
            }
            temp=temp.next;
        }
        System.out.println(" -> null");
    }
    static void displaybackword(){
        Nodes temp=tail;
        while(tail!=null){
            System.out.print(temp.data);
            if(temp.prev!=null){
                System.out.print("<-->");
            }
            temp=temp.prev;
        }
        }
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n--- Doubly Linked List ---");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete at beginning");
            System.out.println("4. Delete at end");
            System.out.println("5. Display forward");
            System.out.println("6. Display backward");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                 insertatfront(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    insertatlast(sc.nextInt());
                    break;

                case 3:
                    deleatatfront();
                    break;

                case 4:
                    deleteatend();
                    break;

                case 5:
                    displayforward();
                    break;

                case 6:
                    displaybackword();
                    break;

                case 7:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
