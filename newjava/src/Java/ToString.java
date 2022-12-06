/*Java toString() Method
If you want to represent any object as a string, toString() method comes into existence.

The toString() method returns the String representation of the object.

If you print any object, Java compiler internally invokes the toString() method on the object.

So overriding the toString() method, returns the desired output, it can be the state of an object etc.

depending on your implementation.*/

package Java;
public class ToString {
    String name;
    int age;
    int id;
    public ToString(String name,int age,int id){
        this.age=age;
        this.name=name;
        this.id=id;
        System.out.print(id+""+name+""+age);
    }
    public static void main(String args[]){
        ToString p=new ToString("anand",22,1);
        p.toString();
    }
}
