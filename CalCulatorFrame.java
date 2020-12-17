package w09;

import javax.swing.*;
import java.awt.*;
class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		JLabel jl = new JLabel("수식입력");
		add(jl);
		add(new JTextField(10));
	}
}
class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(new GridLayout(4,4,5,5));
		for(int i=0; i<10; i++) {
		JButton b = new JButton(Integer.toString(i));
		add(b);
		}
		JButton b1=new JButton("CE"); JButton b2=new JButton("계산");
		add(b1); add(b2);
		JButton o1=new JButton("+"); JButton o2=new JButton("-");
		JButton o3=new JButton("x"); JButton o4=new JButton("/");
		o1.setBackground(Color.CYAN); o2.setBackground(Color.CYAN);
		o3.setBackground(Color.CYAN); o4.setBackground(Color.CYAN);
		add(o1); add(o2); add(o3); add(o4);
	}
}
class SouthPanel extends JPanel {
	public SouthPanel() {
		setBackground(Color.YELLOW);
		JLabel j2 = new JLabel("계산 결과");
		add(j2);
		add(new JTextField(10));
	}		
}
public class CalCulatorFrame extends JFrame{
	public CalCulatorFrame()
	{
		setTitle("계산기 프레임");
		add(new SouthPanel(),BorderLayout.SOUTH);
		add(new CenterPanel(),BorderLayout.CENTER);
		add(new NorthPanel(),BorderLayout.NORTH);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CalCulatorFrame();
	}
}
