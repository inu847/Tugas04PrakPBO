import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class TigaDForm extends JFrame {
    private JPanel GUI3D;
    private JTextField Panjang;
    private JTextField Lebar;
    private JTextField Tinggi;
    private JTextField Jari;
    private JTextField Sisi;
    private JTextField Lalas;
    private JTextField Kelalas;
    private JTextField Hasil;
    private JButton HitungButton;
    private JButton BatalButton;
    private JButton KELUAR;
    private JComboBox comboBox1;
    private JButton BATALButton;
    private JRadioButton VolRadioButton;
    private JRadioButton LuasPermukaanRadioButton;
    private JLabel masukkanSisi;
    private JLabel masukkanPanjang;
    private JLabel masukkanLebar;
    private JLabel masukkanTinggi;
    private JLabel masukkanJari;
    private JLabel masukkanLA;
    private JLabel masukkanKA;



    public TigaDForm() {
        HitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = 0;
                Volume volume = new Volume();
                LuasPermukaan luasPermukaan = new LuasPermukaan();

                String ops = String.valueOf(comboBox1.getSelectedItem());
                if (ops == "BALOK"){
                    //luas Permukaan & Volume Balok
                    double pnj = Double.parseDouble(Panjang.getText());
                    double lbr = Double.parseDouble(Lebar.getText());
                    double tgg = Double.parseDouble(Tinggi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.balok(pnj,lbr,tgg);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.balok(pnj,lbr,tgg);
                    }
                }
                else if (ops == "KUBUS"){
                    //luas Permukaan & Volume Kubus
                    double sis = Double.parseDouble(Sisi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.kubus(sis);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.kubus(sis);
                    }
                }
                else if (ops == "BOLA"){
                    //luas Permukaan & Volume Bola
                    double jari2 = Double.parseDouble(Jari.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.bola(jari2);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.bola(jari2);
                    }
                }
                else if (ops == "LIMAS SEGITIGA"){
                    //luas Permukaan & Volume Limas Segitiga
                    double LA = Double.parseDouble(Lalas.getText());
                    double tgg = Double.parseDouble(Tinggi.getText());
                    double ls = Double.parseDouble(Sisi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.vollimassegitiga(LA,tgg);
                    }
                    else if(LuasPermukaanRadioButton.isSelected()) {
                        result = luasPermukaan.luaspermukaanlimassegitiga(LA, ls);
                    }
                }

                else if (ops == "LIMAS SEGIEMPAT"){
                    //luas Permukaan & Volume Limas Segiempat
                    double sis = Double.parseDouble(Sisi.getText());
                    double LA = Double.parseDouble(Lalas.getText());
                    double t = Double.parseDouble(Tinggi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.vollimassegiempat(LA,t);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.luaspermukaanlimassegiempat(sis,LA,t);
                    }
                }
                else if (ops == "PRISMA"){
                    //luas Permukaan & Volume Prisma
                    double LA = Double.parseDouble(Lalas.getText());
                    double t = Double.parseDouble(Tinggi.getText());
                    double KA = Double.parseDouble(Kelalas.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.prisma(LA, t);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.prisma(LA,KA,t);
                    }
                }
                else if (ops == "TABUNG"){
                    //luas Permukaan & Volume Tabung
                    double jari2 = Double.parseDouble(Jari.getText());
                    double t = Double.parseDouble(Tinggi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.tabung(jari2, t);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.tabung(jari2);
                    }
                }
                Hasil.setText(String.valueOf(result));
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sisi.setEditable(true);
                Tinggi.setEditable(true);
                Panjang.setEditable(true);
                Lebar.setEditable(true);
                Lalas.setEditable(true);
                Jari.setEditable(true);
                Kelalas.setEditable(true);
                Sisi.setVisible(true);
                Tinggi.setVisible(true);
                Panjang.setVisible(true);
                Lebar.setVisible(true);
                Lalas.setVisible(true);
                Jari.setVisible(true);
                Kelalas.setVisible(true);
                masukkanSisi.setVisible(true);
                masukkanTinggi.setVisible(true);
                masukkanPanjang.setVisible(true);
                masukkanLebar.setVisible(true);
                masukkanLA.setVisible(true);
                masukkanJari.setVisible(true);
                masukkanKA.setVisible(true);

                String ops = String.valueOf(comboBox1.getSelectedItem());

                if (ops == "BALOK") {
                    Sisi.setEditable(true);
                    Tinggi.setEditable(true);
                    Panjang.setEditable(true);
                    Lebar.setEditable(true);
                    Lalas.setEditable(true);
                    Jari.setEditable(true);
                    Kelalas.setEditable(true);
                    Sisi.setVisible(true);
                    Tinggi.setVisible(true);
                    Panjang.setVisible(true);
                    Lebar.setVisible(true);
                    Lalas.setVisible(true);
                    Jari.setVisible(true);
                    Kelalas.setVisible(true);
                    masukkanSisi.setVisible(true);
                    masukkanTinggi.setVisible(true);
                    masukkanPanjang.setVisible(true);
                    masukkanLebar.setVisible(true);
                    masukkanLA.setVisible(true);
                    masukkanJari.setVisible(true);
                    masukkanKA.setVisible(true);
                else if (ops == "BOLA") {
                        Sisi.setEditable(true);
                        Tinggi.setEditable(true);
                        Panjang.setEditable(true);
                        Lebar.setEditable(true);
                        Lalas.setEditable(true);
                        Jari.setEditable(true);
                        Kelalas.setEditable(true);
                        Sisi.setVisible(true);
                        Tinggi.setVisible(true);
                        Panjang.setVisible(true);
                        Lebar.setVisible(true);
                        Lalas.setVisible(true);
                        Jari.setVisible(true);
                        Kelalas.setVisible(true);
                        masukkanSisi.setVisible(true);
                        masukkanTinggi.setVisible(true);
                        masukkanPanjang.setVisible(true);
                        masukkanLebar.setVisible(true);
                        masukkanLA.setVisible(true);
                        masukkanJari.setVisible(true);
                        masukkanKA.setVisible(true);
                    } else if (ops == "LIMAS SEGITIGA") {
                        Sisi.setEditable(true);
                        Tinggi.setEditable(true);
                        Panjang.setEditable(true);
                        Lebar.setEditable(true);
                        Lalas.setEditable(true);
                        Jari.setEditable(true);
                        Kelalas.setEditable(true);
                        Sisi.setVisible(true);
                        Tinggi.setVisible(true);
                        Panjang.setVisible(true);
                        Lebar.setVisible(true);
                        Lalas.setVisible(true);
                        Jari.setVisible(true);
                        Kelalas.setVisible(true);
                        masukkanSisi.setVisible(true);
                        masukkanTinggi.setVisible(true);
                        masukkanPanjang.setVisible(true);
                        masukkanLebar.setVisible(true);
                        masukkanLA.setVisible(true);
                        masukkanJari.setVisible(true);
                        masukkanKA.setVisible(true);
                    } else if (ops == "LIMAS SEGIEMPAT") {
                        Sisi.setEditable(true);
                        Tinggi.setEditable(true);
                        Panjang.setEditable(true);
                        Lebar.setEditable(true);
                        Lalas.setEditable(true);
                        Jari.setEditable(true);
                        Kelalas.setEditable(true);
                        Sisi.setVisible(true);
                        Tinggi.setVisible(true);
                        Panjang.setVisible(true);
                        Lebar.setVisible(true);
                        Lalas.setVisible(true);
                        Jari.setVisible(true);
                        Kelalas.setVisible(true);
                        masukkanSisi.setVisible(true);
                        masukkanTinggi.setVisible(true);
                        masukkanPanjang.setVisible(true);
                        masukkanLebar.setVisible(true);
                        masukkanLA.setVisible(true);
                        masukkanJari.setVisible(true);
                        masukkanKA.setVisible(true);
                    } else if (ops == "PRISMA") {
                        Sisi.setEditable(true);
                        Tinggi.setEditable(true);
                        Panjang.setEditable(true);
                        Lebar.setEditable(true);
                        Lalas.setEditable(true);
                        Jari.setEditable(true);
                        Kelalas.setEditable(true);
                        Sisi.setVisible(true);
                        Tinggi.setVisible(true);
                        Panjang.setVisible(true);
                        Lebar.setVisible(true);
                        Lalas.setVisible(true);
                        Jari.setVisible(true);
                        Kelalas.setVisible(true);
                        masukkanSisi.setVisible(true);
                        masukkanTinggi.setVisible(true);
                        masukkanPanjang.setVisible(true);
                        masukkanLebar.setVisible(true);
                        masukkanLA.setVisible(true);
                        masukkanJari.setVisible(true);
                        masukkanKA.setVisible(true);
                    } else if (ops == "TABUNG") {
                        Sisi.setEditable(true);
                        Tinggi.setEditable(true);
                        Panjang.setEditable(true);
                        Lebar.setEditable(true);
                        Lalas.setEditable(true);
                        Jari.setEditable(true);
                        Kelalas.setEditable(true);
                        Sisi.setVisible(true);
                        Tinggi.setVisible(true);
                        Panjang.setVisible(true);
                        Lebar.setVisible(true);
                        Lalas.setVisible(true);
                        Jari.setVisible(true);
                        Kelalas.setVisible(true);
                        masukkanSisi.setVisible(true);
                        masukkanTinggi.setVisible(true);
                        masukkanPanjang.setVisible(true);
                        masukkanLebar.setVisible(true);
                        masukkanLA.setVisible(true);
                        masukkanJari.setVisible(true);
                        masukkanKA.setVisible(true);
                    }
                }
            }
        });