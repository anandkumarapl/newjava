/*
 4.ArrayIndexBoundsException--
When an array exceeds to it's size, the ArrayIndexBoundsException occurs.
there may be other reasons to occur ArrayIndexBoundsException.
Consider the following statements.
int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException  
 */
package Java;

public class ArrayIndexBoundsException {

    public static void main(String args[]) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } 
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }
}
