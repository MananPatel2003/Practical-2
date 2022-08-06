public class circle_2_1 {
    private double radius;

    public circle_2_1() {
        radius = 1;
    }

    public circle_2_1(double r) {
        radius = r;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getPerimeter() {
        return 2 * radius * 3.14;
    }
}
