/*Java Copy Constructor
There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in Java. They are:

By constructor
By assigning the values of one object into another
By clone() method of Object class
*/
package Java;
public class CopyConstructor {
    int id;
    String name;
    int age;
    public CopyConstructor(int i,String n,int j){
      id=i;
      name=n;
      age=j;
    }
    public CopyConstructor(CopyConstructor s){
        id=s.id;
        name=s.name;
    }
    void display(){
        System.out.println(id+""+name+""+""+age);
    }
    public static void main(String args[]){
      CopyConstructor p=new CopyConstructor(1,"anand",22);
        CopyConstructor z=new CopyConstructor(p);
      p.display();
      z.display();
    }
    
}
