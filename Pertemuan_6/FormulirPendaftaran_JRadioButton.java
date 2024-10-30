package Pertemuan_6;
import javax.swing.*;

public class FormulirPendaftaran_JRadioButton{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulir Pendaftaran");
        JPanel panel = new JPanel();

        JLabel labelJenisKelamin = new JLabel("Jenis Kelamin:");
        JRadioButton lakiLaki = new JRadioButton("Laki-laki");
        JRadioButton perempuan = new JRadioButton("perempuan"); 


        // Membuat ButtonGroup agar hanya satu JRadioButton yang bisa dipilih
        ButtonGroup group = new ButtonGroup();
        group.add(lakiLaki);
        group.add(perempuan);

        JButton tombolSubmit = new JButton("Submit");

        // Aksi ketika tombol ditekan
        tombolSubmit.addActionListener(e -> {
            String jenisKelamin = "";
            if (lakiLaki.isSelected()) {
                jenisKelamin = "Laki-laki";
            } else if (perempuan.isSelected()) {
                jenisKelamin = "Perempuan";
            }
            JOptionPane.showMessageDialog(null, "Jenis Kelamin: " + jenisKelamin);
        });

        panel.add(labelJenisKelamin);
        panel.add(lakiLaki);
        panel.add(perempuan);
        panel.add(tombolSubmit);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}