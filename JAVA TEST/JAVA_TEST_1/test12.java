import javax.swing.JOptionPane;

public class test12 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name : ");

        String input ;
        input = JOptionPane.showInputDialog("Enter your weight(kg.) : ");
        double w = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter your height(cm.) : ");
        double h = Double.parseDouble(input);

        double bmi = w / Math.pow(h/100 , 2);a

        JOptionPane.showMessageDialog(null, "Hello , " + name + "\n Your BMI is " +bmi);

    }
}
