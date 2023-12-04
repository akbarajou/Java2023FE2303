public class Student {
    private String name;
    private int ID;
    private String major;


//    public Student(String name, int ID, String major) {
//        this.name = name;
//        this.ID = ID;
//        this.major = major;
//    }



    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public String toString() {
        return "Name: " + this.name + "\nID: " + this.ID + "\nMajor: " + this.major;
    }
}
