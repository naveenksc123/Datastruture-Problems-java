package BASICSTRINGMANIPULATION;
import java.util.*;
public class CountWords {
    public static void main(String[]rgs){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '&&(i==0||s.charAt(i-1)==' ')){
                count++;
            }
        }
        System.out.print(count);
    }
}
