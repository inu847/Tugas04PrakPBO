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
    private JLabel masukanJari;
    private JLabel masukanSisi;
    private JLabel masukanTinggi;
    private JLabel masukanLebar;
    private JLabel masukanPanjang;
    private JLabel masukanAlas;


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
                    if (luasRadioButton.isSelected()){
                        double als = Double.parseDouble(alas.getText());
                        double tng = Double.parseDouble(tinggi.getText());
                        result = luas.segitiga(als, tng);
                    }else if(kelilingRadioButton.isSelected()){
                        double sis = Double.parseDouble(sisi.getText());
                        result = keliling.segitigaSamaSisi(sis);
                    }
                }else if(ops == "SEGITIGA SAMA KAKI"){
                    if (luasRadioButton.isSelected()){
                        double als = Double.parseDouble(alas.getText());
                        double tng = Double.parseDouble(tinggi.getText());
                        result = luas.segitiga(als, tng);
                    }else if(kelilingRadioButton.isSelected()){
                        double sis = Double.parseDouble(sisi.getText());
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
                panjang.setEditable(true);
                lebar.setEditable(true);
                alas.setEditable(true);
                jari.setEditable(true);
                sisi.setVisible(true);
                tinggi.setVisible(true);
                panjang.setVisible(true);
                lebar.setVisible(true);
                alas.setVisible(true);
                jari.setVisible(true);
                masukanSisi.setVisible(true);
                masukanTinggi.setVisible(true);
                masukanPanjang.setVisible(true);
                masukanLebar.setVisible(true);
                masukanAlas.setVisible(true);
                masukanJari.setVisible(true);
                String ops = String.valueOf(comboBox1.getSelectedItem());

                if (ops == "LINGKARAN") {
                    sisi.setEditable(false);
                    sisi.setVisible(false);
                    masukanSisi.setVisible(false);
                    tinggi.setEditable(false);
                    tinggi.setVisible(false);
                    masukanTinggi.setVisible(false);
                    lebar.setEditable(false);
                    lebar.setVisible(false);
                    masukanLebar.setVisible(false);
                    panjang.setEditable(false);
                    panjang.setVisible(false);
                    masukanPanjang.setVisible(false);
                    alas.setEditable(false);
                    alas.setVisible(false);
                    masukanAlas.setVisible(false);
                }else if(ops == "PERSEGI"){
                    jari.setEditable(false);
                    jari.setVisible(false);
                    masukanJari.setVisible(false);
                    tinggi.setEditable(false);
                    tinggi.setVisible(false);
                    masukanTinggi.setVisible(false);
                    lebar.setEditable(false);
                    lebar.setVisible(false);
                    masukanLebar.setVisible(false);
                    panjang.setEditable(false);
                    panjang.setVisible(false);
                    masukanPanjang.setVisible(false);
                    alas.setEditable(false);
                    alas.setVisible(false);
                    masukanAlas.setVisible(false);
                }else if(ops == "PERSEGI PANJANG"){
                    jari.setEditable(false);
                    jari.setVisible(false);
                    masukanJari.setVisible(false);
                    tinggi.setEditable(false);
                    tinggi.setVisible(false);
                    masukanTinggi.setVisible(false);
                    alas.setEditable(false);
                    alas.setVisible(false);
                    masukanAlas.setVisible(false);
                    sisi.setEditable(false);
                    sisi.setVisible(false);
                    masukanSisi.setVisible(false);
                }else if(ops == "SEGITIGA SAMA SISI"){
                    sisi.setEditable(false);
                    sisi.setVisible(false);
                    masukanSisi.setVisible(false);
                    jari.setEditable(false);
                    jari.setVisible(false);
                    masukanJari.setVisible(false);
                    lebar.setEditable(false);
                    lebar.setVisible(false);
                    masukanLebar.setVisible(false);
                    panjang.setEditable(false);
                    panjang.setVisible(false);
                    masukanPanjang.setVisible(false);
                }else if(ops == "SEGITIGA SAMA KAKI"){
                    sisi.setEditable(false);
                    sisi.setVisible(false);
                    masukanSisi.setVisible(false);
                    jari.setEditable(false);
                    jari.setVisible(false);
                    masukanJari.setVisible(false);
                    lebar.setEditable(false);
                    lebar.setVisible(false);
                    masukanLebar.setVisible(false);
                    panjang.setEditable(false);
                    panjang.setVisible(false);
                    masukanPanjang.setVisible(false);

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
                sisi.setVisible(false);
                tinggi.setVisible(false);
                lebar.setVisible(false);
                panjang.setVisible(false);
                alas.setVisible(false);
                masukanSisi.setVisible(false);
                masukanTinggi.setVisible(false);
                masukanLebar.setVisible(false);
                masukanPanjang.setVisible(false);
                masukanAlas.setVisible(false);
            }
        });
        kelilingRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opsi = String.valueOf(comboBox1.getSelectedItem());
                sisi.setEditable(true);
                tinggi.setEditable(true);
                panjang.setEditable(true);
                lebar.setEditable(true);
                alas.setEditable(true);
                jari.setEditable(true);
                sisi.setVisible(true);
                tinggi.setVisible(true);
                panjang.setVisible(true);
                lebar.setVisible(true);
                alas.setVisible(true);
                jari.setVisible(true);
                masukanSisi.setVisible(true);
                masukanTinggi.setVisible(true);
                masukanPanjang.setVisible(true);
                masukanLebar.setVisible(true);
                masukanAlas.setVisible(true);
                masukanJari.setVisible(true);
                if(opsi == "SEGITIGA SAMA SISI"){
                    if(kelilingRadioButton.isSelected()){
                        sisi.setEditable(true);
                        sisi.setVisible(true);
                        masukanSisi.setVisible(true);
                        tinggi.setEditable(false);
                        tinggi.setVisible(false);
                        masukanTinggi.setVisible(false);
                        alas.setEditable(false);
                        alas.setVisible(false);
                        masukanAlas.setVisible(false);
                        jari.setEditable(false);
                        jari.setVisible(false);
                        masukanJari.setVisible(false);
                        lebar.setEditable(false);
                        lebar.setVisible(false);
                        masukanLebar.setVisible(false);
                        panjang.setEditable(false);
                        panjang.setVisible(false);
                        masukanPanjang.setVisible(false);
                    }
                    else if (luasRadioButton.isSelected()){
                        tinggi.setEditable(true);
                        tinggi.setEditable(true);
                        masukanTinggi.setVisible(true);
                        alas.setEditable(true);
                        alas.setVisible(true);
                        masukanAlas.setVisible(true);
                        sisi.setEditable(false);
                        sisi.setVisible(false);
                        masukanSisi.setVisible(false);
                        jari.setEditable(false);
                        jari.setVisible(false);
                        masukanJari.setVisible(false);
                        lebar.setEditable(false);
                        lebar.setVisible(false);
                        masukanLebar.setVisible(false);
                        panjang.setEditable(false);
                        panjang.setVisible(false);
                        masukanPanjang.setVisible(false);
                    }
                }
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
