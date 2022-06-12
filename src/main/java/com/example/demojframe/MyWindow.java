package com.example.demojframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventListener;

public class MyWindow  extends JFrame implements WindowListener, ActionListener {
    private JButton btnHi = new JButton();

    public MyWindow() throws HeadlessException {

        this.setTitle("Demo Window");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.btnHi.setText("Click here");
        this.btnHi.setBounds(10,10,120,40);
        this.btnHi.addActionListener(this);

        this.getContentPane().add(this.btnHi);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnHi){
            JOptionPane.showMessageDialog(this, "Hello World");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
