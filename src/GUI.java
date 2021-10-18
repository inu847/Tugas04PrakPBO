import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

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
                double result = 0;
                Luas luas = new Luas();
                Keliling keliling = new Keliling();

                String ops = String.valueOf(comboBox1.getSelectedItem());
                if (ops == "LINGKARAN") {
//                    Luas & Keliling Lingkaran
                    double jari2 = Double.parseDouble(jari.getText());
                    if (luasRadioButton.isSelected()){
                        result = luas.lingkaran(jari2);
                    }else if(kelilingRadioButton.isSelected()){
                        result = keliling.lingkaran(jari2);
                    }
                }else if(ops == "PERSEGI"){
//                    Luas & Keliling Persegi
                    double sis = Double.parseDouble(sisi.getText());
                    if (luasRadioButton.isSelected()){
                        result = luas.persegi(sis);
                    }else if(kelilingRadioButton.isSelected()){
                        result = keliling.persegi(sis);
                    }
                }else if(ops == "PERSEGI PANJANG"){
//                    Luas & Keliling
                    double pjg = Double.parseDouble(panjang.getText());
                    double lbr = Double.parseDouble(lebar.getText());
                    if (luasRadioButton.isSelected()){
                        result = luas.persegiPanjang(pjg, lbr);
                    }else if(kelilingRadioButton.isSelected()){
                        result = keliling.persegiPanjang(pjg, lbr);
                    }
                }else if(ops == "SEGITIGA SAMA SISI"){
//                    Luas
                    double als = Double.parseDouble(alas.getText());
                    double tng = Double.parseDouble(tinggi.getText());
//                    Keliling
                    double sis = Double.parseDouble(sisi.getText());
                    if (luasRadioButton.isSelected()){
                        result = luas.segitiga(als, tng);
                    }else if(kelilingRadioButton.isSelected()){
                        result = keliling.segitigaSamaSisi(sis);
                    }
                }else if(ops == "SEGITIGA SAMA KAKI"){
//                    Luas
                    double als = Double.parseDouble(alas.getText());
                    double tng = Double.parseDouble(tinggi.getText());
//                    Keliling
                    double sis = Double.parseDouble(sisi.getText());
                    if (luasRadioButton.isSelected()){
                        result = luas.segitiga(als, tng);
                    }else if(kelilingRadioButton.isSelected()){
                        result = keliling.segitigaSamaKaki(sis);
                    }
                }

                hasil.setText(String.valueOf(result));
            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sisi.setEditable(true);
                tinggi.setEditable(true);
                lebar.setEditable(true);
                panjang.setEditable(true);
                alas.setEditable(true);
                jari.setEditable(true);
                String ops = String.valueOf(comboBox1.getSelectedItem());

                if (ops == "LINGKARAN") {
                    sisi.setEditable(false);
                    tinggi.setEditable(false);
                    lebar.setEditable(false);
                    panjang.setEditable(false);
                    alas.setEditable(false);
                }else if(ops == "PERSEGI"){
                    jari.setEditable(false);
                    tinggi.setEditable(false);
                    lebar.setEditable(false);
                    panjang.setEditable(false);
                    alas.setEditable(false);
                }else if(ops == "PERSEGI PANJANG"){
                    jari.setEditable(false);
                    tinggi.setEditable(false);
                    alas.setEditable(false);
                    sisi.setEditable(false);
                }else if(ops == "SEGITIGA SAMA SISI"){
                    jari.setEditable(false);
                    lebar.setEditable(false);
                    panjang.setEditable(false);
                }else if(ops == "SEGITIGA SAMA KAKI"){
                    jari.setEditable(false);
                    lebar.setEditable(false);
                    panjang.setEditable(false);
                }
            }
        });
        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mainGui.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                sisi.setEditable(false);
                tinggi.setEditable(false);
                lebar.setEditable(false);
                panjang.setEditable(false);
                alas.setEditable(false);
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
