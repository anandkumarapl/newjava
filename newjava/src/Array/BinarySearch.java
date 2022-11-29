package Array;

public class BinarySearch {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        int start = 0, end = n - 1;
        int k = 2;
        while (true) {
            int mid = (start + end) / 2;
            if (a[mid] == k) {
                System.out.println("Found at " + mid);
                return;
            }

            if (k < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (start > end) {
                System.out.println("Not found");
                return;
            }
        }
    }
}
