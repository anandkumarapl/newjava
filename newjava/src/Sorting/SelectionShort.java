package Sorting;
public class SelectionShort {
    public static void main(String args[]){
      int a[]={3,55,32,22,77,22,55,66};  
      int n=a.length-1;
for(int i=0;i<=n;i++){
    int minmum=i;
    for(int j=i+1;j<=n;j++){
   if(a[j]<a[minmum]){
      int t=a[minmum];
      a[minmum]=a[j];
      a[j]=t;
   }}
}
      for(int k=0;k<=n;k++){
          System.out.print(a[k]+" ");
      }
   }

   
    }


