//Link=https://leetcode.com/problems/reverse-words-in-a-string/
//reverce the line
import java.util.*;
class Rever_line{
    public static void remove(String s){
        String arr[]=s.trim().split("\\s+");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        String s="the sky is blue";
        remove(s);
    }
}