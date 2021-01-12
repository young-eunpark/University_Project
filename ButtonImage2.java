package w14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonImage2 extends JFrame{
	ButtonImage2(){
		super("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new ShowImage2());
		setSize(300,300);
		setVisible(true);
	}
	class ShowImage2 extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		private JButton button = new JButton("Show");
		private boolean showFlag = true;
		
		public ShowImage2() {
			setLayout(new FlowLayout());
			add(button);
			
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					showFlag = !showFlag; 
					repaint(); 
				}				
			});
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(showFlag) 
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);			
		}
	}
	public static void main(String[] args) {
		new ButtonImage2();
	}
}
