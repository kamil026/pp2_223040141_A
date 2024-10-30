package Pertemuan_6;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TabelMahasiswa_JTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Mahasiswa");

        // Data mahasiswa (bisa diganti dengan data dari database atau file)
        String[][] data = {
                {"Andi", "12345", "Informatika"},
                {"Budi", "23456", "Sistem Informasi"},
                {"Cici", "34567", "Teknik Elektro"}
        };
        String[] kolom = {"Nama", "NIM", "Jurusan"};

        // Membuat model tabel
        DefaultTableModel model = new DefaultTableModel(data, kolom);
        JTable table = new JTable(model);

        // Membuat scroll pane agar tabel dapat digulir
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}