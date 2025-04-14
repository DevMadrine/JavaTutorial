package oop.jframe;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Jframe");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(420, 420);
        jFrame.setVisible(true);
        jFrame.setResizable(false);

        ImageIcon image = new ImageIcon("src/fb.png");//create image
        jFrame.setIconImage(image.getImage());//change icon on the frame
        jFrame.getContentPane().setBackground(new Color(255,0,255));
    }
}
