package hw4_def;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.event.*;
import javax.swing.*;

public class HandlingEvents implements Runnable {

	JFrame frame;
	int X = 240;
	int Y = 240;
	Canvas canvas;
	BufferStrategy bufferStrategy;
	boolean running = true;

	public HandlingEvents() {
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
	}

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
		HandlingEvents ex = new HandlingEvents();
		new Thread(ex).start();
	}

	public void Paint() {
		Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.clearRect(0, 0, 500, 500);
		Paint(g);
		bufferStrategy.show();
	}

	protected void Paint(Graphics2D g) {
		g.setColor(Color.green);
		g.fillRect(X, Y, 20, 20);
	}

	public void moveIt(KeyEvent evt) {
		switch (evt.getKeyCode()) {
		case KeyEvent.VK_DOWN:
			Y += 10;
			break;
		case KeyEvent.VK_UP:
			Y -= 10;
			break;
		case KeyEvent.VK_LEFT:
			X -= 10;
			break;
		case KeyEvent.VK_RIGHT:
			X += 10;
			break;
		}

	}
}
