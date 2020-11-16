package user_package;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WB12_New extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final JRadioButton radioButton = new JRadioButton("\uC5EC\uC131");
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB12_New frame = new WB12_New();
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
	public WB12_New() {
		setTitle("\uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u25C6 \uC815\uBCF4\uB97C \uC785\uB825\uD558\uC2ED\uC2DC\uC624.");
		lblNewLabel.setFont(new Font("ÇÔÃÊ·Ò¹ÙÅÁ", Font.BOLD, 17));
		lblNewLabel.setBounds(14, 54, 181, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(15, 12, 132, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(20, 365, 62, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PW");
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(20, 405, 62, 18);
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(71, 360, 147, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(71, 400, 147, 24);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("\uC911\uBCF5\uD655\uC778");
		btnNewButton.setBounds(237, 358, 105, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_2 = new JLabel("E-MAIL");
		lblNewLabel_2_2.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNewLabel_2_2.setBounds(20, 280, 89, 18);
		contentPane.add(lblNewLabel_2_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(23, 310, 116, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("@");
		lblNewLabel_3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(151, 313, 27, 18);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(30);
		comboBox.setBounds(181, 310, 147, 24);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2_3 = new JLabel("\uC774\uB984");
		lblNewLabel_2_3.setFont(new Font("HY±×·¡ÇÈM", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(20, 100, 62, 18);
		contentPane.add(lblNewLabel_2_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(70, 97, 116, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_2_3_1.setFont(new Font("HY±×·¡ÇÈM", Font.BOLD, 18));
		lblNewLabel_2_3_1.setBounds(20, 190, 83, 18);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("\uC131\uBCC4");
		lblNewLabel_2_3_2.setFont(new Font("HY±×·¡ÇÈM", Font.BOLD, 18));
		lblNewLabel_2_3_2.setBounds(20, 145, 62, 18);
		contentPane.add(lblNewLabel_2_3_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC131");
		rdbtnNewRadioButton.setBounds(80, 143, 57, 27);
		contentPane.add(rdbtnNewRadioButton);
		radioButton.setBounds(150, 139, 62, 36);
		contentPane.add(radioButton);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setMaximumRowCount(6);
		comboBox_1.setBounds(22, 220, 57, 24);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(93, 220, 50, 24);
		contentPane.add(comboBox_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(167, 220, 63, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(252, 220, 63, 24);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_4 = new JLabel("-");
		lblNewLabel_4.setBounds(151, 224, 18, 18);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("-");
		lblNewLabel_4_1.setBounds(237, 224, 18, 18);
		contentPane.add(lblNewLabel_4_1);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC785");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB2_main().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(20, 455, 333, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB3_login().setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(20, 515, 333, 42);
		contentPane.add(btnNewButton_1_1);
	}
}
