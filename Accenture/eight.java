// You are required to implement the following function, Int Calculate(int m, int n);
// The function accepts 2 positive integer ‘m’ and ‘n’ as its arguments.You are required to calculate the sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’ both inclusive and return the same.
// Note:
// 0 < m <= n
// Example
// Input:
// m : 12
// n : 50
// Output:
// 90
// Explanation:
// The numbers divisible by both 3 and 5, between 12 and 50 both inclusive are {15, 30, 45} and their sum is 90.
// Sample Input
// m : 100
// n : 160
// Sample Output
// 405

class eight{
    public static int Ans(int m,int n){
        int ans=0;
        for(int i=m;i<=n;i++){
            if(i%3==0 && i%5==0){
                ans+=i;
            }
        }
        return ans;
      }
      public static void main(String args[]){
          System.out.println(Ans(12,50));
          // System.out.println(Ans("apple",'a','p'));
      }
}