//print 1 to n num using recursion
import java.util.*;
public class Print_To_N{
  public static int c=1;
  public static void Printnum(int N){
    if(c>N){
        return;
    }
    else{
        System.out.print(c+" ");
        c++;
        Printnum(N);
    }
  }
  public static void main(String args[]) {
    int n = 7;
    Printnum(n);
  }
} 