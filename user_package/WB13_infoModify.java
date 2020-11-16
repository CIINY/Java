package user_package;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WB13_infoModify extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB13_infoModify frame = new WB13_infoModify();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WB13_infoModify() {
		setTitle("\uD68C\uC6D0\uC815\uBCF4 \uC218\uC815");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u25C6 \uC815\uBCF4\uB97C \uC785\uB825\uD558\uC2ED\uC2DC\uC624.");
		lblNewLabel.setFont(new Font("ÇÔÃÊ·Ò¹ÙÅÁ", Font.BOLD, 17));
		lblNewLabel.setBounds(14, 54, 181, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uC815\uBCF4 \uC218\uC815");
		lblNewLabel_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(15, 12, 132, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(20, 110, 62, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PW");
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(20, 150, 62, 18);
		contentPane.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 145, 147, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 105, 147, 24);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("\uC911\uBCF5\uD655\uC778");
		btnNewButton.setBounds(250, 103, 105, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_2 = new JLabel("E-MAIL");
		lblNewLabel_2_2.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNewLabel_2_2.setBounds(20, 215, 89, 18);
		contentPane.add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(22, 250, 116, 24);
		contentPane.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("@");
		lblNewLabel_3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(150, 253, 27, 18);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(30);
		comboBox.setBounds(180, 250, 147, 24);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_2_3_1.setFont(new Font("HY±×·¡ÇÈM", Font.BOLD, 18));
		lblNewLabel_2_3_1.setBounds(20, 325, 83, 18);
		contentPane.add(lblNewLabel_2_3_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setMaximumRowCount(6);
		comboBox_1.setBounds(22, 362, 57, 24);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(93, 362, 50, 24);
		contentPane.add(comboBox_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(167, 362, 63, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(252, 362, 63, 24);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_4 = new JLabel("-");
		lblNewLabel_4.setBounds(151, 365, 18, 18);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("-");
		lblNewLabel_4_1.setBounds(237, 365, 18, 18);
		contentPane.add(lblNewLabel_4_1);
		
		JButton btnNewButton_1 = new JButton("\uC218\uC815");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new WB4_info().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(20, 455, 333, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB4_info().setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(20, 515, 333, 42);
		contentPane.add(btnNewButton_1_1);
		

	}

}
