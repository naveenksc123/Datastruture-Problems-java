import java.util.*;
public class SumOfNnaturalNumbers {
    public static int sum(int num){
        if(num==0){
            return 0;
        }
        return num+sum(num-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=sum(num);
        System.out.print(result);
    }
}
