package user_package;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class WB2_main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB2_main frame = new WB2_main();
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
	public WB2_main() {
		setTitle("\uBA54\uC778\uD654\uBA74");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NYoung Cafe");
		lblNewLabel.setBounds(104, 50, 170, 33);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 30));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\uBA54\uB274 \uC8FC\uBB38\uD558\uB7EC \uAC00\uAE30");
		btnNewButton_1.setBounds(70, 171, 229, 105);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB5_menu().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("HYÁß°íµñ", Font.PLAIN, 20));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uC9C0\uC810 \uC870\uD68C\uD558\uAE30");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			new WB9().setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(70, 360, 229, 105);
		btnNewButton_1_1.setFont(new Font("HYÁß°íµñ", Font.PLAIN, 20));
		contentPane.add(btnNewButton_1_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 373, 26);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("MY");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\uC2A4\uD0EC\uD504 \uD655\uC778");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB7_stamp().setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\uD68C\uC6D0\uC815\uBCF4");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB4_info().setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\uB85C\uADF8\uC544\uC6C3");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			new WB3_login().setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
	}
}
