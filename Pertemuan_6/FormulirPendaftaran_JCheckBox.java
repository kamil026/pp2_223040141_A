package Pertemuan_6;
import javax.swing.*;

public class FormulirPendaftaran_JCheckBox{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulir Pendaftaran");
        JPanel panel = new JPanel();

        JLabel labelHobi = new JLabel("Hobi:");
        JCheckBox membaca = new JCheckBox("Membaca");
        JCheckBox olahraga = new JCheckBox("Olahraga");
        JCheckBox musik = new JCheckBox("Musik");

        JButton tombolSubmit = new JButton("Submit");

        // Aksi ketika tombol ditekan
        tombolSubmit.addActionListener(e -> {
            String hobi = "";
            if (membaca.isSelected()) {
                hobi += "Membaca, ";x
            }
            if (olahraga.isSelected()) {
                hobi += "Olahraga, ";
            }
            if (musik.isSelected()) {
                hobi += "Musik, ";
            }
            hobi = hobi.substring(0, hobi.length() - 2); // Menghapus koma terakhir
            JOptionPane.showMessageDialog(null, "Hobi: " + hobi);
        });

        panel.add(labelHobi);
        panel.add(membaca);
        panel.add(olahraga);
        panel.add(musik);
        panel.add(tombolSubmit);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
