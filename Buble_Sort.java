//Link=https://www.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort
//Sort array using Bublesort sort
import java.util.*;
public class Buble_Sort{
  public static int []Sort(int arr[],int n){
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int tem=arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
            }
        }
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