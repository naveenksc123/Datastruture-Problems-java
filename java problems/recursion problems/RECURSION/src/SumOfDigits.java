import java.util.*;
public class SumOfDigits{
    public static int sum(int num){
        if(num<10){
            return num;
        }
        int presntvalue=num%10;
        return sum(num/10)+presntvalue;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(sum(num));
    }

}
/*
product of digits=sum(num/10)*presntvalue;
 */
