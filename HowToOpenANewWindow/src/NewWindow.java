import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow
{
JFrame frame = new JFrame();
JLabel label = new JLabel ("RAMSON NEVER GIVE UP ON CODING!");

NewWindow(){
	label.setBounds(0, 0, 100, 50);
	label.setFont(new Font(null,Font.PLAIN,5));	
	
	frame.add(label);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(420, 420);
	frame.setLayout(null);
	frame.setVisible(true);
}
}
