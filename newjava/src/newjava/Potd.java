package newjava;

public class Potd {

    public static void printMatrix(int[][] a, int nrows, int ncols) {

        for (int y = 0; y <= nrows - 1; y++) {
            for (int x = 0; x <= ncols - 1; x++) {
                System.out.printf("%4d", a[y][x]);
            }
            System.out.println();
        }

    }

    public static void solve(int[][] a, int y, int x, int nrows, int ncols, int desty, int destx, int steps) throws Exception {
        if (y < 0 || y >= nrows) {
            return;
        }
        if (x < 0 || x >= ncols) {
            return;
        }
        if (y == desty && x == destx) {

            System.out.println("\nSolved in " + (steps - 2));
            a[y][x] = steps;
            printMatrix(a, nrows, ncols);
            return;
        }
        if (a[y][x] != 1) {
            return;
        }
        a[y][x] = steps;
        Thread.sleep(5000);
        System.out.println();
        printMatrix(a, nrows, ncols);

        solve(a, y, x + 1, nrows, ncols, desty, destx, steps + 1);
        solve(a, y + 1, x, nrows, ncols, desty, destx, steps + 1);
        solve(a, y, x - 1, nrows, ncols, desty, destx, steps + 1);
        solve(a, y - 1, x, nrows, ncols, desty, destx, steps + 1);
        a[y][x] = -1;
    }

    public static void main(String[] args) throws Exception {

        int a[][] = {{1, 1, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 0}, {1, 1, 0, 0}, {1, 0, 0, 1}};
        printMatrix(a, 5, 4);

        solve(a, 0, 1, 5, 4, 2, 2, 2);

    }

}
