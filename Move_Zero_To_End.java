//Link=https://leetcode.com/problems/move-zeroes/description/
//Move zero to end in array
import java.util.*;
class Move_Zero_To_End{
    public static void Move(int arr[]){
        int n=arr.length;
        ArrayList<Integer> temp = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i=temp.size();i<n;i++){
            temp.add(0);
        }
        for(int i=0;i<n;i++){
            arr[i]=temp.get(i);
        }
    }
    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1,2,0,4,0,6,7};
        Move(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}