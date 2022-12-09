package Java;

public class Subhambanksbi {

    int id;
    String name;
    int age;

    public Subhambanksbi(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
//        System.out.println(id + "" + name + "" + age);

    }
    public int detail(){
        return id;
    }

    public static void main(String args[]) {
        Subhambanksbi p = new Subhambanksbi(1, "subham", 20);
       
    }
}
