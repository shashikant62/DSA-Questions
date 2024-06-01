import java.util.*;
import java.lang.*;
import java.io.*;
class one_KthSmall
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p,k,y;
		for(int i=0;i<n;i++){
		    int l=0;
		    p=s.nextInt();
		    k=s.nextInt();
		    for(int j=0;j<p;j++){
		      y=s.nextInt();
		      if(k<y){
		          l++;
		      }
		    }
		    System.out.println(l);
		}
		
	}
}
