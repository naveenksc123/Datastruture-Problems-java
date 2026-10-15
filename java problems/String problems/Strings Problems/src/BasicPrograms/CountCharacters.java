package BasicPrograms;
import java.util.*;
public class CountCharacters {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            count++;
        }
        System.out.print(count);
    }

}
