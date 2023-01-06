package rht.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class GUI {

    private final FontUIResource buttonFont = new FontUIResource("Ariel", FontUIResource.PLAIN, 40);
    private final FontUIResource displayFont = new FontUIResource("Ariel", FontUIResource.PLAIN, 60);
    private final Calculator calc = new Calculator();
    JTextField display = new JTextField(16);

    public GUI() {

        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addButton(frame, buttonFont, "1", '1', 20, 160, 120, 120);
        addButton(frame, buttonFont, "2", '2', 160, 160, 120, 120);
        addButton(frame, buttonFont, "3", '3', 300, 160, 120, 120);
        addButton(frame, buttonFont, "4", '4', 20, 300, 120, 120);
        addButton(frame, buttonFont, "5", '5', 160, 300, 120, 120);
        addButton(frame, buttonFont, "6", '6', 300, 300, 120, 120);
        addButton(frame, buttonFont, "7", '7', 20, 440, 120, 120);
        addButton(frame, buttonFont, "8", '8', 160, 440, 120, 120);
        addButton(frame, buttonFont, "9", '9', 300, 440, 120, 120);
        addButton(frame, buttonFont, "/", '/', 440, 160, 120, 120);
        addButton(frame, buttonFont, "*", '*', 440, 300, 120, 120);
        addButton(frame, buttonFont, "-", '-', 440, 440, 120, 120);
        addButton(frame, buttonFont, "+", '+', 440, 580, 120, 120);
        addButton(frame, buttonFont, ".", '.', 20, 580, 120, 120);
        addButton(frame, buttonFont, "0", '0', 160, 580, 120, 120);
        addButton(frame, buttonFont, "AC", 'C', 300, 580, 120, 120);
        addButton(frame, buttonFont, "=", '=', 20, 720, 540, 120);

        display.setFont(displayFont);
        display.setBounds(20, 20, 540, 120);
        display.setEditable(false);
        frame.add(display);

        frame.setSize(585, 880);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void addButton(JFrame frame, FontUIResource font, String text, char buttonID, int x, int y, int width,
            int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        button.setFont(new FontUIResource(font));
        frame.add(button);

        button.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay(buttonID);
            }
        });
    }

    private void updateDisplay(char buttonPressed) {
        display.setText(calc.updateDisplay(buttonPressed));
    }

}
