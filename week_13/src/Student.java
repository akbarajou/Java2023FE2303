public class Student {
    private String name;
    private int ID;


    public Student(String name,int ID) {
        this.name = name;
        this.ID = ID;
    }



    @Override
    public String toString() {
        return this.name + "\t" + this.ID;
    }
}
