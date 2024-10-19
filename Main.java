package com.healthcare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Disease Diagnosis");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JTextField feature1Field = new JTextField(10);
        JTextField feature2Field = new JTextField(10);
        JButton predictButton = new JButton("Predict");
        JLabel resultLabel = new JLabel("Prediction: ");

        frame.add(new JLabel("Feature 1: "));
        frame.add(feature1Field);
        frame.add(new JLabel("Feature 2: "));
        frame.add(feature2Field);
        frame.add(predictButton);
        frame.add(resultLabel);

        predictButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement prediction logic here
                double feature1 = Double.parseDouble(feature1Field.getText());
                double feature2 = Double.parseDouble(feature2Field.getText());
                
                // Call the predictive model to get the result
                String prediction = "Diagnosis Result"; // Replace with actual prediction logic
                resultLabel.setText("Prediction: " + prediction);
            }
        });

        frame.setVisible(true);
    }
}
