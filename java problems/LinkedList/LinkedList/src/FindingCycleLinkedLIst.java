import java.util.*;
class cyclenode{
    int data;
    cyclenode next;
    cyclenode(int data){
        this.data=data;
        this.next=null;
    }
}
public class FindingCycleLinkedLIst {
    public static cyclenode findcycle(cyclenode head) {
        cyclenode fast = head;
        cyclenode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cyclenode head = null;
        cyclenode tail = null;
        System.out.print("Enter the no of node:");
        int n = sc.nextInt();
        cyclenode[] nodes = new cyclenode[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enetr the values:");
            int value = sc.nextInt();
            cyclenode newnode = new cyclenode(value);
            nodes[i] = newnode;
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
        }
        System.out.print("Create a cycle? (1 = Yes, 0 = No): ");
        int choice = sc.nextInt();
        if (choice == 1 && n > 0) {
            System.out.print("Enter index where cycle starts (0 to "
                    + (n - 1) + "): ");
            int index = sc.nextInt();
            if (index >= 0 && index < n) {
                tail.next = nodes[index];
                System.out.println("Cycle created.");
            } else {
                System.out.println("Cycle not created created.");
            }
        }
        cyclenode start = findcycle(head);
        if (start != null) {
            System.out.println("Cycle starts at node: " + start.data);
        } else {
            System.out.println("No cycle found.");
        }
        sc.close();
    }
}
