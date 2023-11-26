package Study.JavaCore.Test.test_05;

import javax.swing.*;
import java.awt.*;

public class EnterClick extends JFrame {
    private final int height = 500;
    private final int wight = 500;

    JPanel panel;
    JTextArea area;
    JTextField field;
    JButton button;

    public EnterClick() {

        createPanel();
        clickListener();
        clickButton();

        setSize(wight,height);
        setTitle("Client Interface");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // regionPanel
    private Component createJPanel() {
        panel = new JPanel(new BorderLayout());
        button = new JButton("Send");
        field = new JTextField();
        panel.add(button, BorderLayout.EAST);
        panel.add(field);
        return panel;
    }

    private Component area() {
        area = new JTextArea();
        return area;
    }

    private void createPanel() {
        add(createJPanel(), BorderLayout.SOUTH);
        add(area(), BorderLayout.NORTH);
    }
    // endregion

    private void sendMessage() {
        String message = field.getText();
        area.setText(message);
        field.setText("");
    }

    // настраиваем обработчик кнопки Enter
    private void clickListener() {
        field.addActionListener(e -> {
            sendMessage();
        });
    }

    // обработчик кнопки на экране
    private void clickButton() {
        button.addActionListener(e -> {
            sendMessage();
        });
    }

}
















