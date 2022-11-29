package Pattern;

public class HeartShape {

    public static void main(String args[]) {
        int i, j, space = 0;
        int n = 8;
        for (i = n; i >=0; i--) {
             for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (space = n -i; space >= 0; space--) {
                System.out.print(" ");
            }
            for (j =i; j >=0; j--) {
                System.out.print("*");
            }
              System.out.println();
        }
    }
}
