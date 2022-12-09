
package Java;
public class Sagarbank {
  int id;
String name;
int age;
public Sagarbank(int i,String n,int j){
    id=i;
    name=n;
    age=j;
    System.out.print(id+""+name+""+j);
}
public int detail(){
    return age;
}
public static void main(String args[]){
    Sagarbank p=new Sagarbank(1,"sagar",25);
}
}
