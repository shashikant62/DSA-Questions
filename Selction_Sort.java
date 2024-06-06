//Link=https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort
//Sort array using selection sort
import java.util.*;
public class Selction_Sort{
  public static int []Sort(int arr[],int n){
    for(int i=0;i<n;i++){
        int min_idx=i;
        for(int j=i+1;j<n;j++){
            if(arr[min_idx]>arr[j]){
                min_idx=j;
            }
        }
        int tem=arr[min_idx];
        arr[min_idx]=arr[i];
        arr[i]=tem;
    }
    return arr;
  }
  public static void main(String args[]) {
    int n = 7;
    int arr[]={23,1,4,24,12,34,9};
    System.out.println(Sort(arr,n));
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
  }
} 