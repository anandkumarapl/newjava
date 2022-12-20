package Sorting;
public class Prattice {
    public static void main(String args[]){
        int a[]={3,8,1,2,9,3,4,2};
        int n=a.length-1;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int k=0;k<=n;k++)
        System.out.print(a[k]);
        }
}