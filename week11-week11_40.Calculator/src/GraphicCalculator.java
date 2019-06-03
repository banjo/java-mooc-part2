
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private JButton zButton;
    private JTextField inputField;
    private JTextField outputField;
    private AdditionActionListener additionActionListener;
    private SubtractActionListener subtractActionListener;
    private ZeroActionListener zeroActionListener;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 150));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {

        this.zButton = new JButton("Z");
        this.inputField = new JTextField();
        this.outputField = new JTextField("0");
        this.additionActionListener = new AdditionActionListener(inputField, outputField, zButton);
        this.subtractActionListener = new SubtractActionListener(inputField, outputField, zButton);
        this.zeroActionListener = new ZeroActionListener(inputField, outputField, zButton);

        container.setLayout(new GridLayout(3, 1));

        outputField.setEnabled(false);
        container.add(outputField);
        container.add(inputField);

        JPanel bottomPanel = createJPanel();
        container.add(bottomPanel);

    }


    public JPanel createJPanel() {
        JPanel jPanel = new JPanel(new GridLayout(1,3));

        JButton plus = new JButton("+");
        jPanel.add(plus);

        JButton minus = new JButton("-");
        jPanel.add(minus);

        JButton zButton = this.zButton;
        zButton.setEnabled(false);
        jPanel.add(zButton);

        plus.addActionListener(this.additionActionListener);
        minus.addActionListener(this.subtractActionListener);
        zButton.addActionListener(this.zeroActionListener);


        return jPanel;
    }

    public JFrame getFrame() {
        return frame;
    }

}
