package Pertemuan_6;
import javax.swing.*;

public class FormulirPendaftaran_JList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Daftar Belanja");
        JPanel panel = new JPanel();

        String[] items = {"Susu", "Roti", "Telur", "Daging"};
        JList<String> list = new JList<>(items);
        JScrollPane scrollPane = new JScrollPane(list);

        JButton tombolHapus = new JButton("Hapus");

        // Aksi ketika tombol Hapus ditekan
        tombolHapus.addActionListener(e -> {
            int index = list.getSelectedIndex();
            if (index != -1) {
                DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
                model.remove(index);
                list.setSelectedIndex(-1); // Clear selection after removal
            }
        });

        panel.add(scrollPane);
        panel.add(tombolHapus);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}