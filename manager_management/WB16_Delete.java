package manager_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WB16_Delete extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB16_Delete frame = new WB16_Delete();
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
	public WB16_Delete() {
		setTitle("\uB4F1\uAE09\uBCC4\uD61C\uD0DD \uC0AD\uC81C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uB4F1\uAE09\uBCC4\uD61C\uD0DD \uC0AD\uC81C");
		lblNewLabel_1_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(15, 15, 152, 31);
		contentPane.add(lblNewLabel_1_1);
		
		comboBox = new JComboBox();
		comboBox.setBounds(170, 107, 114, 31);
		contentPane.add(comboBox);
		
		lblNewLabel = new JLabel("\uB4F1\uAE09 \uC120\uD0DD");
		lblNewLabel.setBounds(85, 113, 62, 18);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("\uC0AD\uC81C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new Delete().setVisible(true);
			}
		});
		btnNewButton.setBounds(62, 213, 105, 35);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB16().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(202, 213, 105, 35);
		contentPane.add(btnNewButton_1);
	}

}
