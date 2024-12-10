package view.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainButtonActionListener implements ActionListener{
private MainFrame mainFrame;
public MainButtonActionListener(MainFrame mainFrame){
this.mainFrame = mainFrame;
}
public void actionPerformed(ActionEvent event){
if(event.getSource() == mainFrame.getButtonJenisMember()){
mainFrame.showJenisMemberFrame();
} else {
mainFrame.showMemberFrame();
}
}
}
