import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class hard implements ActionListener {
    private JFrame mainFrame;
    private JLabel top0a_L;
    private JLabel top0b_L;
    private JLabel top0c_L;
    private JLabel top0d_L;
    private JLabel top0e_L;
    private JLabel topright_L;
    private JLabel zero1;
    private JLabel zero2;
    private JLabel zero3;
    private JLabel zero4;
    private JLabel zero5;


    private JPanel toprow;
    private JPanel topleft;
    private JPanel topright;
    private JPanel bottomrow;
    private JPanel bottom;

    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta;
    private int WIDTH=800;
    private int HEIGHT=700;


    public hard() {
        prepareGUI();
    }

    public static void main(String[] args) {
        hard hard = new hard();
        hard.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("hard");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        ta = new JTextArea();

        JButton button1 = new JButton("Top 1");
        JButton button2 = new JButton("Top 2");
        JButton button3 = new JButton("Top 3");
        JButton button4 = new JButton("Top 4");
        JButton b1a = new JButton("1");
        JButton b1b = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");



        top0a_L = new JLabel("Top 0", SwingConstants.CENTER);
        top0b_L = new JLabel("Top 0", SwingConstants.CENTER);
        top0c_L = new JLabel("Top 0", SwingConstants.CENTER);
        top0d_L = new JLabel("Top 0", SwingConstants.CENTER);
        top0e_L = new JLabel("Top 0", SwingConstants.CENTER);
        topright_L = new JLabel("TopRight", SwingConstants.CENTER);
        zero1 = new JLabel("0", SwingConstants.CENTER);
        zero2 = new JLabel("0", SwingConstants.CENTER);
        zero3 = new JLabel("0", SwingConstants.CENTER);
        zero4 = new JLabel("0", SwingConstants.CENTER);
        zero5 = new JLabel("0", SwingConstants.CENTER);



        top0a_L = new JLabel("Top 0", SwingConstants.CENTER);
        top0b_L = new JLabel("Top 0", SwingConstants.CENTER);
        top0c_L = new JLabel("Top 0", SwingConstants.CENTER);
        top0d_L = new JLabel("Top 0", SwingConstants.CENTER);
        top0e_L = new JLabel("Top 0", SwingConstants.CENTER);
        topright_L = new JLabel("TopRight", SwingConstants.CENTER);
        zero1 = new JLabel("0", SwingConstants.CENTER);
        zero2 = new JLabel("0", SwingConstants.CENTER);
        zero3 = new JLabel("0", SwingConstants.CENTER);
        zero4 = new JLabel("0", SwingConstants.CENTER);
        zero5 = new JLabel("0", SwingConstants.CENTER);




        toprow = new JPanel();
        toprow.setLayout(new GridLayout(1, 2));
        topleft = new JPanel();
        topleft.setLayout(new GridLayout(3, 3));
        topright = new JPanel();
        topright.setLayout(new GridLayout(2, 1));
        bottomrow = new JPanel();
        bottomrow.setLayout(new BorderLayout());
        bottom = new JPanel();
        bottom.setLayout(new GridLayout(1, 9));



        mainFrame.add(toprow);
        mainFrame.add(bottomrow);
        toprow.add(topleft);
        toprow.add(topright);
        bottomrow.add(bottom, BorderLayout.SOUTH);

        topleft.add(top0e_L);
        topleft.add(button1);
        topleft.add(top0a_L);
        topleft.add(button2);
        topleft.add(top0b_L);
        topleft.add(button3);
        topleft.add(top0c_L);
        topleft.add(button4);
        topleft.add(top0d_L);

        topright.add(topright_L);
        topright.add(b1a);

        bottomrow.add(ta, BorderLayout.CENTER);
        bottom.add(zero1);
        bottom.add(b1b);
        bottom.add(zero2);
        bottom.add(b2);
        bottom.add(zero3);
        bottom.add(b3);
        bottom.add(zero4);
        bottom.add(b4);
        bottom.add(zero5);


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

