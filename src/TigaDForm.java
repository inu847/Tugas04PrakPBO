import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

<<<<<<< HEAD
public class TigaDForm extends JFrame {
    private JTextField textFieldPanjang;
    private JTextField textFieldLebar;
    private JTextField textFieldTinggi;
    private JTextField textFieldJari;
    private JTextField textFieldHasil;
    private JButton HitungButton;
    private JButton BatalButton;
=======
public class TigaDForm {
    private JTextField tfpanjang;
    private JTextField tflebar;
    private JTextField tftinggi;
    private JTextField tfjari;
    private JTextField textField5;
    private JButton HITUNGButton;
    private JButton BATALButton;
>>>>>>> c00118dc5f4aa379e6379b65962d4b4bfe1d35fa
    private JButton KELUAR;
    private JPanel GUI3D;
    private JComboBox dropdown;
    private JRadioButton VolRadioButton;
    private JRadioButton LuasPermukaanRadioButton;
    private JLabel Panjang;
    private JLabel Lebar;
    private JLabel Tinggi;
    private JLabel JariJari;
    private JTextField textFieldSisi;
    private JTextField textFieldLA;
    private JTextField textFieldKA;

    public TigaDForm() {
        HitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = 0;
                Volume volume = new Volume();
                LuasPermukaan luasPermukaan = new LuasPermukaan();

                String ops = String.valueOf(dropdown.getSelectedItem());
                if (ops = "BALOK"){
                    //luas Permukaan & Volume Balok
                    double pnj = Double.parseDouble(textFieldPanjang.getText());
                    double lbr = Double.parseDouble(textFieldLebar.getText());
                    double tgg = Double.parseDouble(textFieldTinggi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.balok(pnj,lbr,tgg);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.balok(pnj,lbr,tgg);
                    }
                }
                else if (ops = "KUBUS"){
                    //luas Permukaan & Volume Kubus
                    double sis = Double.parseDouble(textFieldSisi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.kubus(sis);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.kubus(sis);
                    }
                }
                else if (ops = "BOLA"){
                    //luas Permukaan & Volume Bola
                    double jari2 = Double.parseDouble(textFieldJari.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.bola(jari2);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.bola(jari2);
                    }
                }
                else if (ops = "LIMAS SEGITIGA"){
                    //luas Permukaan & Volume Limas Segitiga
                    double LA = Double.parseDouble(textFieldLA.getText());
                    double tgg = Double.parseDouble(textFieldTinggi.getText());
                    double ls = Double.parseDouble(textFieldSisi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.vollimassegitiga(LA,tgg,ls);
                    }
                    else if(LuasPermukaanRadioButton.isSelected()) {
                        result = luasPermukaan.luaspermukaanlimassegitiga(LA, ls);
                    }
                }

                else if (ops = "LIMAS SEGIEMPAT"){
                    //luas Permukaan & Volume Limas Segiempat
                    double sis = Double.parseDouble(textFieldSisi.getText());
                    double LA = Double.parseDouble(textFieldLA.getText());
                    double t = Double.parseDouble(textFieldTinggi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.vollimassegiempat(LA,t);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.luaspermukaanlimassegiempat(sis,LA,t);
                    }
                }
                else if (ops = "PRISMA"){
                    //luas Permukaan & Volume Prisma
                    double LA = Double.parseDouble(textFieldLA.getText());
                    double t = Double.parseDouble(textFieldTinggi.getText());
                    double KA = Double.parseDouble(textFieldKA.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.prisma(LA, t);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.prisma(LA,KA,t);
                    }
                }
                else if (ops = "TABUNG"){
                    //luas Permukaan & Volume Tabung
                    double jari2 = Double.parseDouble(textFieldJari.getText());
                    double t = Double.parseDouble(textFieldTinggi.getText());
                    if (VolRadioButton.isSelected()){
                        result = volume.tabung(jari2, t);
                    }
                    else if (LuasPermukaanRadioButton.isSelected()){
                        result = luasPermukaan.tabung(jari2);
                    }
                }
                textFieldHasil.setText(String.valueOf(result));
            }
        });
        BatalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        dropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldPanjang.setEditable(true);
                textFieldLebar.setEditable(true);
                textFieldTinggi.setEditable(true);
                textFieldJari.setEditable(true);
                textFieldSisi.setEditable(true);
                textFieldLA.setEditable(true);
                textFieldKA.setEditable(true);

                String ops = String.valueOf(dropdown.getSelectedItem());

                if(ops == "BALOK"){
                    textFieldPanjang.setEditable(true);
                    textFieldLebar.setEditable(true);
                    textFieldTinggi.setEditable(true);
                    textFieldJari.setEditable(false);
                    textFieldSisi.setEditable(false);
                    textFieldLA.setEditable(false);
                    textFieldKA.setEditable(false);
                }
                else if (ops == "BOLA"){
                    textFieldPanjang.setEditable(false);
                    textFieldLebar.setEditable(false);
                    textFieldTinggi.setEditable(false);
                    textFieldJari.setEditable(true);
                    textFieldSisi.setEditable(false);
                    textFieldLA.setEditable(false);
                    textFieldKA.setEditable(false);
                }
                else if (ops == "LIMAS SEGITIGA"){
                    textFieldPanjang.setEditable(false);
                    textFieldLebar.setEditable(false);
                    textFieldTinggi.setEditable(true);
                    textFieldJari.setEditable(false);
                    textFieldSisi.setEditable(true);
                    textFieldLA.setEditable(true);
                    textFieldKA.setEditable(false);
                }
                else if (ops == "LIMAS SEGIEMPAT"){
                    textFieldPanjang.setEditable(false);
                    textFieldLebar.setEditable(false);
                    textFieldTinggi.setEditable(true);
                    textFieldJari.setEditable(false);
                    textFieldSisi.setEditable(true);
                    textFieldLA.setEditable(true);
                    textFieldKA.setEditable(false);
                }
                else if (ops == "PRISMA"){
                    textFieldPanjang.setEditable(false);
                    textFieldLebar.setEditable(false);
                    textFieldTinggi.setEditable(true);
                    textFieldJari.setEditable(false);
                    textFieldSisi.setEditable(false);
                    textFieldLA.setEditable(true);
                    textFieldKA.setEditable(true);
                }
                else if (ops == "TABUNG"){
                    textFieldPanjang.setEditable(false);
                    textFieldLebar.setEditable(false);
                    textFieldTinggi.setEditable(true);
                    textFieldJari.setEditable(true);
                    textFieldSisi.setEditable(false);
                    textFieldLA.setEditable(false);
                    textFieldKA.setEditable(false);
                }
            }
        });
        KELUAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
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
