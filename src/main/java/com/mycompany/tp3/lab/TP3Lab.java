
package com.mycompany.tp3.lab;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TP3Lab extends JFrame implements ActionListener {
        
    private final JTextField emailTextField;
    private final JTextField passwordTextField;

    public LoginForm() {
        setTitle("Formulario de Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        JLabel emailLabel = new JLabel("Email:");
        emailTextField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordTextField = new JTextField();

        JButton registrarButton = new JButton("Registrar");
        registrarButton.addActionListener(this); 
    }
}
