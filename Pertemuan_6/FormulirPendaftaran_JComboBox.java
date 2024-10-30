package Pertemuan_6;
import javax.swing.*;

public class FormulirPendaftaran_JComboBox{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulir Pendaftaran");
        JPanel panel = new JPanel();

        JLabel labelNegara = new JLabel("Negara Asal:");
        String[] negara = {"Indonesia", "Malaysia", "Singapura", "Filipina"};
        JComboBox<String> comboBoxNegara = new JComboBox<>(negara);

        JButton tombolSubmit = new JButton("Submit");

        // Aksi ketika tombol ditekan
        tombolSubmit.addActionListener(e -> {
            String negaraAsal = (String) comboBoxNegara.getSelectedItem();
            JOptionPane.showMessageDialog(null, "Negara Asal: " + negaraAsal);
        });

        panel.add(labelNegara);
        panel.add(comboBoxNegara);
        panel.add(tombolSubmit);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}