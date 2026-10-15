package varibleslidingwindow;
import java.util.*;
public class MinimumSizeSubarraySum {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           int target=sc.nextInt();
           int sum=0;
           int count=Integer.MAX_VALUE;
           int left=0;
           for(int right=0;right<arr.length;right++) {
               sum += arr[right];

               while (sum >= target) {
                   count = Math.min(count, right - left + 1);
                 sum-=arr[left];
                   left++;

               }
           }
           if(count==Integer.MAX_VALUE){
               System.out.print(0);
           }else {
               System.out.print(count);
           }
   }

}
/*input=arr[2,3,1,2,4,3] target=7
  output=2
 */
