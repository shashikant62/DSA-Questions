class Fibonacci_recursion{
    static int fibo(int n){
    if (n == 0) 
        return 0; 
        
    if (n == 1 || n == 2) 
        return 1; 
  
    // Recursion function 
    else
        return (fibo(n - 1) + fibo(n - 2));
    }
    public static void main(String args[]){
        fibo(10);
        for (int i = 0; i < 10; i++)  
    { 
        System.out.print(fibo(i)+" "); 
    } 
    }
}