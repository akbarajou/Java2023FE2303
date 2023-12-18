public class Rectangle {
    private double height;
    private double base;


    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double area() {
        return this.height * this.base;
    }

    public double perimeter() {
        return 2 * (this.height + this.base);
    }
}
