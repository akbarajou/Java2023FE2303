public class Car {
    private String make;
    private String model;
    private int year;


    public Car(String model, int year, String make) {
        this.model = model;
        this.year = year;
        this.make = make;
    }


    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Year:  " + year);
        System.out.println("Make:  " + make);
    }

}
