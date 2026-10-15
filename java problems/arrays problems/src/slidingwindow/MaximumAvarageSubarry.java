package slidingwindow;
/*Maximum Average Subarray I
INPUT:nums = [1,12,-5,-6,50,3], k = 4
OUTPUT:
12.75

 */
import java.util.*;
public class MaximumAvarageSubarry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int left=0;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            if(right-left+1==k){
                maxsum=Math.max(maxsum,sum);
                sum-=arr[left];
                left++;
            }

        }
        System.out.print((double)maxsum/k);
    }
}
