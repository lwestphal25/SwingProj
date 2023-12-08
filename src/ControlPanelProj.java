import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.*;

public class ControlPanelProj implements ActionListener {
    private JFrame mainFrame;

    private JLabel urlLabel, keywordLabel;
    private JPanel searchPanel, resultsPanel, urlPanel, keywordPanel;
    private JScrollPane scroll;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea url, keyword;
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

        JButton search = new JButton("Search");
        search.setActionCommand("Search");
        search.addActionListener(new ButtonClickListener());

        url = new JTextArea();
        keyword = new JTextArea();

        results = new JTextArea();
        JScrollPane scroll = new JScrollPane(results);

        urlLabel = new JLabel("URL:", SwingConstants.CENTER);
        keywordLabel = new JLabel("Keyword:", SwingConstants.CENTER);

        searchPanel = new JPanel();
        searchPanel.setLayout(new GridLayout(1, 2));
        resultsPanel = new JPanel();
        resultsPanel.setLayout(new BorderLayout());
        urlPanel = new JPanel();
        urlPanel.setLayout(new BorderLayout());
        keywordPanel = new JPanel();
        keywordPanel.setLayout(new BorderLayout());

        mainFrame.add(searchPanel);
        searchPanel.add(urlPanel);
        searchPanel.add(keywordPanel);
        urlPanel.add(urlLabel, BorderLayout.NORTH);
        urlPanel.add(url, BorderLayout.CENTER);
        keywordPanel.add(keywordLabel, BorderLayout.NORTH);
        keywordPanel.add(keyword, BorderLayout.CENTER);
        mainFrame.add(resultsPanel);
        resultsPanel.add(search, BorderLayout.NORTH);
        resultsPanel.add(scroll, BorderLayout.CENTER);









        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


   private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("Search")) {
                try {
                    String URL = url.getText();
                    String KEYWORD = keyword.getText();
                    URL url = new URL(URL);
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(url.openStream())
                    );
                    String line;
                    while ( (line = reader.readLine()) != null ) {
                        if(line.contains("href=") && line.contains("www")){
                            //int beginIndex = line.indexOf("href=") + 6;
                            int beginIndex = 0;
                            //System.out.println("og: "+ line );
                            if (line.contains("https:")){
                                beginIndex = line.indexOf("https:");
                            }
                            if (!line.contains("https:")){
                                beginIndex = line.indexOf("www");
                            }
                            int endIndex = 0;
                            if (line.substring(beginIndex).contains("\'")){
                                endIndex = line.indexOf("\'", beginIndex+1);
                            }
                            if (line.substring(beginIndex).contains("\"")){
                                endIndex = line.indexOf("\"", beginIndex+1);
                            }
                            if (line.substring(beginIndex).contains("\"") && line.substring(beginIndex).contains("\'")){
                                if (line.indexOf("\'") > line.indexOf("\"")){
                                    endIndex = line.indexOf("\"", beginIndex+1);
                                }else{
                                    endIndex = line.indexOf("\'", beginIndex+1);
                                }
                            }
                            String substring = line.substring(beginIndex, endIndex);

                            if (substring.contains(KEYWORD)){
                                results.append(substring+ "\n");
                            }



                        }
                    }

                    reader.close();
                } catch(Exception ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
