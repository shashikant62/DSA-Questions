// You are required to implement the following function, Int OperationChoices(int c, int n, int a , int b )
// The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments. Implement the function to return.
// ( a+ b ) , if c=1
// ( a + b ) , if c=2
// ( a * b ) ,  if c=3
// (a / b) ,  if c =4
// Assumption :
// All operations will result in integer output.
// Example:
// Input
// c :1
// a:12
// b:16
// Output:
// Since ‘c’=1 , (12+16) is performed which is equal to 28 , hence 28 is returned.
// Sample Input
//  c : 2
//  a : 16
//  b : 20
// Sample Output
// -4
class seven{
    public static int Add(int a,int b){
        return a+b;
    }
    public static int Multy(int a,int b){
        return a*b;
    }
    public static int Div(int a,int b){
        return a/b;
    }
    public static void main(String args[]){
        int c=4;
        int b=5;
        int a=10;
        switch(c){
            case 1:
            System.out.println(Add(a,b));
            break;
            case 2:
            System.out.println(Add(a,b));
            break;
            case 3:
            System.out.println(Div(a,b));
            break;
            case 4:
            System.out.println(Multy(a,b));
            break;
        }
    }
}

