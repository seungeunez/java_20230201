package frame;

import javax.swing.JDialog;
import javax.swing.JButton;


//1. extends JDialog 상속
public class JoinFrame extends JDialog {
	public JoinFrame() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 128, 97, 23);
		getContentPane().add(btnNewButton);
		
		
		//3줄 추가
		this.setModal(true);
		this.setSize(100,200);
		this.setVisible(true);
	}
}
