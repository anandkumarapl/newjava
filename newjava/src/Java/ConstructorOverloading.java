/*Constructor Overloading in Java
In Java, a constructor is just like a method but without return type.
It can also be overloaded like Java methods.
Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
They are arranged in a way that each constructor performs a different task.
They are differentiated by the compiler by the number of parameters in the list and their types.*/

package Java;
public class ConstructorOverloading {
int id;
String name;
int age;
public ConstructorOverloading(int i,String n){
    id=i;
    name=n; 
}
public ConstructorOverloading(int i,String n,int k){
    id=i;
    name=n;
    age=k;
}
void display(){
    System.out.println(id+""+name+""+age);
}
public static void main(String args[]){
        ConstructorOverloading p=new ConstructorOverloading(12,"August");
    ConstructorOverloading z=new ConstructorOverloading(12,"August",1999);
    p.display();
    z.display();
}
}