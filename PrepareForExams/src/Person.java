
public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age:  " + this.age);
    }

    public String toString() {
        return "[" + this.name + ", age:" + this.age + "]";
    }
}
