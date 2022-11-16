
package Array;
public class FindMaxMin {
    public static void main (String args[]){
        int arr[]={1,4,5,2,3,6};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                min=max;
                max=arr[i];
            }
            else if(arr[i]>min){
                min=arr[i];
            }
        }
            System.out.println(max);
              System.out.println(min);
        
    }
}
