package frame;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


//frame도 누군가에 의해서 상속되어야 함
//extends 상속임

// Help - Ecilpse Marketer - windowbuilder current 설치해야함
//클래스 우클릭 - Open With - WindowBuilder Editor

public class StudentFrame extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public StudentFrame() {
		setTitle("학생등록");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학번");
		lblNewLabel.setBounds(149, 76, 57, 15);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(192, 73, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(149, 118, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("학년");
		lblNewLabel_2.setBounds(149, 159, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 115, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(192, 156, 116, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("등록하기");
		btnNewButton.setBounds(137, 219, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.setBounds(245, 219, 97, 23);
		getContentPane().add(btnNewButton_1);
	
		this.setSize(500, 400);
		this.setVisible(true);
		
		
		
	}
}
