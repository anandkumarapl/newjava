package ArrayD;

import java.util.Arrays;

public class RearrangeAnArray {
    public static void main(String args[]){
         int a[]={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int n=a.length-1;
       int start;
       for(int i=0;i<=n;i++){
           start=i;
           for(int j=i+1;j<=n;j++){
               if(a[j]<=a[start]){
                  int temp=a[start];
                  a[start]=a[j];
                  a[j]=temp;
               }
           }
       }
               for(int k=0;k<=n;k++){
                   System.out.print(a[k]+" ");
               }
    }
       
    }
