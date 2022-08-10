package midterm1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class D {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300,200);
		f.setLocation(660,300);

		JPanel p = new JPanel();
	
		JButton b = new JButton("exit");
		b.setBounds(100,60,100,50);
		f.add(b);
		
		
		
		b.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		f.add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
	

	
}
