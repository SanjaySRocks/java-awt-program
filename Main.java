package org.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public Main()
    {
        Frame frame = new Frame("My App");

        Label label = new Label("Enter Name:");
        label.setBounds(30, 120, 120, 20);

        TextField txtfield = new TextField();
        txtfield.setBounds(30, 150, 120, 20);

        Button btn = new Button("Click");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.green);
        btn.setBounds(30, 180, 120, 30);

        frame.add(btn);
        frame.add(txtfield);
        frame.add(label);

        frame.setSize(450, 350);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        new Main();

    }
}