/*
Rules for creating Java constructor------------------------

In Java, a constructor is a block of codes similar to the method.

There are two rules defined for the constructor.
1.Constructor name must be the same as its class name
2.A Constructor must have no explicit return type

A Java constructor cannot be abstract, static, final, and synchronized


Java Default Constructor
A constructor is called "Default Constructor" when it doesn't have any parameter.

What is the purpose of a default constructor?
The default constructor is used to provide the default values to the object like 0, null, etc.,
depending on the type.
*/

package Java;
public class Constructor {
    public  Constructor(){//creating a default constructor  
  int a = 2;
  int b = 4;
  int c;
  c=a+b;
       System.out.print(c);   
    }
    public static void main(String args[]){
     Constructor p=new Constructor();//calling a default constructor  
    }
}
