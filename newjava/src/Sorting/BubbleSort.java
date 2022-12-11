package Sorting;

public class BubbleSort {
    public static void main(String args[]){
        int a[]={5,3,2,4};
        int n=a.length-1;
        int i,j,t = 0,temp;
        for(i=0;i<=n;i++){
            for(j=0;j<=n-i-1;j++){
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                            a[j+1]=t;
                }
                }
                    
            }
        
        for(int k=0;k<=n;k++){
            System.out.print(a[k]);
        }
    }
}
