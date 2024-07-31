/*
        รหัสนักษา : 66040233122
        ชื่อ-นามสกุล : นายปณฺิธิ จ่าเหม
 */
/*
    รหัสนักษา : 66040233122
    ชื่อ-นามสกุล : นายปณฺิธิ จ่าเหม
 */

import javax.swing.*;

public class SwitchCase {
    public static void main(String[] args) {
        String input;
        char product;
        double price;

        input = JOptionPane.showInputDialog("Enter product type(A/B/C/D) => ");
            product = input.charAt(0);

            switch(product) {
                case 'A':
                    price = 1000.0; break;
                case 'B':
                    price = 500.0; break;
                case 'C':
                    price = 200.0; break;
                case 'D':
                    price = 100.0; break;
                default: price = 0.0;

            }
            JOptionPane.showMessageDialog(null, "Unit price : " + price);
    }
}
