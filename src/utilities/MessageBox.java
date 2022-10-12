package utilities;

import javax.swing.*;
import java.awt.*;

public class MessageBox {

    // xuất thông báo
    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message,
                "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
    }

    // thông báo xác nhận kiểu yes/no
    public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Hệ thống",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    // thông báo nhận thông tin vào
    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message,
                "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
    }
}
