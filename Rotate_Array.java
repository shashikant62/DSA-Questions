//Link=https://leetcode.com/problems/rotate-array/description/
//Rotate array from kth place
import java.util.*;
public class Rotate_Array {
  public static void Rotate(int arr[],int k,int n){
    int temp[]=new int[k];
    for(int i=0;i<k;i++){
        temp[i]=arr[i];
    }
    // for (int i = 0; i < k; i++) {
    //   System.out.print(temp[i] + " ");
    // }
    System.out.println();
    for(int i=0;i<n-k;i++){
        arr[i]=arr[k+i];
    }
    int s=0;
    for(int i=k+1;i<n;i++){
        arr[i]=temp[s];
        s++;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String args[]) {
    int n = 7;
    int[] arr = {1,2,3,4,5,6,7};
    int k = 3;
    Rotate(arr,k,n);
    // for (int i = 0; i < n; i++) {
    //   System.out.print(arr[i] + " ");
    // }
  }
}