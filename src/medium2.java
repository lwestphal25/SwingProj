import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class medium2 implements ActionListener {
    private JFrame mainFrame;
    private JLabel label1;
    private JPanel panel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta, ta1; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public medium2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        medium2 medium2 = new medium2();
        medium2.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("medium2");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3, 3));

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
        JButton button6 = new JButton("button 6");
        JButton button7 = new JButton("button 7");
        JButton button8 = new JButton("button 8");
        JButton button9 = new JButton("button 9");
        JButton button10 = new JButton("button 10");
        label1 = new JLabel("label", SwingConstants.CENTER);



        panel = new JPanel();
        panel.setLayout(new BorderLayout());


        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(panel);
        panel.add(button9, BorderLayout.EAST);
        panel.add(button10, BorderLayout.SOUTH);
        panel.add(label1, BorderLayout.CENTER);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);


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

