import java.util.*;
import java.io.*;
class Union_of_Array{
    public static void Union(int arr1[],int arr2[],int n,int m){
        TreeSet<Integer>a=new TreeSet<>();
        ArrayList<Integer>arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            a.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            a.add(arr2[i]);
        }
        arr.addAll(a);
        System.out.println(arr);
    }
    public static void main(String args[]) {
        int k=10;
        int[] arr1= {1,2,3};
        int n=arr1.length;
        int[] arr2= {1,2,3,4,5,6};
        int m=arr2.length;
        Union(arr1,arr2,n,m); 
    }
}