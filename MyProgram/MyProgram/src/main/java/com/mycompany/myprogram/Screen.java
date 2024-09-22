/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myprogram;

/**
 *
 * @author User
 */

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Screen {
    private final JFrame frame;
    public final JLabel label;
    private final JPanel panel;
    private final MyTime myTime;
    public int width, height;
    
    public Screen(int width, int height){
        frame = new JFrame();
        label = new JLabel();
        panel = new JPanel();
        
        panel.setLayout(null);
        panel.setBackground(new Color(255, 219, 219));
        
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        panel.add(label);
        
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
    
}
