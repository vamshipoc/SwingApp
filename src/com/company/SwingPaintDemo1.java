package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingPaintDemo1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
                SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");


        createUI(f);
        f.setVisible(true);
    }

    private static void createUI(final JFrame frame){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);

//        JTextField t1,t2;
//        t1=new JTextField("Welcome to Javatpoint.");
//
//        t2=new JTextField("AWT Tutorial");
//
//        frame.add(t1); frame.add(t2);
//        t1.setBounds(100,100, 200,50);
//        t2.setBounds(100,150, 200,50);

        JButton okButton = new JButton("Ok");

        JButton cancelButton = new JButton("Cancel");

        cancelButton.setEnabled(false);
        JButton submitButton = new JButton("Submit");



        JTextArea ta = new JTextArea("Random details");
        ta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ta.setBounds(10,30, 200,200);
        frame.add(ta);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            ta.setText("John peters SW1aaa");

            }
        });

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Submit Button clicked.");
            }
        });

        frame.getRootPane().setDefaultButton(submitButton);

        panel.add(okButton);
        panel.add(cancelButton);
        panel.add(submitButton);

        frame.getContentPane().add(panel, BorderLayout.SOUTH);
    }
}