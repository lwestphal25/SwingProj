import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class medium1 implements ActionListener {
    private JFrame mainFrame;
    private JLabel label1;
    private JLabel label2;

    private JPanel panel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta, ta1; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public medium1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        medium1 medium1 = new medium1();
        medium1.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("medium1");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");
        label1 = new JLabel("label 1");
        label2 = new JLabel("label 2");



        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3));


        mainFrame.add(button1, BorderLayout.NORTH);
        mainFrame.add(button3, BorderLayout.SOUTH);
        mainFrame.add(panel, BorderLayout.CENTER);
        panel.add(button2);
        panel.add(label1);
        panel.add(button4);
        panel.add(label2);
        panel.add(button5);


        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

        }
    }
}
