// You are required to implement the following Function def LargeSmallSum(arr). 

// The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest largest element from the even positions and second smallest from the odd position of given ‘arr’.

// Assumption:

// All array elements are unique
// Treat the 0th position a seven
// NOTE

// Return 0 if array is empty
// Return 0, if array length is 3 or less than 3
// Example:-

// Input

// arr:3 2 1 7 5 4

// Output

// 7

// Explanation

// Second largest among even position elements(1 3 5) is 3
// Second largest among odd position element is 4
// Thus output is 3+4 = 7
// Sample Input

// arr:1 8 0 2 3 5 6

// Sample Output

// 8
import java.util.*;
class two{
    public static int Ans(int arr[]){
        int len=arr.length;
        ArrayList<Integer>eve=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        eve.add(arr[0]);
        for(int i=1;i<len;i++){
            // System.out.println(arr[i]);
            if(i%2==0){
                eve.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(eve);
        Collections.sort(odd);
        // System.out.println(odd);
        // System.out.println(eve.size());
        // odd.sort();
        return eve.get(eve.size()-2)+odd.get(1);
    }
    public static void main(String args[]){
        int arr[]={3,2,1,7,5,4};
        // Ans(arr);
        System.out.println(Ans(arr));
    }
}