package Study.JDK.HomeWorks.HW_01;

import Study.JDK.HomeWorks.HW_01.ReadAndWrite.ReadFile;
import Study.JDK.HomeWorks.HW_01.ReadAndWrite.WriteToFile;
import lombok.Getter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;

@Getter
public class Server extends JFrame {
    private static final int WIDTH = 555;
    private static final int HEIGHT = 555;
    private JPanel panel;
    private JTextArea jTextArea;
    private JButton jButtonStart, jButtonStop;

    private boolean statusServer;
    private ArrayList<String> dialogs = new ArrayList<>();
    private ReadFile readFile = new ReadFile("src/main/java/Study/JDK/HomeWorks/HW_01/ReadAndWrite/log.txt");
    private WriteToFile writeToFile = new WriteToFile("src/main/java/Study/JDK/HomeWorks/HW_01/" +
            "ReadAndWrite/log.txt");

    private ArrayList<Client> clients = new ArrayList<>();

    public Server() {
        createPanel();

        setSize(WIDTH,HEIGHT);
        setLocation(650,100);
        setTitle("Server Interface");
        setVisible(true);

        addListenerOnButton();
    }

    private void createPanel() {
        panel = new JPanel(new GridLayout(1,2));
        jButtonStart = new JButton("Start server");
        jButtonStop = new JButton("Stop server");
        panel.add(jButtonStart);
        panel.add(jButtonStop);
        add(panel, BorderLayout.SOUTH);

        jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        add(jTextArea);
    }

    private void addListenerOnButton() {
        jButtonStart.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("The server is running");
                statusServer = true;
            }
        });

        jButtonStop.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("Server stopped");
            }
        });
    }

    // заполняем список клиентов
    public void addClient(Client client) {
        clients.add(client);
    }

    public void addNewMessage(String message) {
        dialogs.add(message);
        writeToFile.write(dialogs);
        updateClientsDialog();
    }

    // Обновляем диалоги у всех клиентов
    public void updateClientsDialog() {
        ArrayList<String> updatedDialogs = new ArrayList<>(dialogs);
        for (Client client : clients) {
            client.updateDialog(updatedDialogs);
        }
    }


    public void printDialog(JTextArea jTextAreaClient) throws FileNotFoundException {
        dialogs.clear();
        readFile.read(dialogs);

        jTextAreaClient.setText("");

        for (String string: dialogs) {
            jTextAreaClient.append(string + "\n");
        }
    }
}
