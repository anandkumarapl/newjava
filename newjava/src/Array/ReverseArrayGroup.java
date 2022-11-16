package Array;

import static Array.ReverseArrayGroup.getReverse;
import java.util.Arrays;

public class ReverseArrayGroup {

    static void getReverse(int a[], int start, int end) {

        int temp;
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length - 1; i++) {
        }
        getReverse(arr,0,k-1);
        getReverse(arr, n, n-k);
 for (int i = 0; i <= arr.length - 1; i++) {

        }
        System.out.println(Arrays.toString(arr));
getReverse(arr,0,k-1);
    }
        
}
