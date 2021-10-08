package Lesson07;

import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame {

    private int winWidth = 1200;
    private int winHeight = 500;

    AppWindow() {

        setupWindow();
        setupKnob();

    }
        private void setupWindow() {
        setSize(winWidth, winHeight);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Test Window for 7 lesson");
        }

                private void setupKnob() {
                setLayout(new FlowLayout(FlowLayout.RIGHT));

                JButton knobSuccess = new JButton("Твой успех");
                JButton knobFault = new JButton("Твоя ошибка");
                add(knobSuccess);
                add(knobFault);
                knobSuccess.setBackground(Color.red);
                setVisible(true);
                }

}
