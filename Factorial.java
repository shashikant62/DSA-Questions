//sum of n no using recursion
import java.util.*;
public class Factorial{
  public static int c=1;
  public static void fact(int N){
    if(n == 0)
   {
       return 1;
   }
   return n * factorial(n-1);
  }
  public static void main(String args[]) {
    int n = 7;
    fact(n);
  }
} 