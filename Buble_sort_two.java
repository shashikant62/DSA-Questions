class  Buble_sort_two{
    public static void Sort(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int a[]={64, 25, 12, 22, 11};
        Sort(a,5);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}