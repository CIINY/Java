package user_package;
import java.awt.EventQueue;

public class WBMain {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB3_login frame = new WB3_login();	//frame�̶�� �̸����� �����ڸ� �θ���. WBSecond() -> ȭ����
					frame.setVisible(true);		//ȭ���� �θ���.
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
