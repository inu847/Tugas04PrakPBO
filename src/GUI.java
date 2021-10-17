import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private JPanel mainGui;
    private JComboBox comboBox1;
    private JRadioButton luasRadioButton;
    private JRadioButton kelilingRadioButton;
    private JTextField jari;
    private JTextField sisi;
    private JTextField tinggi;
    private JTextField lebar;
    private JButton btnHitung;
    private JButton btnKeluar;
    private JTextField hasil;
    private JButton btnBatal;

    public GUI(){
        setContentPane(mainGui);
        setSize(600,550);
        setVisible(true);
    }

    public static void main(String[] args) {
        GUI gui = new GUI();

        gui.btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = gui.jari.getText();
                System.out.println(x);
                String y = gui.sisi.getText();
                System.out.println(y);
                String z = gui.tinggi.getText();
                System.out.println(z);
                String w = gui.lebar.getText();
                System.out.println(w);

            }
        });


    }

}
