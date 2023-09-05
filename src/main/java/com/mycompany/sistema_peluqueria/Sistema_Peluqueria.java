/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistema_peluqueria;

/**
 *
 * @author Casa
 */
import javax.swing.*;

public class Sistema_Peluqueria {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

}
