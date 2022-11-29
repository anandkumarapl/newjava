
package Array;
public class MaximumElementInSubarray {
    public static void main(String args[]){
        int a[]={1,2,3,4};
        int n=a.length-1;
        int sum=0;
        int k=2;
        for(int i=k;i<=n;i++)
        sum=sum+a[i];
        {
          System.out.print(sum);
        }
    }
}
