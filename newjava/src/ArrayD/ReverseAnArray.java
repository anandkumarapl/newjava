package ArrayD;
public class ReverseAnArray {
    public static void main(String args[]){
        int a[]={4, 5, 1, 2};
        int n=a.length-1;
       int start = 0,end=0;
       while(start<end){
           int temp=a[start];
           a[start]=a[end];
           a[end]=temp;
           start++;
           end++;
        }
       for(int k=n;k>=0;k--){
           System.out.print(a[k]);
       }
    }
}
