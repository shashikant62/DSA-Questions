// You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd) in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on. then you have sort the even and odd matrices in ascending order then print the sum of second largest number from both the matrices
// Example:
// enter the size of array : 5
// enter element at 0 index : 3
// enter element at 1 index : 4
// enter element at 2 index : 1
// enter element at 3 index : 7
// enter element at 4 index : 9
// Sorted even array : 1 3 9
// Sorted odd array : 4 7   10
import java.util.*;
class nine{
    public static int Ans(int arr[]){
        List<Integer>eve=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                eve.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(eve);
        Collections.sort(odd);
        // System.out.println(eve);
        // System.out.println(odd);
        ans=eve.get(eve.size()-2)+odd.get(odd.size()-2);
        return ans;
      }
      public static void main(String args[]){
        int arr[]={3,4,1,7,9};
        System.out.println(Ans(arr));
      }
}