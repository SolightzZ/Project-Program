import javax.swing.*;
import java.util.jar.JarOutputStream;

public class IfEx1 {
    public static void main(String[] args) {
        //double midScore, finalScore, totalScore;
        String input;
        input = JOptionPane.showInputDialog("Enter midterm score");
        double midScore = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter final Score");
        double finalSCore = Double.parseDouble(input);

        double totalSCore = midScore + finalSCore;

        if (totalSCore >= 60 ){
            JOptionPane.showMessageDialog(null,"Score is" +
                    totalSCore + "\nYou Passed");
        }
        else{
            JOptionPane.showMessageDialog(null,"Score is" +
                    totalSCore + "\nYou Failed");
        }
    }
}
