//Link= https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
import java.util.*;
class GCD
{
    public static int findGCD(int[] nums) {
        int min=10000;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int gcd=0;
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                gcd=i;
            }
        }
        // System.out.println(min);
        // System.out.println(max);
        return gcd;
    }
	public static void main (String[] args)
	{
        int arr[]={2,5,6,9,10};
        System.out.println(findGCD(arr));
	}
}
