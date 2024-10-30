package Pertemuan_6;

import javax.swing.*;

public class Tampil_Nama_JTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh JTextField");
        JPanel panel = new JPanel();

        JLabel labelNama = new JLabel("Masukkan Nama Anda:");
        JTextField textFieldNama = new JTextField(20); // Panjang kolom 20 karakter

        JButton button = new JButton("Tampilkan");

        // Aksi ketika tombol ditekan
        button.addActionListener(e -> {
            String nama = textFieldNama.getText();
            JOptionPane.showMessageDialog(null, "Halo, " + nama + "!");
        });

        panel.add(labelNama);
        panel.add(textFieldNama);
        panel.add(button);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
