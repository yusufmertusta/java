package hw2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Canvas;
import java.awt.Panel;

public class hmww extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hmww frame = new hmww();
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
	public hmww() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(362, 342, 85, 21);
		getContentPane().add(btnNewButton);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(56, 89, 590, 309);
		getContentPane().add(canvas);
		
		Panel panel = new Panel();
		panel.setBounds(73, 273, 236, 90);
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		setTitle(" K-Means Clustering");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Dosyadan se\u00E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				@Override
				public void actionPerformed(ActionEvent evt) {
				    if(evt.getSource()==btn2) {
				        JFileChooser file_upload = new JFileChooser();
				        //file_upload.showOpenDialog(null);
				        //int res = file_upload.showOpenDialog(null);
				        int res_2 = file_upload.showSaveDialog(null);
				                  
				        if(res_2 == JFileChooser.APPROVE_OPTION) {
				            File file_path = new File(file_upload.getSelectedFile(). getAbsolutePath());
				    }
			}
		});
		btnNewButton.setBounds(377, 397, 145, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" K-Means Clustering");
		btnNewButton_1.setBounds(537, 397, 168, 21);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(173, 398, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setMaximumRowCount(10);
		comboBox.setBounds(294, 394, 73, 27);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Iterasyon");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(90, 394, 73, 27);
		contentPane.add(lblNewLabel);
	}
}

