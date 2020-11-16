package user_package;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class WB5_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB5_menu frame = new WB5_menu();
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
	public WB5_menu() {
		setTitle("\uBA54\uB274\uD310");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBA54\uB274\uD310");
		lblNewLabel_1_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(15, 15, 132, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 69, 150, 150);
		contentPane.add(panel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 150, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 150, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(185, 69, 150, 150);
		contentPane.add(panel_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(352, 0, 21, 585);
		contentPane.add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("\uC5D0\uC2A4\uD504\uB808\uC18C");
		lblNewLabel.setFont(new Font("HYÁß°íµñ", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 225, 150, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uBA54\uB9AC\uCE74\uB178");
		lblNewLabel_1.setFont(new Font("HYÁß°íµñ", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(185, 225, 150, 18);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 250, 54, 24);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(185, 250, 54, 24);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(80, 250, 34, 24);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(245, 250, 34, 24);
		contentPane.add(comboBox_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 314, 150, 150);
		contentPane.add(panel_2);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 150, Short.MAX_VALUE)
				.addGap(0, 150, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 150, Short.MAX_VALUE)
				.addGap(0, 150, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(185, 314, 150, 150);
		contentPane.add(panel_3);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 150, Short.MAX_VALUE)
				.addGap(0, 150, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 150, Short.MAX_VALUE)
				.addGap(0, 150, Short.MAX_VALUE)
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("\uC5D0\uC2A4\uD504\uB808\uC18C");
		lblNewLabel_2.setFont(new Font("HYÁß°íµñ", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(20, 470, 150, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uC5D0\uC2A4\uD504\uB808\uC18C");
		lblNewLabel_2_1.setFont(new Font("HYÁß°íµñ", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(185, 470, 150, 18);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(20, 495, 54, 24);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setBounds(185, 495, 54, 24);
		contentPane.add(comboBox_3_1);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setBounds(80, 495, 34, 24);
		contentPane.add(comboBox_2_2);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setBounds(245, 495, 34, 24);
		contentPane.add(comboBox_2_1_1);
		
		JButton btnNewButton_2 = new JButton("HOME");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB2_main().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(260, 0, 92, 46);
		contentPane.add(btnNewButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(140, 251, 25, 27);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(310, 251, 25, 27);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1.setBounds(145, 494, 25, 27);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_1.setBounds(310, 494, 25, 27);
		contentPane.add(rdbtnNewRadioButton_1_1_1);
		
		JButton btnNewButton = new JButton("\uC120\uD0DD \uC644\uB8CC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB6_order().setVisible(true);
			}
		});
		btnNewButton.setBounds(127, 19, 105, 27);
		contentPane.add(btnNewButton);
	}
}
