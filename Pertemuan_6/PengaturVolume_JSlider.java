package Pertemuan_6;

import javax.swing.*;

public class PengaturVolume_JSlider{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pengatur Volume");
        JPanel panel = new JPanel();

        JSlider slider = new JSlider(0, 100);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        
        slider.setPaintLabels(true); 


        // Aksi ketika nilai slider berubah
        slider.addChangeListener(e -> {
            int volume = slider.getValue();
            // Simulasikan perubahan volume (ganti dengan kode untuk mengatur volume sebenarnya)
            System.out.println("Volume diatur ke: " + volume);
        });

        panel.add(slider);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}