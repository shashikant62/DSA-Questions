//Link=https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
//regarange elem by sing
import java.util.*;
class Regarange_elem{
    public static void rearr(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=pos.get(i);
            nums[2*i+1]=neg.get(i);
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={3,-4,1,-2,-9,7};
        rearr(arr);
    }
}