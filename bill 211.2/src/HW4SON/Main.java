package HW4SON;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;

import hw4_def.Main.Monster;

public class Main implements Runnable {

	Random w = new Random();

	public class Monster extends Thread {
		public int coorX, coorY;

		public Monster(int x, int y) {
			this.coorX = x;
			this.coorY = y;
			PaintMonster(coorX, coorY);
		}

		int way;

		@Override
		public void run() {
			int coorX = getX(), coorY = getY();
			while (X != coorX && Y != coorY) {
				int xD = X - coorX;
				int yD = Y - coorY;
				if (xD < 0 && yD < 0)
					way = 8;
				else if (xD == 0 && yD < 0)
					way = 7;
				else if (xD == 0 && yD > 0)
					way = 2;
				else if (xD < 0 && yD == 0)
					way = 5;
				else if (xD > 0 && yD == 0)
					way = 4;
				else if (xD > 0 && yD > 0)
					way = 1;
				else if (xD < 0 && yD > 0)
					way = 3;
				else if (xD > 0 && yD < 0)
					way = 6;
				try {
					if (doOverlap(getX(), getY(), getX() + 20, getY() + 20, X, Y, X + 20, Y + 20)) {
						System.exit(0);
					}
					moveMonster(way);
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}

			}
		}

		public int getX() {
			return coorX;
		}

		public int getY() {
			return coorY;
		}

		public void PaintMonster(int a, int b) {
			Graphics2D x = (Graphics2D) bufferStrategy.getDrawGraphics();
			x.setColor(Color.blue);
			x.fillRect(a, b, 20, 20);
			coorX = a;
			coorY = b;
		}

		public void moveMonster(int way) {
			Graphics2D x = (Graphics2D) bufferStrategy.getDrawGraphics();
			x.clearRect(coorX, coorY, 20, 20);
			switch (way) {
			case 1:
				if (w.nextInt() % 2 == 0)
					coorX += 10;
				if (w.nextInt() % 2 == 1)
					coorY += 10;
				PaintMonster(coorX, coorY);
				break;
			case 2:
				coorY += 10;
				PaintMonster(coorX, coorY);
				break;
			case 3:
				if (w.nextInt() % 2 == 0)
					coorX -= 10;
				if (w.nextInt() % 2 == 1)
					coorY += 10;
				PaintMonster(coorX, coorY);
				break;
			case 4:
				coorX += 10;
				PaintMonster(coorX, coorY);
				break;
			case 5:
				coorX -= 10;
				PaintMonster(coorX, coorY);
				break;
			case 6:
				if (w.nextInt() % 2 == 0)
					coorX += 10;
				if (w.nextInt() % 2 == 1)
					coorY -= 10;
				PaintMonster(coorX, coorY);
				break;
			case 7:
				coorY -= 10;
				PaintMonster(coorX, coorY);
				break;
			case 8:
				if (w.nextInt() % 2 == 0)
					coorX -= 10;
				if (w.nextInt() % 2 == 1)
					coorY -= 10;
				PaintMonster(coorX, coorY);
				break;
			}

			bufferStrategy.show();
		}

		public boolean doOverlap(int l1x, int l1y, int r1x, int r1y, int l2x, int l2y, int r2x, int r2y) {
			if (l1x == r1x || l1y == r1y || r2x == l2x || l2y == r2y) {
				return false;
			}
			if (l1x > r2x || l2x > r1x) {
				return false;
			}

			if (r1y > l2y || r2y > l1y) {
				return false;
			}

			return true;
		}

	}

	public void PaintMonster() {
	}

	public void moveMonster() {

	}

	JFrame frame;
	int X = 240;
	int Y = 240;
	Canvas canvas;
	BufferStrategy bufferStrategy;
	boolean running = true;

	public Main() {
		frame = new JFrame();
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setPreferredSize(new Dimension(500, 500));
		panel.setLayout(null);
		canvas = new Canvas();
		canvas.setBounds(0, 0, 500, 500);
		canvas.setIgnoreRepaint(true);
		panel.add(canvas);
		canvas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				moveIt(evt);
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		canvas.createBufferStrategy(2);
		bufferStrategy = canvas.getBufferStrategy();
		canvas.requestFocus();
		new Thread(this).start();

	}

	@Override
	public void run() {
		while (running = true) {
			Paint();
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {
		int number_of_monsters = Integer.parseInt(args[0]);
		System.out.println(number_of_monsters);
		Main m = new Main();

		Main.Monster[] monsters = new Main.Monster[number_of_monsters];

		Random r = new Random();

		for (int i = 0; i < number_of_monsters; i++) {
			monsters[i] = m.new Monster(Math.abs(r.nextInt() % 500), Math.abs(r.nextInt() % 500));
			monsters[i].setName("monster-" + i);
		}

		for (int i = 0; i < number_of_monsters; i++)
			monsters[i].start();

		for (int i = 0; i < number_of_monsters; i++)
			try {
				monsters[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	int oldX, oldY;

	public void Paint() {
		Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.clearRect(oldX, oldY, 20, 20);
		Paint(g);
		bufferStrategy.show();
	}

	protected void Paint(Graphics2D g) {
		g.setColor(Color.green);
		g.fillRect(X, Y, 20, 20);
		oldX = X;
		oldY = Y;
	}

	public void moveIt(KeyEvent evt) {
		switch (evt.getKeyCode()) {
		case KeyEvent.VK_S:
			Y += 10;
			break;
		case KeyEvent.VK_W:
			Y -= 10;
			break;
		case KeyEvent.VK_A:
			X -= 10;
			break;
		case KeyEvent.VK_D:
			X += 10;
			break;
		}

	}
}