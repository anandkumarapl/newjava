package Array;

import java.util.ArrayList;

public class List {

    public static void main(String args[]) {
        ArrayList<Integer> reverse = new ArrayList<Integer>();
        reverse.add(9);
        reverse.add(8);

        System.out.println(reverse);
        int x = reverse.get(0);
        int y = reverse.get(1);
        reverse.set(0, y);
        reverse.set(1, x);
        System.out.println(reverse);

    }
}
