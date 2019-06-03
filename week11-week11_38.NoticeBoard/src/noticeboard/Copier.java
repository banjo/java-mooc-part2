package noticeboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Copier implements ActionListener {

    private JTextField origin;
    private JLabel dest;

    public Copier(JTextField origin, JLabel destination) {
        this.origin = origin;
        this.dest = destination;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dest.setText(this.origin.getText());
        this.origin.setText("");
    }
}
