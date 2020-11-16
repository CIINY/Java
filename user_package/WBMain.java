package user_package;
import java.awt.EventQueue;

public class WBMain {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB3_login frame = new WB3_login();	//frame이라는 이름으로 생성자를 부른다. WBSecond() -> 화면임
					frame.setVisible(true);		//화면을 부른다.
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
