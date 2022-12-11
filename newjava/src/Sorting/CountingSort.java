package Sorting;
public class CountingSort {
public static void main(String args[]){
    int a[]={8,6,9,3,3,6,7};
    int n=a.length-1;
    int []f=new int[10];
    for(int x:a){
        f[x]++;
          for(int i=0;i<=n-2;i++){
              f[i]=f[i]+f[i-1];
          
          System.out.println(f[i]);
    }
    }
  
}    
}
