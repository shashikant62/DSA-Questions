//Link=https://leetcode.com/problems/binary-search/submissions/1277456246/
//find the kth element in arr if yes return 1 else return -1
import java.util.*;
class Linear_Serch{
    public static int Linear(int arr[],int K){
        int N=arr.length;
        for(int i=0;i<N;i++){
            if(arr[i]==K){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int k=10;
        // int[] arr = {3,0,3,5,10,1};
        int[] arr = {3,0,3,5,1};
        System.out.print(Linear(arr,k)); 
    }
}