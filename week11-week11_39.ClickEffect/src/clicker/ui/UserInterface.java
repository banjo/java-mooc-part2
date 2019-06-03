package clicker.ui;

import clicker.applicationlogic.Calculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;

    public UserInterface(Calculator calculator) {
        this.calc = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());

        JButton clickButton = new JButton("Click!");
        container.add(clickButton, BorderLayout.SOUTH);

        JLabel clicksLabel = new JLabel("0");
        container.add(clicksLabel, BorderLayout.WEST);

        ClickListener clickListener = new ClickListener(calc, clicksLabel);
        clickButton.addActionListener(clickListener);


    }

    public JFrame getFrame() {
        return frame;
    }
}
