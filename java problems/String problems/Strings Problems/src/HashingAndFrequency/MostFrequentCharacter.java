package HashingAndFrequency;
import java.util.*;
public class MostFrequentCharacter {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char mostfrequent=s.charAt(0);
        int maxcount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)>maxcount){
                maxcount=map.get(ch);
                mostfrequent=ch;
            }
        }
        System.out.print(maxcount);
        System.out.print(mostfrequent);

    }

}
