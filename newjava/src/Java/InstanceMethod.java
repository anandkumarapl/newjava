/*
 Instance method are methods which require an object of its class to be created before it can be called.
To invoke a instance method, we have to create an Object of the class in which the method is defined. 
 */
package Java;

public class InstanceMethod {

    String name;
    /* Instance method to be called within the
     same class or from a another class defined
     in the same package or in different package.*/
public void Satish(String name){
this.name=name;
}

class Anand{
   public  void main(String args[]){
        InstanceMethod p=new InstanceMethod();
        System.out.print(p);
    }
}
}
