package Sorting;
public class InsertionSort {
    public static void main(String args[]){
        int a[]={2,4,5,6,3};
        int n=a.length-1;
        int i;
        for(i=0;i<=n-1;i++){
            if (a[i]<=a[i+1])
            {
                continue;
            }
            int t=a[i+1];
            int j = i+1;
            while(j>=1 && a[j-1]>t)
            {
                a[j] = a[j-1];
                j-=1;
            }
            a[j] = t;
            
        }
        for(i=0;i<=n;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
