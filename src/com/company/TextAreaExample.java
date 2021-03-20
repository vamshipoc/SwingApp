package com.company;

import com.github.javafaker.Faker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TextAreaExample
{

    public static void main(String args[])
    {
        JFrame f= new JFrame();
//        JTabbedPane tabbedPane = new JTabbedPane();
//        ImageIcon icon = new ImageIcon();
//
//
//
//
//        tabbedPane.addTab("Tab 1", icon, f,
//                "Does nothing");
//        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);




        Faker fa = new Faker();

        JTextArea area=new JTextArea("Random details");
        area.setBounds(100,30, 300,100);
        f.add(area);
        f.setSize(700,700);

        JButton okButton = new JButton("Generate");
        okButton.setBounds(100,200, 100,40);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                area.setText("First Name : "+ fa.name().firstName() + "\nSecond Name : "+ fa.name().lastName()+ "\nPost Code : "+fa.address().zipCode());

            }
        });

    f.add(okButton);
        f.setLayout(null);
        f.setVisible(true);
    }}