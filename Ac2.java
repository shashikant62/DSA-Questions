class Ac2{
    public static int ans(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int c=sum=arr[0]+arr[1];
        if(arr.length<2){
            return -1;
        }
        return (arr[0]*arr[1]);
    }
    public static void main(String args[]){
        int arr[]={5,2,4,3,9,7,1};
        int  sum=9;
       System.out.println(ans(arr,sum));
    }
}