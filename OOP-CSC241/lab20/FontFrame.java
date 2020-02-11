import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.EventListener;

public class FontFrame extends JFrame {
    private JLabel label;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JComboBox<String> jComboBox;

    public FontFrame() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        createControlPanel();
        setTitle("Font Frame");
        setVisible(true);
        label = new JLabel("Big Java");
        this.add(label, BorderLayout.WEST);
        setLabelFont();
    }

    public void createControlPanel(){
        JPanel jPanel = new JPanel(new GridLayout(3,1));
        jPanel.add(createComboBox(), 0);
        jPanel.add(createCheckBox(), 1);
        jPanel.add(createRadioButtons(), 2);
        this.add(jPanel, BorderLayout.SOUTH);
    }

    public JPanel createComboBox(){
        JPanel jPanel = new JPanel();
        jComboBox = new JComboBox<>();
        jComboBox.setEditable(true);
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String font: fonts)
            jComboBox.addItem(font);
        jPanel.add(jComboBox);
        jComboBox.addActionListener(actionEvent -> setLabelFont());
        jPanel.setBorder(new TitledBorder("Font"));
        return jPanel;
    }
    public JPanel createCheckBox(){
        JPanel jPanel = new JPanel();
        checkBox1 = new JCheckBox("Italic");
        checkBox2 = new JCheckBox("Bold");
        jPanel.add(checkBox1);
        jPanel.add(checkBox2);
        checkBox1.addActionListener(actionEvent -> setLabelFont());
        checkBox2.addActionListener(actionEvent -> setLabelFont());
        jPanel.setBorder(new TitledBorder("Style"));
        return jPanel;
    }
    public JPanel createRadioButtons(){
        JPanel jPanel = new JPanel();
        ButtonGroup buttonGroup = new ButtonGroup();
        jRadioButton1 = new JRadioButton("Small");
        jRadioButton2 = new JRadioButton("Medium");
        jRadioButton3 = new JRadioButton("Large");
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        jPanel.add(jRadioButton3);
        jRadioButton1.setSelected(true);
        jRadioButton1.addActionListener(actionEvent -> setLabelFont());
        jRadioButton2.addActionListener(actionEvent -> setLabelFont());
        jRadioButton3.addActionListener(actionEvent -> setLabelFont());
        jPanel.setBorder(new TitledBorder("Size"));
        return jPanel;
    }

    public void setLabelFont(){
        label.setFont(new Font(
                jComboBox.getSelectedItem().toString() + "",
                checkBox1.isSelected()?
                        checkBox2.isSelected()?Font.BOLD + Font.ITALIC: Font.BOLD:
                        checkBox2.isSelected()?Font.ITALIC:Font.PLAIN,
                jRadioButton1.isSelected()?24: jRadioButton2.isSelected()?30: 40
        ));
        label.repaint();
    }
}

