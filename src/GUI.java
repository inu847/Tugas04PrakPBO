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
    private JTextField panjang;
    private JTextField alas;


    public GUI() {
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                double tftinggi = Double.parseDouble(tinggi.getText());
                double tflebar = Double.parseDouble(lebar.getText());

//                double results;
//                hasil.setText(String.valueOf(results));

                String ops = String.valueOf(comboBox1.getSelectedItem());
                if (ops == 'LINGKARAN') {
                    double tfjari = Double.parseDouble(jari.getText());
                }else if(ops == 'PERSEGI'){
                    double tfsisi = Double.parseDouble(sisi.getText());
                }else if(ops == 'PERSEGI PANJANG'){
                    double tftinggi = Double.parseDouble(tinggi.getText());
                }else if(ops == 'SEGITIGA SAMA SISI'){

                }else if(ops == 'SEGITIGA SAMA KAKI'){

                }
                System.out.print(ops);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().mainGui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
