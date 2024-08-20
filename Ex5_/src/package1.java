Package package1;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public void setRaduis(double r) {
        this.r = r;
    }

    public double getRaduis() {
        return r;
    }

    public double circmference() {
        return (2 * 3.13 * r);
    }

    public double circmference(double r) {
        return (2 * 3.14 * r);
    }

}

public void main() {
}