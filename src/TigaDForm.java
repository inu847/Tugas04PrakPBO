import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TigaDForm extends JFrame {
    private JPanel GUI3D;
    private JTextField tfpanjang;
    private JTextField tflebar;
    private JTextField tftinggi;
    private JTextField tfjari;
    private JTextField tfsisi;
    private JTextField tfla;
    private JTextField tfka;
    private JTextField tfhasil;
    private JButton hitung;
    private JButton BatalButton;
    private JButton KELUAR;
    private JComboBox comboBox1;
    private JRadioButton VolRadioButton;
    private JRadioButton lpButton;
    private JLabel masukkansisi;
    private JLabel masukkanPanjang;
    private JLabel masukkanLebar;
    private JLabel masukkanTinggi;
    private JLabel masukkanJari;
    private JLabel masukkanLA;
    private JLabel masukkanKA;


    public TigaDForm() {
        hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = 0;
                Volume volume = new Volume();
                LuasPermukaan luasPermukaan = new LuasPermukaan();

                String ops = String.valueOf(comboBox1.getSelectedItem());
                if (ops == "BALOK") {
                    //luas Permukaan & Volume Balok
                    double pnj = Double.parseDouble(tfpanjang.getText());
                    double lbr = Double.parseDouble(tflebar.getText());
                    double tgg = Double.parseDouble(tftinggi.getText());
                    if (VolRadioButton.isSelected()) {
                        result = volume.balok(pnj, lbr, tgg);
                    } else if (lpButton.isSelected()) {
                        result = luasPermukaan.balok(pnj, lbr, tgg);
                    }
                } else if (ops == "KUBUS") {
                    //luas Permukaan & Volume Kubus
                    double sis = Double.parseDouble(tfsisi.getText());
                    if (VolRadioButton.isSelected()) {
                        result = volume.kubus(sis);
                    } else if (lpButton.isSelected()) {
                        result = luasPermukaan.kubus(sis);
                    }
                } else if (ops == "BOLA") {
                    //luas Permukaan & Volume Bola
                    double jari = Double.parseDouble(tfjari.getText());
                    System.out.println(jari);
                    if (VolRadioButton.isSelected()) {
                        result = volume.bola(jari);
                    } else if (lpButton.isSelected()) {
                        result = luasPermukaan.bola(jari);
                    }
                } else if (ops == "LIMAS SEGITIGA") {
                    //luas Permukaan & Volume Limas Segitiga
                    double la = Double.parseDouble(tfla.getText());
                    double sis = Double.parseDouble(tfsisi.getText());
                    double tgg = Double.parseDouble(tftinggi.getText());
                    if (VolRadioButton.isSelected()) {
                        result = volume.vollimassegitiga(la, tgg);
                    } else if (lpButton.isSelected()) {
                        result = luasPermukaan.luaspermukaanlimassegitiga(la, sis);
                    }
                } else if (ops == "LIMAS SEGIEMPAT") {
                    //luas Permukaan & Volume Limas Segiempat
                    double la = Double.parseDouble(tfla.getText());
                    double tgg = Double.parseDouble(tftinggi.getText());
                    double sis = Double.parseDouble(tfsisi.getText());
                    if (VolRadioButton.isSelected()) {
                        result = volume.vollimassegiempat(la, tgg);
                    } else if (lpButton.isSelected()) {
                        result = luasPermukaan.luaspermukaanlimassegiempat(sis, la, tgg);
                    }
                } else if (ops == "PRISMA") {
                    //luas Permukaan & Volume Prisma
                    double la = Double.parseDouble(tfla.getText());
                    double ka = Double.parseDouble(tfka.getText());
                    double tgg = Double.parseDouble(tftinggi.getText());
                    if (VolRadioButton.isSelected()) {
                        result = volume.prisma(la, tgg);
                    } else if (lpButton.isSelected()) {
                        result = luasPermukaan.prisma(la, ka, tgg);
                    }
                } else if (ops == "TABUNG") {
                    //luas Permukaan & Volume Tabung
                    double jari = Double.parseDouble(tfjari.getText());
                    double tgg = Double.parseDouble(tftinggi.getText());
                    if (VolRadioButton.isSelected()) {
                        result = volume.tabung(jari, tgg);
                    } else if (lpButton.isSelected()) {
                        result = luasPermukaan.tabung(jari);
                    }
                }
                tfhasil.setText(String.valueOf(result));
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfsisi.setVisible(true);
                tftinggi.setVisible(true);
                tfpanjang.setVisible(true);
                tflebar.setVisible(true);
                tfla.setVisible(true);
                tfjari.setVisible(true);
                tfla.setVisible(true);
                masukkansisi.setVisible(true);
                masukkanTinggi.setVisible(true);
                masukkanPanjang.setVisible(true);
                masukkanLebar.setVisible(true);
                masukkanLA.setVisible(true);
                masukkanJari.setVisible(true);
                masukkanKA.setVisible(true);

                String ops = String.valueOf(comboBox1.getSelectedItem());

                if (ops == "BALOK") {
                    tfsisi.setVisible(false);
                    tftinggi.setVisible(true);
                    tfpanjang.setVisible(true);
                    tflebar.setVisible(true);
                    tfjari.setVisible(false);
                    tfla.setVisible(false);
                    tfka.setVisible(false);
                    masukkansisi.setVisible(false);
                    masukkanTinggi.setVisible(true);
                    masukkanPanjang.setVisible(true);
                    masukkanLebar.setVisible(true);
                    masukkanLA.setVisible(false);
                    masukkanJari.setVisible(false);
                    masukkanKA.setVisible(false);
                } else if (ops == "BOLA") {
                    tfsisi.setVisible(false);
                    tftinggi.setVisible(false);
                    tfpanjang.setVisible(false);
                    tflebar.setVisible(false);
                    tfla.setVisible(false);
                    tfjari.setVisible(true);
                    tfka.setVisible(false);
                    masukkansisi.setVisible(false);
                    masukkanTinggi.setVisible(false);
                    masukkanPanjang.setVisible(false);
                    masukkanLebar.setVisible(false);
                    masukkanLA.setVisible(false);
                    masukkanJari.setVisible(true);
                    masukkanKA.setVisible(false);
                } else if (ops == "LIMAS SEGITIGA" || ops == "LIMAS SEGIEMPAT") {
                    tfsisi.setVisible(true);
                    tftinggi.setVisible(true);
                    tfpanjang.setVisible(false);
                    tflebar.setVisible(false);
                    tfjari.setVisible(false);
                    tfla.setVisible(true);
                    tfka.setVisible(false);
                    masukkansisi.setVisible(true);
                    masukkanTinggi.setVisible(true);
                    masukkanPanjang.setVisible(false);
                    masukkanLebar.setVisible(false);
                    masukkanLA.setVisible(true);
                    masukkanJari.setVisible(false);
                    masukkanKA.setVisible(false);
                } else if (ops == "PRISMA") {
                    tfsisi.setVisible(false);
                    tftinggi.setVisible(true);
                    tfpanjang.setVisible(false);
                    tflebar.setVisible(false);
                    tfjari.setVisible(false);
                    tfla.setVisible(true);
                    tfka.setVisible(true);
                    masukkansisi.setVisible(false);
                    masukkanTinggi.setVisible(true);
                    masukkanPanjang.setVisible(false);
                    masukkanLebar.setVisible(false);
                    masukkanLA.setVisible(true);
                    masukkanJari.setVisible(false);
                    masukkanKA.setVisible(true);
                } else if (ops == "TABUNG") {
                    tfsisi.setVisible(false);
                    tftinggi.setVisible(true);
                    tfpanjang.setVisible(false);
                    tflebar.setVisible(false);
                    tfjari.setVisible(true);
                    tfla.setVisible(false);
                    tfka.setVisible(false);
                    masukkansisi.setVisible(false);
                    masukkanTinggi.setVisible(true);
                    masukkanPanjang.setVisible(false);
                    masukkanLebar.setVisible(false);
                    masukkanLA.setVisible(false);
                    masukkanJari.setVisible(true);
                    masukkanKA.setVisible(false);
                }else if (ops == "KUBUS"){
                    tfsisi.setVisible(true);
                    tftinggi.setVisible(false);
                    tfpanjang.setVisible(false);
                    tflebar.setVisible(false);
                    tfjari.setVisible(false);
                    tfla.setVisible(false);
                    tfka.setVisible(false);
                    masukkansisi.setVisible(true);
                    masukkanTinggi.setVisible(false);
                    masukkanPanjang.setVisible(false);
                    masukkanLebar.setVisible(false);
                    masukkanLA.setVisible(false);
                    masukkanJari.setVisible(false);
                    masukkanKA.setVisible(false);
                }
            }
        });
        KELUAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("TigaDForm");
        frame.setContentPane(new TigaDForm().GUI3D);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}