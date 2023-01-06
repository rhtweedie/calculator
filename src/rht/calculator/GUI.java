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

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(20, 160, 120, 120);
        buttonOne.setFont(new FontUIResource(buttonFont));
        frame.add(buttonOne);

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(160, 160, 120, 120);
        buttonTwo.setFont(new FontUIResource(buttonFont));
        frame.add(buttonTwo);

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(300, 160, 120, 120);
        buttonThree.setFont(new FontUIResource(buttonFont));
        frame.add(buttonThree);

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(20, 300, 120, 120);
        buttonFour.setFont(new FontUIResource(buttonFont));
        frame.add(buttonFour);

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(160, 300, 120, 120);
        buttonFive.setFont(new FontUIResource(buttonFont));
        frame.add(buttonFive);

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(300, 300, 120, 120);
        buttonSix.setFont(new FontUIResource(buttonFont));
        frame.add(buttonSix);

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(20, 440, 120, 120);
        buttonSeven.setFont(new FontUIResource(buttonFont));
        frame.add(buttonSeven);

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(160, 440, 120, 120);
        buttonEight.setFont(new FontUIResource(buttonFont));
        frame.add(buttonEight);

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(300, 440, 120, 120);
        buttonNine.setFont(new FontUIResource(buttonFont));
        frame.add(buttonNine);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(440, 160, 120, 120);
        buttonDivide.setFont(new FontUIResource(buttonFont));
        frame.add(buttonDivide);

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(440, 300, 120, 120);
        buttonMultiply.setFont(new FontUIResource(buttonFont));
        frame.add(buttonMultiply);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(440, 440, 120, 120);
        buttonMinus.setFont(new FontUIResource(buttonFont));
        frame.add(buttonMinus);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(440, 580, 120, 120);
        buttonPlus.setFont(new FontUIResource(buttonFont));
        frame.add(buttonPlus);

        JButton buttonPoint = new JButton(".");
        buttonPoint.setBounds(20, 580, 120, 120);
        buttonPoint.setFont(new FontUIResource(buttonFont));
        frame.add(buttonPoint);

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(160, 580, 120, 120);
        buttonZero.setFont(new FontUIResource(buttonFont));
        frame.add(buttonZero);

        JButton buttonClear = new JButton("AC");
        buttonClear.setBounds(300, 580, 120, 120);
        buttonClear.setFont(new FontUIResource(buttonFont));
        frame.add(buttonClear);

        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(20, 720, 540, 120);
        buttonEquals.setFont(new FontUIResource(buttonFont));
        frame.add(buttonEquals);

        display.setFont(displayFont);
        display.setBounds(20, 20, 540, 120);
        display.setEditable(false);
        frame.add(display);

        frame.setSize(585, 880);
        frame.setLayout(null);
        frame.setVisible(true);

        buttonOne.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('1');
            }
        });

        buttonTwo.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('2');
            }
        });

        buttonThree.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('3');
            }
        });

        buttonFour.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('4');
            }
        });

        buttonFive.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('5');
            }
        });

        buttonSix.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('6');
            }
        });

        buttonSeven.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('7');
            }
        });

        buttonEight.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('8');
            }
        });

        buttonNine.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('9');
            }
        });

        buttonZero.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('0');
            }
        });

        buttonDivide.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("/");
            }
        });

        buttonMultiply.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("*");
            }
        });

        buttonPlus.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("+");
            }
        });

        buttonMinus.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("-");
            }
        });

        buttonPoint.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('.');
            }
        });

        buttonClear.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay('C');
            }
        });
    }

    private void updateDisplay(char buttonPressed) {
        display.setText(calc.updateDisplay(buttonPressed));
    }
}
