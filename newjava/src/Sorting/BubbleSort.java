package Sorting;

public class BubbleSort {
    public static void main(String args[]){
        int a[]={3,55,32,22,77,22,55,66};
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
            System.out.print(a[k]+" ");
        }
    }
}
