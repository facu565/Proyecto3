/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import static com.sun.glass.ui.Cursor.setVisible;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author facu
 */
public class login1 extends JFrame {

    public login1() {
        iniciarComponentes();
        setVisible(true);
    }


    private void iniciarComponentes() {

        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        Object[] message = {
            "Username:", username,
            "Password:", password
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (username.getText().equals("facu") && password.getText().equals("123")) {
                System.out.println("Login successful");
                Frame v2 = new Frame();
            } else {
                System.out.println("login failed");
            }
        } else {
            System.out.println("Login canceled");
        }
    }
}
