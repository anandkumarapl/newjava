package Array;

public class FindMissingNumber {

    public static void main(String args[]) {
        int n = 5;
        int a[] = {1, 2, 4, 5};
        int fullsum = 0;
//        for (int is = 1; i <= n; i++) {
//            fulli;= i;
//        }
        fullsum = (n * (n + 1)) / 2;
        for (int i : a) {
            fullsum -= i;
        }
        System.out.println(fullsum);

    }
}
