package Array;

public class SecondLargest {

    public static void main(String args[]) {
        int a[] = {12, 35,99, 1, 10, 34, 1,75,88};
        int m1 = a[0];
        int m2=a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] >=m1) {
               m2=m1;
               m1=a[i];
            }
            else if(a[i]>m2)
            {
                m2 = a[i];
            }
        }
        System.out.println(m1);
        System.out.println(m2);
    }
}
