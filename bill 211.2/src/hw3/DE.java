package hw3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DE extends JFrame implements ActionListener{
    public JButton button;
    public boolean check;

    public void paint(Graphics g){
        if(check==true){
            g.setColor(Color.red);
            g.fillRect(30, 50, 50, 50);
        }
    }

    public void start(){
        setLayout(new BorderLayout());
        button=new JButton();

        button.setPreferredSize(new Dimension(200,20));
        button.setText("ClickMe"); 
        button.addActionListener(this);

        add(button, BorderLayout.SOUTH);
        setSize(500,500);
        setVisible(true);
    }    


    public static void main(String args[]){
        DE x=new DE();
        x.start();
    }

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		check=true;
        repaint();
		
	}
}