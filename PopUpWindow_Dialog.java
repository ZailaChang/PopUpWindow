package web.GUI;


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class PopUpWindow_Dialog extends JDialog {

	private static final long serialVersionUID = 1L;

	public PopUpWindow_Dialog(MyFrame frame) {
		super(frame, "step2", true);// 繼承了JDialog類,使用super關鍵字呼叫JDialog構造方法
		Container container = getContentPane();// 建立一個容器
		container.add(new JLabel("已為您進行到第二步驟審核！！"));
		setBounds(100, 100, 200, 200);// 前面兩數字是對話框位置、後兩個是對話筐大小

	}

	public static class MyFrame extends JFrame { // 建立新類,繼承自JFrame
		private static final long serialVersionUID = 1L;

		public static void main(String[] args) {
			new MyFrame();

		}

		public MyFrame() {
			Container container = getContentPane();// 建立一個容器
			container.setLayout(new FlowLayout());
			;
			JLabel JL = new JLabel("請問您確定要執行此任務嗎"); // 在窗體中設定標籤
			JL.setHorizontalAlignment(SwingConstants.CENTER);
			container.add(JL); // 標籤加到容器中
			JButton jButton = new JButton("是否確認執行？");
			container.add(jButton);
			jButton.setBounds(40, 60, 120, 60);
			jButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					new PopUpWindow_Dialog(MyFrame.this).setVisible(true);

				}
			});
			container.setBackground(Color.black);
			setSize(200, 200);
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setVisible(true);
		}

	}


}
