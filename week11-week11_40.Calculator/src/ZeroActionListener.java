import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZeroActionListener implements ActionListener {
    private JTextField inputField;
    private JTextField outputField;
    private JButton zButton;

    public ZeroActionListener(JTextField inputField, JTextField outputField, JButton zButton) {
        this.inputField = inputField;
        this.outputField = outputField;
        this.zButton = zButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        zButton.setEnabled(false);
        outputField.setText("0");
        inputField.setText("");

    }
}
