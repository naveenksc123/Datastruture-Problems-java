import java.util.*;
public class ProductOftwoNumbers {
    public static int product(int a,int b){
        if(b==0){
            return 0;
        }
        return a+product(a,b-1);
    }
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=product(a,b);
        System.out.print(result);
    }
}
/*
explanatiom: 4+4+4+4+4+4 tnduction method
 */