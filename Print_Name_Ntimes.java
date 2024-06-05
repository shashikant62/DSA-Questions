//Print name N times using recursion
import java.util.*;
public class Print_Name_Ntimes{
  public static void Printname(int N,String a){
    if(N<=0){
        return;
    }
    else{
        System.out.print(a+" ");
        Printname(N-1,a);
    }
  }
  public static void main(String args[]) {
    int n = 7;
    String a="ram";
    Printname(n,a);
  }
} 