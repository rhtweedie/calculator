package rht.calculator;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class GUI {

    public void createAndShowGUI() {

        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(20, 160, 120, 120);
        buttonOne.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonOne);

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(160, 160, 120, 120);
        buttonTwo.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonTwo);

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(300, 160, 120, 120);
        buttonThree.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonThree);

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(20, 300, 120, 120);
        buttonFour.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonFour);

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(160, 300, 120, 120);
        buttonFive.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonFive);

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(300, 300, 120, 120);
        buttonSix.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonSix);

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(20, 440, 120, 120);
        buttonSeven.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonSeven);

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(160, 440, 120, 120);
        buttonEight.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonEight);

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(300, 440, 120, 120);
        buttonNine.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonNine);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(440, 160, 120, 120);
        buttonDivide.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonDivide);

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(440, 300, 120, 120);
        buttonMultiply.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonMultiply);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(440, 440, 120, 120);
        buttonMinus.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonMinus);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(440, 580, 120, 120);
        buttonPlus.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonPlus);

        JButton buttonPoint = new JButton(".");
        buttonPoint.setBounds(20, 580, 120, 120);
        buttonPoint.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonPoint);

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(160, 580, 120, 120);
        buttonZero.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonZero);

        JButton buttonClear = new JButton("AC");
        buttonClear.setBounds(300, 580, 120, 120);
        buttonClear.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonClear);

        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(20, 720, 540, 120);
        buttonEquals.setFont(new FontUIResource("Ariel", FontUIResource.PLAIN, 40));
        frame.add(buttonEquals);

        JTextArea display = new JTextArea("Number", 1, 30);
        display.setBounds(20, 20, 540, 120);
        frame.add(display);

        frame.setSize(585, 880);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
