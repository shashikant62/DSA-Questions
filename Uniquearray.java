//Link=https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/
//minimum-increment-to-make-array-unique
import java.util.*;
class Uniquearray{
    public static int minIncrementForUnique(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
            int n=nums[i-1]+1;
            c+=n-nums[i];
            nums[i]=n;
            }
        }
        return c;
    }
    public static void main(String args[]){
        int arr[]={3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(arr));
    }
}