package frame;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;


//1. extends JDialog 상속
public class JoinFrame extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public JoinFrame() {
		setTitle("Sign up");
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBounds(95, 210, 97, 23);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(76, 10, 116, 23);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(12, 14, 37, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PassWord");
		lblNewLabel_1.setBounds(12, 49, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 46, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 83, 116, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(12, 86, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone");
		lblNewLabel_3.setBounds(12, 121, 57, 15);
		getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 118, 116, 21);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Role");
		lblNewLabel_4.setBounds(12, 155, 57, 15);
		getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(76, 149, 116, 21);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
		//3줄 추가
		this.setModal(true);
		this.setSize(224,282);
		this.setVisible(true);
	}
}
