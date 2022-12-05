/*Java Parameterized Constructor
A constructor which has a specific number of parameters is called a parameterized constructor.

Why use the parameterized constructor?

The parameterized constructor is used to provide different values to distinct objects.
However, you can provide the same values also.*/
package Java;

public class ParameterizedConstructor {

    int a;
    int b;

    public ParameterizedConstructor(int i, int j) {   //creating a parameterized constructor  
        a = j;
        b = i;
    }

    void display() {
        System.out.println(a + "" + b);    //method to display the values  
    }

    public static void main(String args[]) {
        ParameterizedConstructor p = new ParameterizedConstructor(12, 23); //creating objects and passing values 
        //calling method to display the values of object  
        p.display();
    }
}
