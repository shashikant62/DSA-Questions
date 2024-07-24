// Coding Question 7
// You are given a function, Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);
// The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.
// Assumption: String Contains only lower-case alphabetical letters.
// Note:
// Return null if string is null.
// If both characters are not present in string or both of them are same , then return the string unchanged.
// Example:

// Input:
// Str: apples
// ch1:a
// ch2:p
// Output:
// Paales
// Explanation:
// ‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales.


class six{
    public static String Ans(String s,char c1,char c2){
      String ans="";
      if(s.length()==0){
        return null;
      }
      for(int i=0;i<s.length();i++){
        char a=s.charAt(i);
        if(a==c1){
            ans+=c2;
        }
        else if(a==c2){
            ans+=c1;
        }
        else{
            ans+=a;
        }
      }
      return ans;
    }
    public static void main(String args[]){
        System.out.println(Ans("apple",'a','p'));
        // System.out.println(Ans("apple",'a','p'));
    }
}

