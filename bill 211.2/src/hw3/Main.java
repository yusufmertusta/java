package hw3;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BasicStroke;
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Main extends JPanel {

	public static void main(String[] args) {
		new Main();

	}

	boolean draw0, draw1, draw2, draw3, draw4, draw5, draw6, draw7, draw8, draw9, drawC;
	int a = 0;

	public Main() {

		JFrame frame = new JFrame("Calculator");
		frame.setSize(800, 1000);

		DrawPanel panel = new DrawPanel();
		panel.setBounds(20, 30, 740, 160);
		panel.setBackground(Color.WHITE);
		frame.add(panel);

		JButton btn0 = new JButton();
		btn0.setText("0");
		btn0.setBounds(20, 700, 170, 100);
		btn0.setBackground(Color.BLUE);
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn0);

		JButton btndot = new JButton();
		btndot.setText(".");
		btndot.setBounds(210, 700, 170, 100);
		btndot.setBackground(Color.BLUE);
		btndot.setForeground(Color.WHITE);
		btndot.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btndot);

		JButton btneq = new JButton();
		btneq.setText("=");
		btneq.setBounds(400, 700, 170, 100);
		btneq.setBackground(Color.BLUE);
		btneq.setForeground(Color.WHITE);
		btneq.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btneq);

		JButton btndiv = new JButton();
		btndiv.setText("÷");
		btndiv.setBounds(590, 700, 170, 100);
		btndiv.setBackground(Color.BLUE);
		btndiv.setForeground(Color.WHITE);
		btndiv.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btndiv);

		JButton btn1 = new JButton();
		btn1.setText("1");
		btn1.setBounds(20, 580, 170, 100);
		btn1.setBackground(Color.BLUE);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn1);

		JButton btn2 = new JButton();
		btn2.setText("2");
		btn2.setBounds(210, 580, 170, 100);
		btn2.setBackground(Color.BLUE);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn2);

		JButton btn3 = new JButton();
		btn3.setText("3");
		btn3.setBounds(400, 580, 170, 100);
		btn3.setBackground(Color.BLUE);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn3);

		JButton btnx = new JButton();
		btnx.setText("x");
		btnx.setBounds(590, 580, 170, 100);
		btnx.setBackground(Color.BLUE);
		btnx.setForeground(Color.WHITE);
		btnx.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btnx);

		JButton btn4 = new JButton();
		btn4.setText("4");
		btn4.setBounds(20, 460, 170, 100);
		btn4.setBackground(Color.BLUE);
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn4);

		JButton btn5 = new JButton();
		btn5.setText("5");
		btn5.setBounds(210, 460, 170, 100);
		btn5.setBackground(Color.BLUE);
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn5);

		JButton btn6 = new JButton();
		btn6.setText("6");
		btn6.setBounds(400, 460, 170, 100);
		btn6.setBackground(Color.BLUE);
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn6);

		JButton btnmin = new JButton();
		btnmin.setText("-");
		btnmin.setBounds(590, 460, 170, 100);
		btnmin.setBackground(Color.BLUE);
		btnmin.setForeground(Color.WHITE);
		btnmin.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btnmin);

		JButton btn7 = new JButton();
		btn7.setText("7");
		btn7.setBounds(20, 340, 170, 100);
		btn7.setBackground(Color.BLUE);
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn7);

		JButton btn8 = new JButton();
		btn8.setText("8");
		btn8.setBounds(210, 340, 170, 100);
		btn8.setBackground(Color.BLUE);
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn8);

		JButton btn9 = new JButton();
		btn9.setText("9");
		btn9.setBounds(400, 340, 170, 100);
		btn9.setBackground(Color.BLUE);
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btn9);

		JButton btnpl = new JButton();
		btnpl.setText("+");
		btnpl.setBounds(590, 340, 170, 100);
		btnpl.setBackground(Color.BLUE);
		btnpl.setForeground(Color.WHITE);
		btnpl.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(btnpl);

		JButton btnC = new JButton();
		btnC.setText("C");
		btnC.setBounds(20, 220, 740, 100);
		btnC.setBackground(Color.BLUE);
		btnC.setForeground(Color.WHITE);
		btnC.setFont(new Font("Arial", Font.PLAIN, 60));
		frame.add(btnC);

		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw0 = true;
				panel.repaint();
			}
		});

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw1 = true;
				panel.repaint();
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw2 = true;
				panel.repaint();
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw3 = true;
				panel.repaint();
			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw4 = true;
				panel.repaint();
			}
		});
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw5 = true;
				panel.repaint();
			}
		});
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw6 = true;
				panel.repaint();
			}
		});
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw7 = true;
				panel.repaint();
			}
		});
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw8 = true;
				panel.repaint();
			}
		});
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				draw9 = true;
				panel.repaint();
			}
		});
		btnC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				drawC = true;
				panel.repaint();
			}
		});

		setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);

	}

	public class DrawPanel extends JPanel {

		@Override
		public void paintComponent(Graphics g1) {
			clear(g1);
			super.paintComponent(g1);
			Graphics2D g = (Graphics2D) g1;
			g.setColor(Color.BLACK);
			g.setStroke(new BasicStroke(3f));
			if (draw0 == true) {
				g.drawLine(700, 40, 700, 120);
				g.drawLine(650, 40, 650, 120);
				g.drawLine(650, 40, 700, 40);
				g.drawLine(650, 120, 700, 120);
				draw0 = false;
			}
			if (draw1 == true) {
				g.drawLine(700, 40, 700, 120);
				draw1 = false;
			}
			if (drawC == true) {
				g.setColor(Color.WHITE);
				g.fillRect(20, 30, 740, 120);
				drawC = false;
			}
			if (draw3 == true) {
				g.drawLine(700, 40, 700, 120);
				g.drawLine(650, 120, 700, 120);
				g.drawLine(650, 80, 700, 80);
				g.drawLine(650, 40, 700, 40);
				draw3=false;
			}
			if (draw4 == true) {
				g.drawLine(700, 40, 700, 120);
				g.drawLine(650, 80, 700, 80);
				g.drawLine(650, 40, 650, 80);
				draw4=false;
			}
			if (draw5 == true) {
				g.drawLine(650, 40, 650, 80);
				g.drawLine(650, 80, 700, 80);
				g.drawLine(700, 80, 700, 120);
				g.drawLine(650, 40, 700, 40);
				g.drawLine(650, 120, 700, 120);
				draw5=false;
			}
			if (draw6 == true) {
				g.drawLine(650, 40, 650, 120);
				g.drawLine(650, 40, 700, 40);
				g.drawLine(700, 80, 700, 120);
				g.drawLine(650, 120, 700, 120);
				g.drawLine(650, 80, 700, 80);
				g.drawLine(650, 40, 650, 80);
				draw6=false;
			}
			if (draw7 == true) {
				g.drawLine(700, 40, 700, 120);
				g.drawLine(650, 40, 700, 40);
				draw7=false;
			}
			if (draw8 == true) {
				g.drawLine(700, 40, 700, 120);
				g.drawLine(650, 40, 650, 120);
				g.drawLine(650, 120, 700, 120);
				g.drawLine(650, 80, 700, 80);
				g.drawLine(650, 40, 700, 40);
				draw8=false;
			}
			if (draw9 == true) {
				g.drawLine(700, 40, 700, 120);
				g.drawLine(650, 40, 650, 80);
				g.drawLine(650, 120, 700, 120);
				g.drawLine(650, 80, 700, 80);
				g.drawLine(650, 40, 700, 40);
				draw9=false;
			}
			if (draw2 == true) {
				g.drawLine(700, 40, 700, 80);
				g.drawLine(650, 80, 650, 120);
				g.drawLine(650, 120, 700, 120);
				g.drawLine(650, 80, 700, 80);
				g.drawLine(650, 40, 700, 40);
				draw2=false;
			}
		}

		public void clear(Graphics g) {
			super.paintComponent(g);
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(400, 300);
		}
	}
}
