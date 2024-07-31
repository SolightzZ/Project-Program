/*
    รหัสนักษา : 66040233122
    ชื่อ-นามสกุล : นายปณฺิธิ จ่าเหม
 */
public class Rectangle {
    private int a ;
    private int b;
    private int c;
    private int d;

    //private int wight;
    //private int height;

    public Rectangle(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c =c;
        this.d = d;
        //this.wight;
        //this.height;
    }

    public Rectangle(){};



    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 10, 20, 30);
        Rectangle box2 = box1;
        Rectangle box3 = new Rectangle(5,10,20,30);
        Rectangle box4 = new Rectangle();
        // error == Rectangle box4 = new Rectangle(); หากไม่มี  public Rectangle(){};
        // ไว้กำหนดค่าตัวคงที่ //

        if(box1 == box2) // ตรวจสอบว่าเป็น object เดียวกันหรือไม่
            System.out.println("เป็น object เดียวกัน");
        else System.out.println("เป็น object เดียวกัน");

        if(box1.equals(box2))
            System.out.println("มีค่าเดียวกัน");
        else
            System.out.println("ไม่มีค่าเท่ากัน");
    }
}
