package Array;

public class PrimeNumber {

    public static void main(String args[]) {
        int i, m, flag = 0;
        int n = 11;
        m = n / 2;
        if (m == 0 || m == 1) {
            System.out.print("yes");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("no");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("yes");
            }
        }
    }
}
