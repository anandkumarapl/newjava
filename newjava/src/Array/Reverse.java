package Array;

import java.util.Arrays;

public class Reverse {
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
        int[] arr = {55,77,88,11,33,44};
        int k = 3;
        int n = arr.length;
        for (int i = 0; i <= n - 1; i += k) {
            int start = i;
            int end = start + k - 1;
            if (end > n - 1) {
                end = n - 1;
            }
            getReverse(arr, start, end);
          
                System.out.println(start+":"+end);
            
                
            }
           System.out.println(Arrays.toString(arr));

        }
    }

