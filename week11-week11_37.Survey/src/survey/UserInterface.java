package survey;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(200, 200));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }

    public void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        JLabel areYou = new JLabel("Are you?");
        container.add(areYou);

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("no!");
        container.add(yes);
        container.add(no);

        JLabel why = new JLabel("Why?");
        container.add(why);

        ButtonGroup whyGroup = new ButtonGroup();
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton reasonFun = new JRadioButton("Because it is fun!");
        whyGroup.add(noReason);
        whyGroup.add(reasonFun);
        container.add(noReason);
        container.add(reasonFun);

        JButton done = new JButton("Done!");
        container.add(done);
    }


    public JFrame getFrame() {
        return frame;
    }
}
