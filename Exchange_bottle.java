class Exchange_bottle{
    public static int Solution(int numBottles,int numExchange){
        int ans=numBottles;
        while(numBottles>=numExchange){
            int x=numBottles/numExchange;
            numBottles=x+(numBottles-(x*numExchange));
            ans+=x;
        }
        return ans;
    }
    public static void main(String args[]){
        int numBottles=9;
        int numExchange=3;
        System.out.print(Solution(numBottles,numExchange));
    }
}