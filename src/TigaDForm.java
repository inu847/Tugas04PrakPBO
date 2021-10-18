import javax.swing.*;

public class TigaDForm {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton HITUNGButton;
    private JButton BATALButton;
    private JButton KELUAR;
    private JPanel GUI3D;
    private JComboBox comboBox1;
    private JRadioButton VOLUMERadioButton;
    private JRadioButton LUASPERMUKAANRadioButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TigaDForm");
        frame.setContentPane(new TigaDForm().GUI3D);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
