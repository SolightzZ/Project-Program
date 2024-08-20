package package1;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public void setRadius(double r) {         this.r = r;
    }

      public double getRadius() {
        return r;
    }

       public double circumference() {
        return (2 * 3.14 * r);
    }

        public double circumference(double r) {
        return (2 * 3.14 * r);
    }
}
