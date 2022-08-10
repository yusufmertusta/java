import java.awt.*;
import javax.swing.*;

import hw2.hw2;

public class GUI extends Canvas{
	
	static char[] file_path;
	static JFrame f;
	static JLabel a1, a2;
	static JTextField b1, b2;
	static JButton btn, btn2;
	static Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	static JComboBox cb = new JComboBox(arr);
	static Canvas canvas = new Canvas();
	

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(0,0,100,100);
		g.drawOval(0,0,100,100);
	}
	
	public static void main(String[] args) {
		f = new JFrame("K-Means Clustering");
		hw2 h = new hw2();
		canvas.setBounds(100,100,960,540);
		cb.setBounds(350,450,50,30);
		a1 = new JLabel("Iterasyon:");
		a1.setBounds (50, 450,100, 30);
		a2 = new JLabel("K sayýsý:(Center)");
		a2.setBounds (230, 450,100, 30);
		b1 = new JTextField();
		b1.setBounds (110, 452, 100, 30);
		btn = new JButton();
		btn2 = new JButton();
		btn.setText("K-Means Clustering");
		btn.setBounds(660, 450,150, 30);
		btn2.setText("Dosyadan seç");
		btn2.setBounds(500, 450,150, 30);
		//f.add(cb);
		//f.add(a1);
		//f.add(b1);
		//f.add(a2);
		//f.add(btn);
		//f.add(btn2);
		f.setSize(960,540);
		//f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(h);
		
	
	}
	
	
}
