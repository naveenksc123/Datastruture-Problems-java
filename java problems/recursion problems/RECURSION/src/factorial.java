import java.util.*;
public class factorial {
    public static int fact(int num){
        if(num==0){
            return 1;
        }
          return num*fact(num-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result= fact(num);
        System.out.print(result);
    }

}
