import javax.swing.JOptionPane;

public class Nested {
    public static void main(String[] args) {
        String input, activity = "";

        input = JOptionPane.showInputDialog("Sclect Weather...\n : Rainy\n : Sunny\n : Snowy\n "+
                "Enter Weather choice(1/2/3) ");
        int weather = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter age");
        int age = Integer.parseInt(input);

        if (weather == 1){
            if (age>=20 && age<=60) activity = "Please take an wmberlla when go to work.";
            else activity = "take care of you";
        }

        if (weather == 2){
            if (age < 18) activity = "Enjoy swimming";
            else if (age>=19 && age<=25) activity = "Let's playing beach volleyball";
            else activity = "Enjoy laying under the sun";
        }

        if (weather == 3){
            if (age < 16) activity = "Let's make an snowman";
            else if (age>=17 && age<=45) activity = "Let's clean a snow on the load";
            else activity = "Let's watching a snow fall beside the window";
        }

        JOptionPane.showMessageDialog(null, activity);
    }
}
