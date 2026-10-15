package twopointers;
/*Container With Most Water
INPUT
height = [1,8,6,2,5,4,8,3,7]
OUTPUT=49
 */
import java.util.Scanner;
public class containerwithmostwater {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length - 1;
        int max_area=0;
        while (left < right) {
         int width=right-left;
         int  min_height=Math.min(arr[left],arr[right]);
         int area=width*min_height;
         max_area=Math.max(area,max_area);
         if(arr[left]<arr[right]){
             left++;
         }else {
             right--;
         }
        }
        System.out.print(max_area);
    }
}
