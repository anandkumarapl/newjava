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

Abstraction in Java
Abstraction एक प्रक्रिया है जिसमें implementation को छुपा दिया जाता है और user को केवल functionality को ही show किया जाता है.
दूसरे शब्दों में कहें तो, “यह user को केवल आवश्यक जानकारी ही show करता है और जो background की details होती हैं उन्हें hide कर दिया जाता है.”

उदाहरण के लिए:- हम whatsapp में message को type करते है और उसे send कर देते है.
लेकिन हमें उसकी internal working के बारें में पता नहीं होता कि message कैसे send होता है.
 */
package Java;
abstract class Bike{  
  abstract void run();  
} 
class Honda extends Bike{  
//@Override
void run()
{
    System.out.println("running safely");
}  
public static void main(String args[]){  
 Honda p1 = new Honda();  
 p1.run();  
}  
}  
