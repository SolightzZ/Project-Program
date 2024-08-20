package package2;

import package1.Circle; // นำเข้าคลาส Circle จาก package1

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);

        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Circumference: " + c1.circumference());
    }
}
