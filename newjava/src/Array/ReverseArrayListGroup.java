package Array;

import static Array.ReverseArrayListGroup.getReverse;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayListGroup {

    static void getReverse(ArrayList<Integer> a, int start, int end) {

        int temp;
        while (start < end) {
            temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String args[]) {

        ArrayList<Integer> arr = new ArrayList<Integer>();// {1, 2, 3, 4, 5, 6};
        int k = 3;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i : a) {
            arr.add(i);
        }
        int n = arr.size();

        System.out.println(arr);
        for (int i = 0; i <= n - 1; i += k) {
            int start = i;
            int end = start + k - 1;
            if(end>n-1)
                end=n-1;
            getReverse(arr, start, end);
            System.out.println(i + " : " + end);
        }
        System.out.println(arr);
    }
}
