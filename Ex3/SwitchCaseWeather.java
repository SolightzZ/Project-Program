/*
    รหัสนักษา : 66040233122
    ชื่อ-นามสกุล : นายปณฺิธิ จ่าเหม
 */
import javax.swing.JOptionPane;

public class SwitchCaseWeather {
    public static void main(String[] args) {
        String input, activity = "";

        input = JOptionPane.showInputDialog("Enter weather => (1: Rainy, 2: Sunny, 3: Snowy)");
        int weather = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter age");
        int age = Integer.parseInt(input);

        switch (weather) {
            case 1:
                if (age >= 20 && age <= 60) { activity = "Please take an umbrella when going to work.";}
                else {activity = "take care of you.";}
                    break;
            case 2:
                if (age < 18) {activity = "Enjoy swimming.";}
                else if (age >= 19 && age <= 25) { activity = "Let's play beach volleyball.";}
                else {activity = "Enjoy laying under the sun.";}
                    break;
            case 3:
                if (age < 16) {activity = "Let's make a snowman.";}
                else if (age >= 17 && age <= 45) {activity = "Let's clean the snow off the road.";}
                else {activity = "Let's watch the snowfall beside the window.";}
                    break;
            default: activity = "Thank you";
                    break;
        }
        JOptionPane.showMessageDialog(null, activity);
    }
}

/*
SwitchCaseWeather

String x = "Hello";
system.out.println(xcharAt(1))

String x = "SSSS";
char y ='a';
int z = ' 1';

if(z == 10) - > true/false

if(x == "hello") //error

if(x.equals("hello")) --> false
if(x.equals IgnoreCase("Hello")) -- >

equals คือ เปรียบเทียบกัน หรือ ต้องเหมือนกัน
equalsIgnoreCase คือ ไม่สนใจตัวอักษร เล็กใหญ่ ในภาษาอังกฤษ

String str = "ไม่มีค่าว่าง"
String str = null = ว่างเลย ฟรือ ไม่มีค่าอะไร

String middle = null;
System.out.println(middle);


* */
