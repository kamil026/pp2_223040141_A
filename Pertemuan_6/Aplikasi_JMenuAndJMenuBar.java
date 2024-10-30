package Pertemuan_6;
import javax.swing.*;

public class Aplikasi_JMenuAndJMenuBar{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Sederhana");

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        
        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        JMenuItem menuItemNew = new JMenuItem("New");
        menuFile.add(menuItemNew);
        menuItemNew.addActionListener(e -> {
            
            System.out.println("File baru akan dibuat");
        });

        JMenuItem menuItemOpen = new JMenuItem("Open");
        menuFile.add(menuItemOpen);
  
        
        JMenu menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}