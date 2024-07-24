import java.util.*;
class binary_serch{
    public static int Binary(int arr[],int key){
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int k=8;
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.print("Index of Num: "+Binary(arr,k)); 
    }
}