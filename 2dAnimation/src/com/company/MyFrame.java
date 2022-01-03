package com.company;

import javax.swing.*;

public class MyFrame extends JFrame {


    GraphicsDemo graphicsDemo = new GraphicsDemo();

    public MyFrame() {

        this.setSize(840,840);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(graphicsDemo);
        this.setVisible(true);



    }


}
