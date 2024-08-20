class OuterClass { // ชื่อคลาสควรเริ่มด้วยตัวพิมพ์ใหญ่ตามมาตรฐาน
    int x = 10;

    static class InnerClass { // แก้ไขจาก "Static" เป็น "static"
        int y = 5;

        public void hello() {
            System.out.println("******* H E L L O ***********");
        }
    }
}

public class MainTester {
    public static void main(String[] args) {
        // สร้างอินสแตนซ์ของ InnerClass เนื่องจากมันเป็นคลาส static
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();

        // เรียกใช้เมธอด hello() จาก InnerClass
        myInner.hello(); // เพิ่มวงเล็บเพื่อเรียกใช้เมธอด
    }
}
