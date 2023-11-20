package Study.JDK.Seminars.Seminar_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Client extends JFrame {
    private static final int WIDTH = 555;
    private static final int HEIGHT = 555;

    private JPanel jPanelHeader, jPanelFooter;
    private JTextArea jTextArea;
    private JButton jButtonConnect, jButtonSend;
    private JTextField textFieldMessage, textFieldName, textHint;
    private Server server;
    private String name;

    private ArrayList<String> dialogs = new ArrayList<>();

    public Client(Server server, int x, int y) {
        createPanel();
        addListenerOnButton();

        textFieldMessage.addActionListener(e -> {
            sendMessage();
        });

        this.server = server;
        server.addClient(this);

        setSize(WIDTH,HEIGHT);
        setLocation(x,y);
        setTitle("Client Interface");
        setVisible(true);
    }

    // region createPanel
    private Component createHeaderPanel() {
        jPanelHeader = new JPanel(new BorderLayout());
        textFieldName = new JTextField();
        jButtonConnect = new JButton("Connect");
        textHint = new JTextField("Name:");
        textHint.setEditable(false);

        jPanelHeader.add(textHint, BorderLayout.WEST);
        jPanelHeader.add(textFieldName);
        jPanelHeader.add(jButtonConnect, BorderLayout.EAST);
        return jPanelHeader;
    }

    private Component createFooterPanel() {
        jPanelFooter = new JPanel(new BorderLayout());
        textFieldMessage = new JTextField();
        jButtonSend = new JButton("send");

        jPanelFooter.add(textFieldMessage);
        jPanelFooter.add(jButtonSend, BorderLayout.EAST);
        return jPanelFooter;
    }

    private Component createTextAreaField() {
        jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        return new JScrollPane(jTextArea);
    }

    private void createPanel() {
        add(createHeaderPanel(), BorderLayout.NORTH);
        add(createTextAreaField());
        add(createFooterPanel(), BorderLayout.SOUTH);
    }
    // endregion

    private void addListenerOnButton() {
        jButtonConnect.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (server.isStatusServer()) {
                    name = textFieldName.getText();
                    jTextArea.setText("Connection completed!\n");

                    try {
                        server.printDialog(jTextArea);
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }

                } else {
                    jTextArea.setText("The server is not running!");
                }
            }
        });

        jButtonSend.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }

    public void updateDialog(ArrayList<String> updatedDialogs) {
        StringBuilder dialogText = new StringBuilder();
        for (String dialog : updatedDialogs) {
            dialogText.append(dialog).append("\n");
        }
        jTextArea.setText(dialogText.toString());
    }

    private void sendMessage() {
        String message = name + ": " + textFieldMessage.getText();
        server.addNewMessage(message);

        try {
            server.printDialog(jTextArea);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        textFieldMessage.setText("");
    }

}
