import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlPanelProj implements ActionListener {
    private JFrame mainFrame;

    private JLabel statusLabel;
    private JPanel searchPanel, resultsPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextField url, keyword;
    private JTextArea results;
    private int WIDTH=800;
    private int HEIGHT=700;


    public ControlPanelProj() {
        prepareGUI();
    }

    public static void main(String[] args) {
        ControlPanelProj ControlPanelProj = new ControlPanelProj();
        ControlPanelProj.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("ControlPanelProj");
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

        JButton search = new JButton("search");
        search.setActionCommand("search");
        search.addActionListener(new ButtonClickListener());

        url = new JTextField("enter url", SwingConstants.CENTER);
        keyword = new JTextField("enter keyword", SwingConstants.CENTER);
        results = new JTextArea();

        searchPanel = new JPanel();
        searchPanel.setLayout(new GridLayout(1, 2));
        resultsPanel = new JPanel();
        resultsPanel.setLayout(new BorderLayout());

        mainFrame.add(searchPanel);
        mainFrame.add(resultsPanel);



        searchPanel.add(url);
        searchPanel.add(keyword);
        resultsPanel.add(search, BorderLayout.NORTH);
        resultsPanel.add(results, BorderLayout.CENTER);



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
