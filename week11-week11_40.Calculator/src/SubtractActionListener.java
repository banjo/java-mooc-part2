import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubtractActionListener implements ActionListener {
    private JTextField inputField;
    private JTextField outputField;
    private JButton zButton;

    public SubtractActionListener(JTextField inputField, JTextField outputField, JButton zButton) {
        this.inputField = inputField;
        this.outputField = outputField;
        this.zButton = zButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        StringChecker stringChecker = new StringChecker();

        if (!stringChecker.CheckIfNumber((inputField.getText()))) {
            inputField.setText("");
            return;
        }


        if (!inputField.getText().equalsIgnoreCase("0")) {
            zButton.setEnabled(true);
        }


        // get numbers from both fields
        int inputNumber = Integer.parseInt(inputField.getText());
        int finalNumber = subtractNumbers(Integer.parseInt(outputField.getText()), inputNumber);

        outputField.setText(Integer.toString(finalNumber));
        inputField.setText("");

    }

    private int subtractNumbers(int x, int y) {
        return x - y;
    }
}
