//Print name N to 1 times using recursion
//Link=https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-n-to-1-without-loop
import java.util.*;
public class Print_N_to_one{
  public static void Printnum(int N){
    if(N<=0){
        return;
    }
        System.out.print(N+" ");
        Printnum(N-1);
  }
  public static void main(String args[]) {
    int n = 7;
    Printnum(n);
  }
} 