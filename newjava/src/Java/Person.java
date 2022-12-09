package Java;
abstract class Person{  
  abstract void detail();  
}  
class Anand extends Person{  
void detail(){
System.out.println("they are eating food");
}  
public static void main(String args[]){  
 Person p = new Anand();  
 p.detail();  
}  
}  