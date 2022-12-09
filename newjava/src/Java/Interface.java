/*
An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction
. There can be only abstract methods in the Java interface, not method body.
It is used to achieve abstraction and multiple inheritance in Java

you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.

use Java interface?---------------
There are mainly three reasons to use interface. They are given below.

It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.

 declare an interface?------------
An interface is declared by using the interface keyword.
It provides total abstraction; means all the methods in an interface are declared with the empty body, 
and all the fields are public, static and final by default.
A class that implements an interface must implement all the methods declared in the interface.
--------------------------
Interface fields are public, static and final by default, 
and the methods are public and abstract.
 */
package Java;
interface person{  
void detail();  
}  
class Interface implements person{  
public void detail()
{
    System.out.println("Hello");
}  
  
public static void main(String args[]){  
Interface p1 = new Interface();  
p1.detail();  
 }  
}  
