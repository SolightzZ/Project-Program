/*
    รหัสนักษา : 66040233122
    ชื่อ-นามสกุล : นายปณฺิธิ จ่าเหม
 */
import javax.swing.JOptionPane;

public class CaseWeath {
    public static void main(String[] args) {
        String input, activity = "";

        input = JOptionPane.showInputDialog("Enter weather (1: Rainy, 2: Sunny, 3: Snowy)");
        int weather = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter age");
        int age = Integer.parseInt(input);

        switch (weather) {
            case 1:
                if (age >= 20 && age <= 60) {
                    activity = "Please take an umbrella when going to work.";
                } else {
                    activity = "Take care of yourself.";
                }
                break;
            case 2:
                if (age < 18) {
                    activity = "Enjoy swimming.";
                } else if (age >= 19 && age <= 25) {
                    activity = "Let's play beach volleyball.";
                } else {
                    activity = "Enjoy laying under the sun.";
                }
                break;
            case 3:
                if (age < 16) {
                    activity = "Let's make a snowman.";
                } else if (age >= 17 && age <= 45) {
                    activity = "Let's clean the snow off the road.";
                } else {
                    activity = "Let's watch the snowfall beside the window.";
                }
                break;
            default:
                activity = "Invalid weather condition.";
                break;
        }
        JOptionPane.showMessageDialog(null, activity);
    }
}