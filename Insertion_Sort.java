//Link=
//Sort array using insertion sort
import java.util.*;
public class Insertion_Sort{
  public static int []Sort(int arr[],int n){
    for(int i=1;i<n;i++){
      int key=arr[i];
      int j=i-1;
      while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=key;
    }
    return arr;
  }
  public static void main(String args[]) {
    int n = 7;
    int arr[]={23,1,4,24,12,34,9};
    Sort(arr,n);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
  }
} 