//Link=https://leetcode.com/problems/missing-number/
//find missing number range of [0,n]
import java.util.*;
class Missing_Number{
    public static int Miss(int arr[]){
        int n=arr.length;
        if(arr[0]==1 && arr.length==1){
            return 0;
        }
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        int mis=0;
        for(int i=0;i<arr.length;i++){
            if(i!=arr[i]){
                mis=i;
                return i;
            }
        }
        if(mis==0){
            mis=arr[n-1]+1;
        }
        return mis;
    }
    public static void main(String args[]) {
        int n = 7;
        int[] arr = {3,0,1};
        System.out.print(Miss(arr)); 
    }
}