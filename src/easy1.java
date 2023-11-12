import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class easy1 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta, ta1; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public easy1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        easy1 easy1 = new easy1();
        easy1.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("esay1");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 3));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton okButton = new JButton("button 1");
        JButton submitButton = new JButton("button 2");
        JButton cancelButton = new JButton("button 3");
        JButton resetButton = new JButton("button 4");
        JButton startButton = new JButton("button 5");


        okButton.setActionCommand("button 1");
        submitButton.setActionCommand("button 2");
        cancelButton.setActionCommand("button 3");
        resetButton.setActionCommand("button 4");
        startButton.setActionCommand("button 5");


        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
        resetButton.addActionListener(new ButtonClickListener());
        startButton.addActionListener(new ButtonClickListener());



        mainFrame.add(okButton);
        mainFrame.add(submitButton);
        mainFrame.add(cancelButton);
        mainFrame.add(resetButton);
        mainFrame.add(startButton);


        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else if (command.equals("Cancel")){
                statusLabel.setText("Cancel Button clicked.");
            } else if (command.equals("Reset")){
                statusLabel.setText("Reset Button clicked.");
            } else if (command.equals("Start")) {
                statusLabel.setText("Start Button clicked.");
            }
            else {
                statusLabel.setText("No Button Clicked");
            }
        }
    }
}