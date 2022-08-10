package hw2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class hw2 extends Canvas {

	static String file_path;
	static JFrame f;
	static JLabel a1, a2;
	static JTextField b1, b2;
	static JButton btn, btn2;
	static Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	static JComboBox cb = new JComboBox(arr);
	static Random rastgele = new Random();
	static hw2 h = new hw2();
	static String thisLine;
	static String coor[] = new String[2000];
	static String temp[] = null;
	static Color myColor1 = new Color(123, 111, 222);
	static Color myColor2 = new Color(87, 42, 0);
	static Color colors[] = { Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.YELLOW, Color.BLACK,
			Color.ORANGE, Color.PINK, myColor1, myColor2 };

	// 1280 x 720
	public static void main(String[] args) {
		f = new JFrame("K-Means Clustering");
		cb.setBounds(450, 640, 50, 30);
		a1 = new JLabel("Iterasyon:");
		a1.setBounds(150, 640, 100, 30);
		a2 = new JLabel("K sayýsý:(Center)");
		a2.setBounds(340, 640, 100, 30);
		b1 = new JTextField();
		b1.setBounds(210, 642, 100, 30);
		btn = new JButton();
		btn2 = new JButton();
		btn.setText("K-Means Clustering");
		btn.setBounds(760, 640, 150, 30);
		btn2.setText("Dosyadan seç");
		btn2.setBounds(600, 640, 150, 30);
		f.add(cb);
		f.add(a1);
		f.add(b1);
		f.add(a2);
		f.add(btn);
		f.add(btn2);
		f.setSize(1280, 720);
		f.setLayout(new BorderLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(h);
		
		Color backg = f.getBackground();

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				if (evt.getSource() == btn2) {
					JFileChooser file_upload = new JFileChooser();

					file_upload.setCurrentDirectory(new File("D:\\barbara\\cvs"));

					int res_2 = file_upload.showSaveDialog(null);
					int err =0;
					if (res_2 == JFileChooser.APPROVE_OPTION) {
						file_path = file_upload.getSelectedFile().getAbsolutePath().toString();
						File file = new File(file_path);
						String fileType = "unknown";
						try {
							fileType = Files.probeContentType(file.toPath());
						} catch (IOException e) {
							e.printStackTrace();
						}

						boolean hata = (!fileType.equals("application/vnd.ms-excel") || fileType == null);
						
						if (hata) {
							JFrame error = new JFrame("Hata!");
							JLabel text = new JLabel("HATA!");
							JLabel text2 = new JLabel(".csv dýþýnda bir dosya yüklediniz!");
							text.setBounds(120, 20, 200, 200);
							text2.setBounds(80, 70, 500, 200);
							text.setFont(new Font(null, Font.PLAIN, 60));
							text2.setFont(new Font(null, Font.PLAIN, 20));
							error.add(text);
							error.add(text2);
							error.setSize(500, 300);
							error.setLayout(new BorderLayout());
							error.setVisible(true);
							err++;
						}
						if(!hata)
						err=0;

					}
					
					if(err==0) {
					int count = 0;
					String fName = file_path;
					FileInputStream fis = null;
					try {
						fis = new FileInputStream(fName);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					DataInputStream myInput = new DataInputStream(fis);

					try {
						while ((thisLine = myInput.readLine()) != null && count < 2001) {
							temp = thisLine.split(",");
							coor[count] = temp[0];
							coor[count + 1] = temp[1];
							count += 2;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					}
				}
			}
		});

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				HashMap<Integer, Color> hash = new HashMap<Integer, Color>();
				HashMap<Integer, Integer> hash2 = new HashMap<Integer, Integer>();
				ArrayList<Integer> dst = new ArrayList<Integer>();
				int x0toplam=0;
				int y0toplam=0;
				int x1toplam=0;
				int y1toplam=0;
				int x2toplam=0;
				int y2toplam=0;
				int x3toplam=0;
				int y3toplam=0;
				int x4toplam=0;
				int y4toplam=0;
				int x5toplam=0;
				int y5toplam=0;
				int x6toplam=0;
				int y6toplam=0;
				int x7toplam=0;
				int y7toplam=0;
				int x8toplam=0;
				int y8toplam=0;
				int x9toplam=0;
				int y9toplam=0;	
				int say0=0;
				int say1=0;
				int say2=0;
				int say3=0;
				int say4=0;
				int say5=0;
				int say6=0;
				int say7=0;
				int say8=0;
				int say9=0;
				int[][] arr2 = new int[10][2];
				
				if (e.getSource() == btn) {
					int it = Integer.parseInt(b1.getText());
					int k = (int) cb.getSelectedItem();
					Graphics g = h.getGraphics();
					int[][] arr = new int[it][2];
					
					g.setColor(backg);
					g.fillRect(0, 0, 1280, 720);
					
					
					
					for (int i = 0; i < k; i++) {
						hash.put(i, colors[i]);
						arr[i][0] = rastgele.nextInt(1280);
						arr[i][1] = rastgele.nextInt(720);
						g.setColor(Color.CYAN);
						g.fillOval(arr[i][0], arr[i][1], 15, 15);
					}
					
					
					for (int i = 0; i < it * 2; i += 2) {
						int x = Integer.parseInt(coor[i]);
						int y = Integer.parseInt(coor[i + 1]);
						for (int c = 0; c < k; c++) {
							int uzaklik = distance(x, y, arr[c][0], arr[c][1]);
							dst.add(uzaklik);
							hash2.put(uzaklik, c);
						}
						int u = Collections.min(dst);
						int o = hash2.get(u);
						g.setColor(hash.get(o));
						g.fillOval(x, y, 10, 10);
						
						switch(o) {
						case 0:
							x0toplam =+ x;
							y0toplam =+ y;
							say0++;
						case 1:
							x1toplam =+ x;
							y1toplam =+ y;
							say1++;
						case 2:
							x2toplam =+ x;
							y2toplam =+ y;
							say2++;
						case 3:
							x3toplam =+ x;
							y3toplam =+ y;
							say3++;
						case 4:
							x4toplam =+ x;
							y4toplam =+ y;
							say4++;
						case 5:
							x5toplam =+ x;
							y5toplam =+ y;
							say5++;
						case 6:
							x6toplam =+ x;
							y6toplam =+ y;
							say6++;
						case 7:
							x7toplam =+ x;
							y7toplam =+ y;
							say7++;
						case 8:
							x8toplam =+ x;
							y8toplam =+ y;
							say8++;
						case 9:
							x9toplam =+ x;
							y9toplam =+ y;
							say9++;
						}
						dst.clear();
					}
					
				
					int x0sum = x0toplam/say0;
					int x1sum = x1toplam/say1;
					int x2sum = x2toplam/say2;
					int x3sum = x3toplam/say3;
					int x4sum = x4toplam/say4;
					int x5sum = x5toplam/say5;
					int x6sum = x6toplam/say6;
					int x7sum = x7toplam/say7;
					int x8sum = x8toplam/say8;
					int x9sum = x9toplam/say9;
					int y0sum = y0toplam/say0;
					int y1sum = y1toplam/say1;
					int y2sum = y2toplam/say2;
					int y3sum = y3toplam/say3;
					int y4sum = y4toplam/say4;
					int y5sum = y5toplam/say5;
					int y6sum = y6toplam/say6;
					int y7sum = y7toplam/say7;
					int y8sum = y8toplam/say8;
					int y9sum = y9toplam/say9;
					
					arr2[0][0]=x0sum;
					arr2[0][1]=y0sum;
					arr2[1][0]=x1sum;
					arr2[1][1]=y1sum;
					arr2[2][0]=x2sum;
					arr2[2][1]=y2sum;
					arr2[3][0]=x3sum;
					arr2[3][1]=y3sum;
					arr2[4][0]=x4sum;
					arr2[4][1]=y4sum;
					arr2[5][0]=x5sum;
					arr2[5][1]=y5sum;
					arr2[6][0]=x6sum;
					arr2[6][1]=y6sum;
					arr2[7][0]=x7sum;
					arr2[7][1]=y7sum;
					arr2[8][0]=x8sum;
					arr2[8][1]=y8sum;
					arr2[9][0]=x9sum;
					arr2[9][1]=y9sum;
					
					g.setColor(backg);
					g.fillRect(0, 0, 1280, 720);
					for (int i = 0; i < k; i++) {
						g.setColor(Color.CYAN);
						g.fillOval(arr2[i][0], arr2[i][1], 15, 15);
					}
					for (int i = 0; i < it * 2; i += 2) {
						int x = Integer.parseInt(coor[i]);
						int y = Integer.parseInt(coor[i + 1]);
						for (int c = 0; c < k; c++) {
							int uzaklik = distance(x, y, arr[c][0], arr[c][1]);
							dst.add(uzaklik);
							hash2.put(uzaklik, c);
						}
						int u = Collections.min(dst);
						int o = hash2.get(u);
						g.setColor(hash.get(o));
						g.fillOval(x, y, 10, 10);
						
						x0toplam = 0;
						y0toplam = 0;
						x1toplam = 0;
						y1toplam = 0;
						x2toplam = 0;
						y2toplam = 0;
						x3toplam = 0;
						y3toplam = 0;
						x4toplam = 0;
						y4toplam = 0;
						x5toplam = 0;
						y5toplam = 0;
						x6toplam = 0;
						y6toplam = 0;
						x7toplam = 0;
						y7toplam = 0;
						x8toplam = 0;
						y8toplam = 0;
						x9toplam = 0;
						y9toplam = 0;
						say0=0;
						say1=0;
						say2=0;
						say3=0;
						say4=0;
						say5=0;
						say6=0;
						say7=0;
						say8=0;
						say9=0;
						switch(o) {
						case 0:
							x0toplam =+ x;
							y0toplam =+ y;
							say0++;
						case 1:
							x1toplam =+ x;
							y1toplam =+ y;
							say1++;
						case 2:
							x2toplam =+ x;
							y2toplam =+ y;
							say2++;
						case 3:
							x3toplam =+ x;
							y3toplam =+ y;
							say3++;
						case 4:
							x4toplam =+ x;
							y4toplam =+ y;
							say4++;
						case 5:
							x5toplam =+ x;
							y5toplam =+ y;
							say5++;
						case 6:
							x6toplam =+ x;
							y6toplam =+ y;
							say6++;
						case 7:
							x7toplam =+ x;
							y7toplam =+ y;
							say7++;
						case 8:
							x8toplam =+ x;
							y8toplam =+ y;
							say8++;
						case 9:
							x9toplam =+ x;
							y9toplam =+ y;
							say9++;
						}
						dst.clear();
					}
					/*
					 x0sum = x0toplam/say0;
					 x1sum = x1toplam/say1;
					 x2sum = x2toplam/say2;
					 x3sum = x3toplam/say3;
					 x4sum = x4toplam/say4;
					 x5sum = x5toplam/say5;
					 x6sum = x6toplam/say6;
					 x7sum = x7toplam/say7;
					 x8sum = x8toplam/say8;
					 x9sum = x9toplam/say9;
					 y0sum = y0toplam/say0;
					 y1sum = y1toplam/say1;
					 y2sum = y2toplam/say2;
					 y3sum = y3toplam/say3;
					 y4sum = y4toplam/say4;
					 y5sum = y5toplam/say5;
					 y6sum = y6toplam/say6;
					 y7sum = y7toplam/say7;
					 y8sum = y8toplam/say8;
					 y9sum = y9toplam/say9;
					
					arr2[0][0]=x0sum;
					arr2[0][1]=y0sum;
					arr2[1][0]=x1sum;
					arr2[1][1]=y1sum;
					arr2[2][0]=x2sum;
					arr2[2][1]=y2sum;
					arr2[3][0]=x3sum;
					arr2[3][1]=y3sum;
					arr2[4][0]=x4sum;
					arr2[4][1]=y4sum;
					arr2[5][0]=x5sum;
					arr2[5][1]=y5sum;
					arr2[6][0]=x6sum;
					arr2[6][1]=y6sum;
					arr2[7][0]=x7sum;
					arr2[7][1]=y7sum;
					arr2[8][0]=x8sum;
					arr2[8][1]=y8sum;
					arr2[9][0]=x9sum;
					arr2[9][1]=y9sum;
					g.setColor(backg);
					g.fillRect(0, 0, 1280, 720);
					for (int i = 0; i < k; i++) {
						g.setColor(Color.CYAN);
						g.fillOval(arr2[i][0], arr2[i][1], 15, 15);
					}
					for (int i = 0; i < it * 2; i += 2) {
						int x = Integer.parseInt(coor[i]);
						int y = Integer.parseInt(coor[i + 1]);
						for (int c = 0; c < k; c++) {
							int uzaklik = distance(x, y, arr[c][0], arr[c][1]);
							dst.add(uzaklik);
							hash2.put(uzaklik, c);
						}
						int u = Collections.min(dst);
						int o = hash2.get(u);
						g.setColor(hash.get(o));
						g.fillOval(x, y, 10, 10);
						x0toplam = 0;
						y0toplam = 0;
						x1toplam = 0;
						y1toplam = 0;
						x2toplam = 0;
						y2toplam = 0;
						x3toplam = 0;
						y3toplam = 0;
						x4toplam = 0;
						y4toplam = 0;
						x5toplam = 0;
						y5toplam = 0;
						x6toplam = 0;
						y6toplam = 0;
						x7toplam = 0;
						y7toplam = 0;
						x8toplam = 0;
						y8toplam = 0;
						x9toplam = 0;
						y9toplam = 0;
						say0=0;
						say1=0;
						say2=0;
						say3=0;
						say4=0;
						say5=0;
						say6=0;
						say7=0;
						say8=0;
						say9=0;
						switch(o) {
						case 0:
							x0toplam =+ x;
							y0toplam =+ y;
							say0++;
						case 1:
							x1toplam =+ x;
							y1toplam =+ y;
							say1++;
						case 2:
							x2toplam =+ x;
							y2toplam =+ y;
							say2++;
						case 3:
							x3toplam =+ x;
							y3toplam =+ y;
							say3++;
						case 4:
							x4toplam =+ x;
							y4toplam =+ y;
							say4++;
						case 5:
							x5toplam =+ x;
							y5toplam =+ y;
							say5++;
						case 6:
							x6toplam =+ x;
							y6toplam =+ y;
							say6++;
						case 7:
							x7toplam =+ x;
							y7toplam =+ y;
							say7++;
						case 8:
							x8toplam =+ x;
							y8toplam =+ y;
							say8++;
						case 9:
							x9toplam =+ x;
							y9toplam =+ y;
							say9++;
						}
						dst.clear();
					}
					x0sum = x0toplam/say0;
					 x1sum = x1toplam/say1;
					 x2sum = x2toplam/say2;
					 x3sum = x3toplam/say3;
					 x4sum = x4toplam/say4;
					 x5sum = x5toplam/say5;
					 x6sum = x6toplam/say6;
					 x7sum = x7toplam/say7;
					 x8sum = x8toplam/say8;
					 x9sum = x9toplam/say9;
					 y0sum = y0toplam/say0;
					 y1sum = y1toplam/say1;
					 y2sum = y2toplam/say2;
					 y3sum = y3toplam/say3;
					 y4sum = y4toplam/say4;
					 y5sum = y5toplam/say5;
					 y6sum = y6toplam/say6;
					 y7sum = y7toplam/say7;
					 y8sum = y8toplam/say8;
					 y9sum = y9toplam/say9;
					
					arr2[0][0]=x0sum;
					arr2[0][1]=y0sum;
					arr2[1][0]=x1sum;
					arr2[1][1]=y1sum;
					arr2[2][0]=x2sum;
					arr2[2][1]=y2sum;
					arr2[3][0]=x3sum;
					arr2[3][1]=y3sum;
					arr2[4][0]=x4sum;
					arr2[4][1]=y4sum;
					arr2[5][0]=x5sum;
					arr2[5][1]=y5sum;
					arr2[6][0]=x6sum;
					arr2[6][1]=y6sum;
					arr2[7][0]=x7sum;
					arr2[7][1]=y7sum;
					arr2[8][0]=x8sum;
					arr2[8][1]=y8sum;
					arr2[9][0]=x9sum;
					arr2[9][1]=y9sum;
					g.setColor(backg);
					g.fillRect(0, 0, 1280, 720);
					for (int i = 0; i < k; i++) {
						g.setColor(Color.CYAN);
						g.fillOval(arr2[i][0], arr2[i][1], 15, 15);
					}
					for (int i = 0; i < it * 2; i += 2) {
						int x = Integer.parseInt(coor[i]);
						int y = Integer.parseInt(coor[i + 1]);
						for (int c = 0; c < k; c++) {
							int uzaklik = distance(x, y, arr[c][0], arr[c][1]);
							dst.add(uzaklik);
							hash2.put(uzaklik, c);
						}
						int u = Collections.min(dst);
						int o = hash2.get(u);
						g.setColor(hash.get(o));
						g.fillOval(x, y, 10, 10);
						x0toplam = 0;
						y0toplam = 0;
						x1toplam = 0;
						y1toplam = 0;
						x2toplam = 0;
						y2toplam = 0;
						x3toplam = 0;
						y3toplam = 0;
						x4toplam = 0;
						y4toplam = 0;
						x5toplam = 0;
						y5toplam = 0;
						x6toplam = 0;
						y6toplam = 0;
						x7toplam = 0;
						y7toplam = 0;
						x8toplam = 0;
						y8toplam = 0;
						x9toplam = 0;
						y9toplam = 0;
						say0=0;
						say1=0;
						say2=0;
						say3=0;
						say4=0;
						say5=0;
						say6=0;
						say7=0;
						say8=0;
						say9=0;
						switch(o) {
						case 0:
							x0toplam =+ x;
							y0toplam =+ y;
							say0++;
						case 1:
							x1toplam =+ x;
							y1toplam =+ y;
							say1++;
						case 2:
							x2toplam =+ x;
							y2toplam =+ y;
							say2++;
						case 3:
							x3toplam =+ x;
							y3toplam =+ y;
							say3++;
						case 4:
							x4toplam =+ x;
							y4toplam =+ y;
							say4++;
						case 5:
							x5toplam =+ x;
							y5toplam =+ y;
							say5++;
						case 6:
							x6toplam =+ x;
							y6toplam =+ y;
							say6++;
						case 7:
							x7toplam =+ x;
							y7toplam =+ y;
							say7++;
						case 8:
							x8toplam =+ x;
							y8toplam =+ y;
							say8++;
						case 9:
							x9toplam =+ x;
							y9toplam =+ y;
							say9++;
						}
						dst.clear();
					}
					x0sum = x0toplam/say0;
					 x1sum = x1toplam/say1;
					 x2sum = x2toplam/say2;
					 x3sum = x3toplam/say3;
					 x4sum = x4toplam/say4;
					 x5sum = x5toplam/say5;
					 x6sum = x6toplam/say6;
					 x7sum = x7toplam/say7;
					 x8sum = x8toplam/say8;
					 x9sum = x9toplam/say9;
					 y0sum = y0toplam/say0;
					 y1sum = y1toplam/say1;
					 y2sum = y2toplam/say2;
					 y3sum = y3toplam/say3;
					 y4sum = y4toplam/say4;
					 y5sum = y5toplam/say5;
					 y6sum = y6toplam/say6;
					 y7sum = y7toplam/say7;
					 y8sum = y8toplam/say8;
					 y9sum = y9toplam/say9;
					
					arr2[0][0]=x0sum;
					arr2[0][1]=y0sum;
					arr2[1][0]=x1sum;
					arr2[1][1]=y1sum;
					arr2[2][0]=x2sum;
					arr2[2][1]=y2sum;
					arr2[3][0]=x3sum;
					arr2[3][1]=y3sum;
					arr2[4][0]=x4sum;
					arr2[4][1]=y4sum;
					arr2[5][0]=x5sum;
					arr2[5][1]=y5sum;
					arr2[6][0]=x6sum;
					arr2[6][1]=y6sum;
					arr2[7][0]=x7sum;
					arr2[7][1]=y7sum;
					arr2[8][0]=x8sum;
					arr2[8][1]=y8sum;
					arr2[9][0]=x9sum;
					arr2[9][1]=y9sum;
					g.setColor(backg);
					g.fillRect(0, 0, 1280, 720);
					for (int i = 0; i < k; i++) {
						g.setColor(Color.CYAN);
						g.fillOval(arr2[i][0], arr2[i][1], 15, 15);
					}
					for (int i = 0; i < it * 2; i += 2) {
						int x = Integer.parseInt(coor[i]);
						int y = Integer.parseInt(coor[i + 1]);
						for (int c = 0; c < k; c++) {
							int uzaklik = distance(x, y, arr[c][0], arr[c][1]);
							dst.add(uzaklik);
							hash2.put(uzaklik, c);
						}
						int u = Collections.min(dst);
						int o = hash2.get(u);
						g.setColor(hash.get(o));
						g.fillOval(x, y, 10, 10);
						x0toplam = 0;
						y0toplam = 0;
						x1toplam = 0;
						y1toplam = 0;
						x2toplam = 0;
						y2toplam = 0;
						x3toplam = 0;
						y3toplam = 0;
						x4toplam = 0;
						y4toplam = 0;
						x5toplam = 0;
						y5toplam = 0;
						x6toplam = 0;
						y6toplam = 0;
						x7toplam = 0;
						y7toplam = 0;
						x8toplam = 0;
						y8toplam = 0;
						x9toplam = 0;
						y9toplam = 0;
						say0=0;
						say1=0;
						say2=0;
						say3=0;
						say4=0;
						say5=0;
						say6=0;
						say7=0;
						say8=0;
						say9=0;
						switch(o) {
						case 0:
							x0toplam =+ x;
							y0toplam =+ y;
							say0++;
						case 1:
							x1toplam =+ x;
							y1toplam =+ y;
							say1++;
						case 2:
							x2toplam =+ x;
							y2toplam =+ y;
							say2++;
						case 3:
							x3toplam =+ x;
							y3toplam =+ y;
							say3++;
						case 4:
							x4toplam =+ x;
							y4toplam =+ y;
							say4++;
						case 5:
							x5toplam =+ x;
							y5toplam =+ y;
							say5++;
						case 6:
							x6toplam =+ x;
							y6toplam =+ y;
							say6++;
						case 7:
							x7toplam =+ x;
							y7toplam =+ y;
							say7++;
						case 8:
							x8toplam =+ x;
							y8toplam =+ y;
							say8++;
						case 9:
							x9toplam =+ x;
							y9toplam =+ y;
							say9++;
						}
						dst.clear();
					}*/
				}
				
			}

		});

	}

	public static int distance(int x1, int y1, int x2, int y2) {
		return (int) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}

}
