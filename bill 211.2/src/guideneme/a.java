package guideneme;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class a extends JFrame {
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					a frame = new a("ChatBox");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public a(String s) {
		String a="";
		setTitle(s);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		getContentPane().setLayout(null);
		
		JTextField tf = new JTextField();
		tf.setBounds(60, 10, 200, 20);
		getContentPane().add(tf);
		tf.setColumns(20);
		
		JButton btn1 = new JButton("Gonder");
		btn1.setBounds(270, 10, 85, 20);
		getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Temizle");
		btn2.setBounds(360, 10, 85, 20);
		getContentPane().add(btn2);
		
		JTextArea ta = new JTextArea();
		ta.setEditable(false);
		ta.setRows(30);
		ta.setColumns(20);
		ta.setBounds(0, 45, 500, 555);
		getContentPane().add(ta);
		
		btn1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				 String text =  "Ben: "+tf.getText()+"\n";
				 
				   ta.insert(text,0);
				
			}
		});
		
		btn2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent a) {
				ta.setText("");
			}
		});
		
	}
}
