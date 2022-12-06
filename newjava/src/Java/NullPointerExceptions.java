/*
 2.NullPointerExceptions----
If we have a null value in any variable, performing any operation on the variable
throws a NullPointerExceptions.
String s=null;  
System.out.println(s.length());//NullPointerException  
 */
package Java;
public class NullPointerExceptions {
    public static void main(String args[]){
       try{
       
         String a = null;
         System.out.print(a.length());
    }
     catch(NullPointerException ex)
     {
                  System.out.print(ex);

     }
}
}


