package hw3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;

public class cal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal frame = new cal("Calculator");
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
	public cal(String s) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3_5 = new JButton("0");
		btnNewButton_3_5.setForeground(Color.WHITE);
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_5.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_5);
		
		JButton btnNewButton_3_4 = new JButton("0");
		btnNewButton_3_4.setForeground(Color.WHITE);
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_4.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_3 = new JButton("0");
		btnNewButton_3_3.setForeground(Color.WHITE);
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_3.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_2 = new JButton("0");
		btnNewButton_3_2.setForeground(Color.WHITE);
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_2.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_1 = new JButton("0");
		btnNewButton_3_1.setForeground(Color.WHITE);
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_1.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("0");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3_6 = new JButton("0");
		btnNewButton_3_6.setForeground(Color.WHITE);
		btnNewButton_3_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_6.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_6);
		
		JButton btnNewButton_3_9 = new JButton("0");
		btnNewButton_3_9.setForeground(Color.WHITE);
		btnNewButton_3_9.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_9.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_9);
		
		JButton btnNewButton_3_7 = new JButton("0");
		btnNewButton_3_7.setForeground(Color.WHITE);
		btnNewButton_3_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_7.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_7);
		
		JButton btnNewButton_3_8 = new JButton("0");
		btnNewButton_3_8.setForeground(Color.WHITE);
		btnNewButton_3_8.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_8.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_8);
		
		JButton btnNewButton_3_10 = new JButton("0");
		btnNewButton_3_10.setForeground(Color.WHITE);
		btnNewButton_3_10.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_10.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_10);
		
		JButton btnNewButton_3_11 = new JButton("0");
		btnNewButton_3_11.setForeground(Color.WHITE);
		btnNewButton_3_11.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_11.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_11);
		
		JButton btnNewButton_3_12 = new JButton("0");
		btnNewButton_3_12.setForeground(Color.WHITE);
		btnNewButton_3_12.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_3_12.setBackground(new Color(30, 144, 255));
		contentPane.add(btnNewButton_3_12);
	}
}
