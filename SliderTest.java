package w13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class SliderTest extends JFrame {
	JSlider slide;
	JLabel lbl;
	SliderTest(){
		setTitle("슬라이드 예제");
		setLayout(new BorderLayout());
		
		slide=new JSlider(JSlider.HORIZONTAL,0,100,50);
		slide.setPaintLabels(true);
		slide.setPaintTicks(true);
		slide.setPaintTrack(true);
		slide.setMajorTickSpacing(20);
		slide.setMinorTickSpacing(5);
		
		lbl=new JLabel("I LOVE JAVA");
		lbl.setForeground(Color.orange);
		lbl.setFont(new Font("TimesRoman",Font.PLAIN,50));
		lbl.setHorizontalAlignment(JLabel.CENTER);
		
		slide.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider sd=(JSlider)e.getSource();
				lbl.setFont(new Font("TimesRoman",Font.PLAIN,sd.getValue()));
				
				if(sd.getValue()<20)
					lbl.setFont(new Font("TimesRoman",Font.PLAIN,20));
				else if(sd.getValue()>80)
					lbl.setFont(new Font("TimesRoman",Font.PLAIN,80));
			}
		});
		add(slide,BorderLayout.NORTH);
		add(lbl,BorderLayout.CENTER);
		
		setSize(600,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SliderTest();
	}
}
