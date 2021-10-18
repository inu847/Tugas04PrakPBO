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


    public GUI() {
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                double results;
//                hasil.setText(String.valueOf(results));

                String ops = String.valueOf(comboBox1.getSelectedItem());
                if (ops == 'LINGKARAN') {
                    double tfjari = Double.parseDouble(jari.getText());
                }else if(ops == 'PERSEGI'){
                    double tfsisi = Double.parseDouble(sisi.getText());
                }else if(ops == 'PERSEGI PANJANG'){
                    double tfpanjang = Double.parseDouble(panjang.getText());
                    double tflebar = Double.parseDouble(lebar.getText());
                }else if(ops == 'SEGITIGA SAMA SISI'){
//                    double tftinggi = Double.parseDouble(tinggi.getText());
//                    Keliling
                    double tfsisi = Double.parseDouble(sisi.getText());
                }else if(ops == 'SEGITIGA SAMA KAKI'){
//                    Luas
                    
//                    double tftinggi = Double.parseDouble(tinggi.getText());
//                    Keliling
                    double tfsisi = Double.parseDouble(sisi.getText());
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
