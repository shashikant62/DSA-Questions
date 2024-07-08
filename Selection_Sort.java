class  Selection_Sort{
    public static void Sort(int a[],int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;

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