package hw4_def;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	int x,y;

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 20, 20);
	}

	public class Monster implements Runnable {
		
		Thread t;
		
		public Monster(int a, int b) {
			t = new Thread(this);
			repaint(a,b,20,20);
			x = a;
			y = b;
			System.out.println("x="+x+"y="+y);
			System.out.println(t.getId()+" has created");
			repaint(x,y,20,20);
		}

		@Override
		public void run() {
			System.out.println("monster"+t.getId());
			repaint(x+5,y+5,20,20);
			
			
		}

		public void start() {
			t.start();
			
		}

		public void join() {
			// TODO Auto-generated method stub
			
		}

	}

	public Main() {
		JPanel panel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		getContentPane().setLayout(null);
		setVisible(true);
		add(panel);
		
	}

public static void main(String[] args) {
		
		int number_of_monsters = Integer.parseInt(args[0]);
		System.out.println(number_of_monsters);
		Main m = new Main();
		
		Main.Monster [] monsters = new Main.Monster[number_of_monsters];
		
		Random r = new Random();
		
		for(int i=0;i<number_of_monsters;i++)
		{
			monsters[i] = m.new Monster(Math.abs(r.nextInt()%500),Math.abs(r.nextInt()%500));	
		
		}
		
		for(int i=0;i<number_of_monsters;i++)
			monsters[i].start();
		
		for(int i=0;i<number_of_monsters;i++)       // try catch sildim!!!!
			monsters[i].join();
		
		

	}

}
