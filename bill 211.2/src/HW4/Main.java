package HW4;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.text.AttributeSet.ColorAttribute;

import lab8.ChatBox;

public class Main extends JFrame implements Runnable {

//	public class Inner extends JPanel{
//		static int x;
//		static int y;
//		
//		public void paintComponent(Graphics g){
//		  super.paintComponent(g);
//		  g.setColor(Color.BLUE);
//		  g.fillRect(100,100,20,20);
//		
//		  }
//	}

	int x, y;

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 20, 20);
	}
	
	Thread mon = new Thread();
	
	public Main() {
		JPanel panel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		getContentPane().setLayout(null);
		add(panel);
		repaint();
		
	}

	public class Monster {

		public Monster(int abs, int abs2) {

		}

	}

	 

	public static void main(String[] args) {

		int number_of_monsters = Integer.parseInt(args[0]);
		System.out.println(number_of_monsters);
		Main m = new Main();
		m.setVisible(true);

		Main.Monster[] monsters = new Main.Monster[number_of_monsters];

		Random r = new Random();

		for (int i = 0; i < number_of_monsters; i++) {
			monsters[i] = m.new Monster(Math.abs(r.nextInt() % 500), Math.abs(r.nextInt() % 500));
		
		}

		// for(int i=0;i<number_of_monsters;i++)
		// monsters[i].start();

		/*
		 * try { for(int i=0;i<number_of_monsters;i++) monsters[i].join(); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

	}


}
