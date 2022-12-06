/*Exception Handling in Java

The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors
so that the normal flow of the application can be maintained.

Exception is an abnormal condition.

In Java, an exception is an event that disrupts the normal flow of the program.
It is an object which is thrown at runtime.

Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, 
IOException, SQLException, RemoteException, etc.

Types of Java Exceptions
There are mainly two types of exceptions: checked and unchecked. An error is considered as the unchecked exception. However, according to Oracle, there are three types of exceptions namely:

1.Checked Exception
2.Unchecked Exception
3.Error

1) Checked Exception
The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions.
For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2) Unchecked Exception
The classes that inherit the RuntimeException are known as unchecked exceptions.
For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

3) Error
Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.

Java Exception Keywords---------

try--The "try" keyword is used to specify a block where we should place an exception code. 
It means we can't use try block alone.
The try block must be followed by either catch or finally.

catch--The "catch" block is used to handle the exception. 
It must be preceded by try block which means we can't use catch block alone. 
It can be followed by finally block later.

finally--The "finally" block is used to execute the necessary code of the program.
It is executed whether an exception is handled or not.

throw--The "throw" keyword is used to throw an exception.

throws--The "throws" keyword is used to declare exceptions.
It specifies that there may occur an exception in the method. 
It doesn't throw an exception. It is always used with method signature.

ArithmeticException----

1.If we divide any number by zero, there occurs an ArithmeticException.
int a=50/0;//ArithmeticException   

*/

//using a try-catch statement to handle the exception.
package Java;
public class ExceptionHandling {
@SuppressWarnings("empty-statement")
public static void main(String args[]){
    try{//  Block of code to try
    int a=0/0;
    System.out.println(a);
}
 catch(ArithmeticException ex)//  Block of code to handle errors
 {
         System.out.print(ex);

}
 }}