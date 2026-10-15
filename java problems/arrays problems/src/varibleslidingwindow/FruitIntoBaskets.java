package varibleslidingwindow;
/*Fruit Into Baskets:
input=arr[1,2,1]
   output=3
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class FruitIntoBaskets {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        Arrays.sort(arr);
        HashSet<Integer> set=new HashSet<>();
        int left=0;
        int count=0;
        int maxlength=0;
        for(int right=0;right<arr.length;right++){
            while(set.contains(right)){
                set.remove(left);
                left++;
                count--;
            }
            set.add(right);
            count++;
            maxlength=Math.max(count,maxlength);
        }
        System.out.print(maxlength);
    }

}
