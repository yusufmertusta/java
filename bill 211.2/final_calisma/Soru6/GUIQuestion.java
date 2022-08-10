package Soru6;

import java.util.*;
import javax.swing.*;
import java.awt.event.*; 
import org.w3c.dom.events.MouseEvent;

import java.awt.*;

public class GUIQuestion extends JFrame implements MouseListener {
	int x = 0, y = 50, en = 0, boy = 50;
	boolean exited = false, entered = false, clicked = false;

	public GUIQuestion() {
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);
	}

	public void paint(Graphics g) {
		if (clicked) {
			en += 50;
			if (en > 200) {
				g.clearRect(0, 0, 200, 200);
				en = 50;
			}
			g.fillRect(x, y, en, boy);
			clicked = false;
		}
		if (exited) {
			g.setColor(Color.GREEN);
			g.fillRect(x, y, en, boy);
			exited = false;
		}
		if (entered) {
			g.setColor(Color.BLACK);
			g.fillRect(x, y, en, boy);
			entered = false;
		}
	}

	
	public static void main(String[] args) {
		new GUIQuestion();
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		clicked = true;
		repaint();
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		entered = true;
		repaint();
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		exited = true;
		repaint();
	}
}