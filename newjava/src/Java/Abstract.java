/*
The abstract keyword is a non-access modifier, used for classes and methods: Abstract class: is a restricted
class that cannot be used to create objects (to access it, it must be inherited from another class). 
Abstract method: can only be used in an abstract class, and it does not have a body.

Abstraction in Java
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

There are two ways to achieve abstraction in java------------

1.Abstract class (0 to 100%)
2.Interface (100%)

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.

Abstract Method in Java-------------
A method which is declared as abstract and does not have implementation is known as an abstract method.

abstract method--------------

abstract void printStatus();//no method body and abstract  
 */
package Java;
abstract class Abstract {
    void Abstract(){
        
    }
}
