import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Graphics;

class database  implements MouseListener,ActionListener
{
int w,h;
JFrame fr;
JButton b1,b2,b3,b4;
JTextField t1,t2,t3;
JLabel l1,l2,l3,l4,l5,l11;
String data;

	public  database()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("DATABASE");
		fr.setLayout(null);
		fr.setBackground(Color.black);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-700)/2,(h-600)/2,800,590);	
		fr.setContentPane(new JLabel(new ImageIcon("images/d6.jpg")));
		
		b1= new JButton("CREATE DATABASE",new ImageIcon("images/crt.png"));
		b1.setToolTipText("create database");
		b1.setFont(new Font("verdana",Font.BOLD,15));
		b1.setForeground(Color.darkGray);
		b1.setBounds(60,120,240,40);
		fr.add(b1);
		b1.addActionListener(this);

		b2= new JButton("DROP DATABASE",new ImageIcon("images/drop.png"));
		b2.setToolTipText("drop database");
		b2.setFont(new Font("verdana",Font.BOLD,15));
		b2.setForeground(Color.darkGray);
		b2.setBounds(60,230,240,40);
		fr.add(b2);
		b2.addActionListener(this);
		
		b3= new JButton("USE DATABASE",new ImageIcon("images/us.png"));
		b3.setToolTipText("use database");
		b3.setFont(new Font("verdana",Font.BOLD,15));
		b3.setForeground(Color.darkGray);
		b3.setBounds(60,350,240,40);
		fr.add(b3);
		b3.addActionListener(this);	
		
		b4= new JButton("SHOW DATABASE",new ImageIcon("images/show.png"));
		b4.setToolTipText("show database");
		b4.setFont(new Font("verdana",Font.BOLD,15));
		b4.setForeground(Color.darkGray);
		b4.setBounds(60,465,240,40);
		fr.add(b4);
		b4.addActionListener(this);
		
		//int R = (int) (Math.random( )*157);
		//int G = (int)(Math.random( )*0);
		//int B= (int)(Math.random( )*255);
		Color my = new Color(255,0, 110);

		t1=new JTextField();
		t1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));		
		t1.setForeground(my);
		t1.setBounds(420,120,220,40);
		fr.add(t1);	
		t1.addMouseListener(this);
		t1.setOpaque(false);
		t1.setCaretColor(Color.orange);
		
				
		t2=new JTextField();
		t2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));		
		t2.setForeground(my);
		t2.setBounds(420,230,220,40);
		fr.add(t2);	
		t2.addMouseListener(this);
		t2.setOpaque(false);
		t2.setCaretColor(Color.orange);

		t3=new JTextField();
		t3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));		
		t3.setForeground(my);
		t3.setBounds(420,350,220,40);
		fr.add(t3);	
		t3.addMouseListener(this);
		t3.setOpaque(false);
		t3.setCaretColor(Color.orange);
		
		l1 = new JLabel("MY SQL");
		l1.setFont(new Font("cooper black",Font.BOLD|Font.ITALIC,55));
		l1.setForeground(my);
		l1.setBounds(230,30,380,80);
		fr.add(l1);

		l2 = new JLabel("");
		l2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l2.setForeground(Color.orange);
		l2.setBounds(410,460,380,40);
		fr.add(l2);		
		
		l3 = new JLabel("ENTER DATABASE NAME ");
		l3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l3.setForeground(Color.red);
		l3.setBounds(420,146,200,40);
		fr.add(l3);

		l4 = new JLabel("ENTER DATABASE NAME ");
		l4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l4.setForeground(Color.red);
		l4.setBounds(420,257,200,40);
		fr.add(l4);

		l5 = new JLabel("ENTER DATABASE NAME ");
		l5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l5.setForeground(Color.red);
		l5.setBounds(420,380,200,40);
		fr.add(l5);
		
		l11 = new JLabel(new ImageIcon("images/exit.png"));
		l11.setBounds(765,0,32,32);
		l11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l11.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l11.setIcon(new ImageIcon("images/exit2.png"));
			}
			public void mouseExited(MouseEvent me)
			{	
				l11.setIcon(new ImageIcon("images/exit.png"));
			}
			public void mouseClicked(MouseEvent me)
			{
				fr.dispose();
			}
		});
		fr.add(l11);



		
		fr.setUndecorated(true);		
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent ae)
		{
		if(ae.getSource()==b1)
		{	
			if(!(t1.getText().equals("")))
			{
				try
					{
					String db=t1.getText();
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("create database "+db+" ");
					ps.executeUpdate();	
					l2.setText("database successfully created..");	
					t1.setText("");	
					t2.setText("");	
					con.close();
					}
					catch(Exception e)
					{
					l2.setText("Error! database already exist..");
					System.out.print(e);
					}
			}

		
			else
			{
				l2.setText("Error! enter database name");
			}	
			
		}
		else if(ae.getSource()==b2)
		{	
		        if(!(t2.getText().equals("")))
		       {
			try
			{
			String db=t2.getText();
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("drop database "+db+" ");
			ps.executeUpdate();	
			l2.setText("database dropped successfully ..");			
			t1.setText("");	
			t2.setText("");
			con.close();		
			}
			catch(Exception e)
			{
				l2.setText("Error! No such database exist..");
			}
			
			}
			else
			{
				l2.setText("Error! enter database name");
			}
			
		}
		else if(ae.getSource()==b3)
		{	

			if(!(t3.getText().equals("")))
			{			
				data =t3.getText();
				try 
				{
				Connection con = dao.createconnection();
				PreparedStatement ps = con.prepareStatement("show databases");
				ResultSet rs=ps.executeQuery();	
				ResultSetMetaData md = rs.getMetaData();
				while (rs.next())	
				 {
					if(rs.getObject(1).equals(t3.getText()))
					{	
						fr.setEnabled(false);
						t3.setText("");
						new usedb1(fr,data);
						rs.close();
					}

				 }	
				l2.setText("Error! no such database exists...");					
				con.close();
				}
				catch(Exception e)
				{
				System.out.print(e);
				}

			}
			else
			{
				l2.setText("Enter database name...");
			}
			
		}
		else if(ae.getSource()==b4)
		{	
			
			fr.dispose();
			new showdb(fr);
			
		}
		
		else
		{
		}	
}
		

public void mouseEntered(MouseEvent me)
{
	if(me.getSource()==t1)
	{
		t2.setText("");
		t3.setText("");
		l2.setText("");
	}
	if(me.getSource()==t2)
	{
		t1.setText("");
		t3.setText("");
		l2.setText("");
	}
	if(me.getSource()==t3)
	{
		t1.setText("");
		t2.setText("");
		l2.setText("");
	}
	
}
public void mouseExited(MouseEvent me)
{
}
public void mouseClicked(MouseEvent me)
{
}
public void mousePressed(MouseEvent me)
{
}
public void mouseReleased(MouseEvent me)
{
}

		
		public static void main(String args[])
		{		
			new database();
		}
}
		
		
		