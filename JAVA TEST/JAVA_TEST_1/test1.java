import javax.swing.JOptionPane;

public class test1 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 1;
        double x = (-b + Math.sqrt(Math.pow(b,2)-4*a*c)) / (2*a);

        System.out.println("x = " +x);
        System.out.println(Math.round(14.25));

        double balance = 120.75;
        int dollar = (int)balance;
        System.out.println("Dollar = " + dollar);

        String message = "Paniti Jahem";
        System.out.println(message + " length : " + message.length());
        System.out.println(message.substring(0,12));

        /*
        String xx = "10" , yy = "120.25";
        int num = Integer.parseInt(xx);
        double price = Double.parseDouble(yy);
         */

        JOptionPane.showMessageDialog(null,"Hello , " + message);
    }
}
