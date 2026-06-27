/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uailogin.UaiLogin;

import Vista_L.Login_frm;
import javax.swing.SwingUtilities;

/**
 *
 * @author lusaavedra
 */
public class UaiLogin {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Usando la buena práctica con SwingUtilities
        SwingUtilities.invokeLater(() -> {
// Suponiendo que tienes una clase llamada frmLogin
            Login_frm login = new Login_frm();
            login.setVisible(true);
        });
    }
}
