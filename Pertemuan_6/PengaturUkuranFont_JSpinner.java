package Pertemuan_6;
import javax.swing.*;
import java.awt.*;

public class PengaturUkuranFont_JSpinner {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pengatur ukuran Font");
        JPanel panel = new JPanel(new GridLayout(2, 1)); // Menggunakan GridLayout

        JLabel label = new JLabel("Contoh Ukuran Teks");
        label.setFont(new Font("Arial", Font.PLAIN, 12));

        // Membuat JSpinner dengan rentang nilai 10 hingga 40
        SpinnerNumberModel model = new SpinnerNumberModel(12, 10, 40, 1);
        JSpinner spinner = new JSpinner(model);
        spinner.setBorder(BorderFactory.createTitledBorder("Ukuran Font")); // Menambahkan border

        // Mengatur ukuran font label berdasarkan nilai spinner
        spinner.addChangeListener(e -> {
            int ukuranFont = (Integer) spinner.getValue();
            label.setFont(new Font("Arial", Font.PLAIN, ukuranFont));
        });

        panel.add(spinner);
        panel.add(label);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}