package Pertemuan_6;
import javax.swing.*;

public class EditorTeks_JTextArea{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Editor Teks");
        JTextArea textArea = new JTextArea(20, 40); // 20 baris, 40 kolom
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}