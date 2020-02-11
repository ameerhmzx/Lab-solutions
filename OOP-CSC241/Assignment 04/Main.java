import javax.swing.*;
import java.awt.*;

public class Main {
    static final int[] counter = {0, 0};
    static JLabel label1;
    static JLabel label2;
    static JLabel label3;

    static void updateStatus(String btn) {
        label1.setText(String.format("Button A clicked %d time", counter[0]));
        label2.setText(String.format("Button B clicked %d time", counter[1]));
        if (!btn.equals("")) label3.setText(String.format("Button %s was clicked", btn));
    }

    public static void main(String[] args) {
        new JFrame() {{
            add(new JButton() {{
                setText("A");
                addActionListener(actionEvent -> {
                    counter[0]++;
                    updateStatus("A");
                });
            }});

            add(new JButton() {{
                setText("B");
                addActionListener(actionEvent -> {
                    counter[1]++;
                    updateStatus("B");
                });
            }});

            add(label1 = new JLabel());
            add(label2 = new JLabel());
            add(label3 = new JLabel());

            setLayout(new GridLayout(5, 2));
            setSize(300, 300);
            setVisible(true);
        }};

        updateStatus("");
    }
}
