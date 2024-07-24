class Factorial_rec{
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[]){
        // fibo(10);
        System.out.print(fact(10)+" ");
    }
}