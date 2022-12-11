package Sorting;
public class SelectionShort {
    public static void main(String args[]){
        int i,j;
      int a[]={1,3,2,5,4};  
      int n=a.length-1;
for( i=0;i<=n-1;i++){
    int minmum=i;
    for( j=i+1;j<=n;j++){
   if(a[j]<a[minmum]){
      minmum=j;
      int t=a[minmum];
      a[minmum]=a[i];
      a[i]=t;
   }}
}
      for(int k=0;k<=n;k++){
          System.out.print(a[k]);
      }
   }

   
    }


