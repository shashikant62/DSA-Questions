//sum of n no using recursion
//Link=https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
import java.util.*;
public class Sum_of_N{
  public static int c=1;
  public static int sum=0;
  public static int Printnum(int N){
    if(N<=0){
      return sum;
    }
      sum=c*c*c+sum;
      c++;
      Printnum(N-1);
      return sum;
  }
  public static void main(String args[]) {
    int n = 7;
    System.out.println(Printnum(n));
  }
} 