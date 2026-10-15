import java.util.*;
public class Print1ToN {
    public static void display(int num){
         if(num==0) {
             return;
         }
        display(num-1);
         System.out.print(num+" ");
         //display(num-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        display(num);
    }
}
