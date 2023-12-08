public class Student {
    private String name;
    private int ID;
    private String groupID;

    public Student(String name,int ID, String groupID) {
        this.name = name;
        this.ID = ID;
        this.groupID = groupID;
    }


    public String toString() {
        return "Name: " + this.name + "\nID: " + this.ID + "\nGroup ID: " + this.groupID;
    }
}
