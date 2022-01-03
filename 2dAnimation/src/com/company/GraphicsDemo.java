package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class GraphicsDemo extends JPanel implements ActionListener {


    Random random = new Random();
    Timer timer = new Timer(10,this);
    JLabel label;
    int x = 3;
    int y = 300;
    int velocityX = 1;
    int velocityY = 1;
    int randomX = 0;
    int randomY = 0;


    public GraphicsDemo() {

        label = new JLabel(new ImageIcon("Cat.png"));
        label.setSize(300,350);
        label.setLocation(500,500);
        this.setLayout(null);
        this.add(label);
        timer.start();


    }




    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(new Color(50,255,255));

        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(Color.YELLOW);
        g2D.fillOval(x, y,100,100);



    }




    @Override
    public void actionPerformed(ActionEvent e) {




/*
        if (x>=840 || x<=0) {
            velocityX=-velocityX;
        }


        if (y>=840 || y<=0) {
            velocityY=-velocityY;
        }
*/


       /*  randomX = random.nextInt(51)-26;
        randomY = random.nextInt(51)-26;

        x = x + randomX;
        y = y + randomY;
*/


        x = x + velocityX;
        y = x / 3 - 3 + velocityY;

        repaint();



       // label.setLocation(500,500);


    }
}
