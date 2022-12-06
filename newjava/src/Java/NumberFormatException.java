/*
3.NumberFormatException----
If the formatting of any variable or number is mismatched, it may result into NumberFormatException.
Suppose we have a string variable that has characters;
converting this variable into digit will cause NumberFormatException.
String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException 
 */
package Java;
public class NumberFormatException {
    public static void main(String args[]){
        try{
            String s="abc";
            int i=Integer.parseInt(s);
        }
        catch(java.lang.NumberFormatException ex){
            System.out.print(ex);
        }
    }
}
