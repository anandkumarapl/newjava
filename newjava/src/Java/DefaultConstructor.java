package Java;

public class DefaultConstructor {

    int id = 1;
    String name = "anand";

    void display() {   //method to display 
        System.out.print(id + "" + name);
    }

    public static void main(String args[]) {
        //creating objects  
        DefaultConstructor p = new DefaultConstructor();
        DefaultConstructor i = new DefaultConstructor();
        //displaying values of the object  
        p.display();
        i.display();
    }
}
