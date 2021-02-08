import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.DefaultListModel;

class insert implements ActionListener
{
int w,h;
JFrame fr,fk;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,c1,c2,c3,c4,c5,c6,c7,c8;
JButton b1,b2;
String data;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,m1;


	public insert(JFrame ft,String dd)
	{
		fk=ft;
		data=dd;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("INSERT RECORD");
		fr.setLayout(null);
		fr.setBackground(Color.gray);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-750)/2,(h-550)/2,750,600);
		fr.setContentPane(new JLabel(new ImageIcon("images/v2.jpg")));
		
		Color my=new Color(255,20,94);
		Color my1=new Color(118,20,255);

		t1=new JTextField();
		t1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t1.setForeground(my1);
		t1.setBounds(420,120,150,30);
		fr.add(t1);	
		t1.setOpaque(false);
		t1.setCaretColor(Color.orange);
		t1.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l10.setText("");
			}
			
		});
		
		t2=new JTextField();
		t2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t2.setForeground(my1);
		t2.setBounds(420,170,150,30);
		fr.add(t2);	
		t2.setOpaque(false);
		t2.setCaretColor(Color.orange);
		
		t3=new JTextField();
		t3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t3.setForeground(my1);
		t3.setBounds(420,220,150,30);
		fr.add(t3);	
		t3.setOpaque(false);
		t3.setCaretColor(Color.orange);
		
		t4=new JTextField();
		t4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t4.setForeground(my1);
		t4.setBounds(420,270,150,30);
		fr.add(t4);	
		t4.setOpaque(false);
		t4.setCaretColor(Color.orange);
		
		t5=new JTextField();
		t5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t5.setForeground(my1);
		t5.setBounds(420,320,150,30);
		fr.add(t5);	
		t5.setOpaque(false);
		t5.setCaretColor(Color.orange);
		
		t6=new JTextField();
		t6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t6.setForeground(my1);
		t6.setBounds(420,370,150,30);
		fr.add(t6);	
		t6.setOpaque(false);
		t6.setCaretColor(Color.orange);

		t7=new JTextField();
		t7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t7.setForeground(my1);
		t7.setBounds(420,420,150,30);
		fr.add(t7);	
		t7.setOpaque(false);
		t7.setCaretColor(Color.orange);

		t8=new JTextField();
		t8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t8.setForeground(my1);
		t8.setBounds(420,470,150,30);
		fr.add(t8);	
		t8.setOpaque(false);
		t8.setCaretColor(Color.orange);
		
		t9=new JTextField();
		t9.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t9.setForeground(my1);
		t9.setBounds(420,70,150,30);
		fr.add(t9);	
		t9.setOpaque(false);
		t9.setCaretColor(Color.orange);
		t9.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l10.setText("");
			}
			
		});
		
		l1 = new JLabel("VALUE 1.");
		l1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l1.setForeground(Color.blue);
		l1.setBounds(250,120,100,40);
		fr.add(l1);

		l2 = new JLabel("VALUE 2.");
		l2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l2.setForeground(Color.blue);
		l2.setBounds(250,170,100,40);
		fr.add(l2);		
		
		l3 = new JLabel("VALUE 3.");
		l3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l3.setForeground(Color.blue);
		l3.setBounds(250,220,100,40);
		fr.add(l3);

		l4 = new JLabel("VALUE 4.");
		l4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l4.setForeground(Color.blue);
		l4.setBounds(250,270,120,40);
		fr.add(l4);

		l5 = new JLabel("VALUE 5.");
		l5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l5.setForeground(Color.blue);
		l5.setBounds(250,320,200,40);
		fr.add(l5);
		
		l6 = new JLabel("VALUE 6.");
		l6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l6.setForeground(Color.blue);
		l6.setBounds(250,370,100,40);
		fr.add(l6);
				
		l7 = new JLabel("VALUE 7.");
		l7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l7.setForeground(Color.blue);
		l7.setBounds(250,420,100,40);
		fr.add(l7);	

		l8 = new JLabel("VALUE 8.");
		l8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l8.setForeground(Color.blue);
		l8.setBounds(250,470,100,40);
		fr.add(l8);		

		c1 = new JTextField("");
		c1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		c1.setForeground(my1);
		c1.setBounds(30,120,160,30);
		c1.setEditable(false);
		c1.setOpaque(false);
		c1.setCaretColor(Color.orange);
		fr.add(c1);

		c2 = new JTextField("");
		c2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		c2.setForeground(my1);
		c2.setBounds(30,170,160,30);
		c2.setEditable(false);
		c2.setOpaque(false);
		c2.setCaretColor(Color.orange);
		fr.add(c2);		
		
		c3 = new JTextField("");
		c3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		c3.setForeground(my1);
		c3.setBounds(30,220,160,30);
		c3.setEditable(false);
		c3.setOpaque(false);
		c3.setCaretColor(Color.orange);
		fr.add(c3);

		c4 = new JTextField("");
		c4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		c4.setForeground(my1);
		c4.setBounds(30,270,160,30);
		c4.setEditable(false);
		c4.setOpaque(false);
		c4.setCaretColor(Color.orange);
		fr.add(c4);

		c5 = new JTextField("");
		c5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		c5.setForeground(my1);
		c5.setBounds(30,320,160,30);
		c5.setEditable(false);
		c5.setOpaque(false);
		c5.setCaretColor(Color.orange);
		fr.add(c5);
		
		c6 = new JTextField("");
		c6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		c6.setForeground(my1);
		c6.setBounds(30,370,160,30);
		c6.setEditable(false);
		c6.setOpaque(false);
		c6.setCaretColor(Color.orange);
		fr.add(c6);
				
		c7 = new JTextField("");
		c7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		c7.setForeground(my1);
		c7.setBounds(30,420,160,30);
		c7.setEditable(false);
		c7.setOpaque(false);
		c7.setCaretColor(Color.orange);
		fr.add(c7);	

		c8 = new JTextField("");
		c8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		c8.setForeground(my1);
		c8.setBounds(30,470,160,30);
		c8.setEditable(false);
		c8.setOpaque(false);
		c8.setCaretColor(Color.orange);
		fr.add(c8);
			

		m1 = new JLabel("");
		m1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		m1.setForeground(Color.magenta);
		m1.setBounds(40,70,170,40);
		fr.add(m1);			
		
		l9 = new JLabel("INSERT DATA");
		l9.setFont(new Font("cooper black",Font.BOLD|Font.ITALIC,45));
		l9.setForeground(my);
		l9.setBounds(180,6,400,50);
		fr.add(l9);		
		
		l10 = new JLabel("");
		l10.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l10.setForeground(Color.magenta);
		l10.setBounds(60,520,350,30);
		fr.add(l10);		
		
		l11 = new JLabel("TABLE NAME");
		l11.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l11.setForeground(Color.red);
		l11.setBounds(250,70,120,40);
		fr.add(l11);		
		
		
		
		
		b1= new JButton("INSERT",new ImageIcon("images/inse.png"));
		b1.setToolTipText("insert");
		b1.setFont(new Font("verdana",Font.BOLD,15));
		b1.setForeground(Color.darkGray);
		b1.setBounds(420,520,150,25);
		fr.add(b1);
		b1.addActionListener(this);	

		b2= new JButton("GO");
		b2.setToolTipText("go");
		b2.setFont(new Font("verdana",Font.BOLD,12));
		b2.setForeground(Color.darkGray);
		b2.setBounds(592,70,60,30);
		fr.add(b2);
		b2.addActionListener(this);	

		l12 = new JLabel(new ImageIcon("images/back.png"));
		l12.setBounds(700,10,32,32);
		l12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l12.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l12.setIcon(new ImageIcon("images/back2.png"));
			}
			public void mouseExited(MouseEvent me)
			{	
				l12.setIcon(new ImageIcon("images/back.png"));
			}
			public void mouseClicked(MouseEvent me)
			{
				fk.setEnabled(true);
				fr.dispose();
			}
		});
		fr.add(l12);



			fr.setVisible(true);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

		public void actionPerformed(ActionEvent ae)
		{
		if(ae.getSource()==b1)
		{	
		      if(!(c1.getText().equals("")))
		      {
			
			if((!(t1.getText().equals("")&&t9.getText().equals("")))&&(t2.getText().equals("")&&t4.getText().equals("")&&t3.getText().equals("")&&t5.getText().equals("")&&t6.getText().equals("")&&t7.getText().equals("")&&t8.getText().equals("")))
			{	
				String datas=data;
				try
					{
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("insert into "+t9.getText()+" values(?)");
					ps.setString(1,t1.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					t1.setText("");
					new msg3(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					}
			}
			else if((!(t1.getText().equals("")&&t2.getText().equals("")&&t9.getText().equals("")))&&(t4.getText().equals("")&&t3.getText().equals("")&&t5.getText().equals("")&&t6.getText().equals("")&&t7.getText().equals("")&&t8.getText().equals("")))
			{
				String datas=data;
				try
					{
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("insert into "+t9.getText()+" values(?,?)");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					t1.setText("");
					t2.setText("");
					new msg3(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					}
			}
			 else if((!(t1.getText().equals("")&&t2.getText().equals("")&&t3.getText().equals("")&&t9.getText().equals("")))&&(t4.getText().equals("")&&t5.getText().equals("")&&t6.getText().equals("")&&t7.getText().equals("")&&t8.getText().equals("")))
			{
				String datas=data;
				try
					{
					
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("insert into "+t9.getText()+" values(?,?,? )");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					new msg3(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					}			
			}
			else if((!(t1.getText().equals("")&&t2.getText().equals("")&&t3.getText().equals("")&&t9.getText().equals("")&&t4.getText().equals("")))&&(t5.getText().equals("")&&t6.getText().equals("")&&t7.getText().equals("")&&t8.getText().equals("")))
			{
				String datas=data;
				try
					{
					
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("insert into "+t9.getText()+" values(?,?,?,?)");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					new msg3(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					}		
				}
			else if((!(t1.getText().equals("")&&t2.getText().equals("")&&t3.getText().equals("")&&t9.getText().equals("")&&t4.getText().equals("")&&t5.getText().equals("")))&&(t6.getText().equals("")&&t7.getText().equals("")&&t8.getText().equals("")))
			{
				String datas=data;
				try
					{
					
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("insert into "+t9.getText()+" values(?,?,?,?,?)");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,t5.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					new msg3(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					}				
			}
			
			else if((!(t1.getText().equals("")&&t2.getText().equals("")&&t3.getText().equals("")&&t9.getText().equals("")&&t4.getText().equals("")&&t5.getText().equals("")&&t6.getText().equals("")))&&(t7.getText().equals("")&&t8.getText().equals("")))
			{
				String datas=data;
				try
					{
					
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("insert into "+t9.getText()+" values(?,?,?,?,?,?)");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,t5.getText());
					ps.setString(6,t6.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					new msg3(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					}	
			}			

			else if((!(t1.getText().equals("")&&t2.getText().equals("")&&t3.getText().equals("")&&t9.getText().equals("")&&t4.getText().equals("")&&t5.getText().equals("")&&t6.getText().equals("")&&t7.getText().equals("")))&&(t8.getText().equals("")))
			{
				String datas=data;
				try
					{
					
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("insert into "+t9.getText()+" values(?,?,?,?,?,?,?)");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,t5.getText());
					ps.setString(6,t6.getText());
					ps.setString(7,t7.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					new msg3(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					}	
			}			

			else if(!(t1.getText().equals("")&&t2.getText().equals("")&&t3.getText().equals("")&&t9.getText().equals("")&&t4.getText().equals("")&&t5.getText().equals("")&&t6.getText().equals("")&&t7.getText().equals("")&&t8.getText().equals("")))
			{
				String datas=data;
				try
					{
					
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("insert into "+t9.getText()+" values(?,?,?,?,?,?,?,?)");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,t5.getText());
					ps.setString(6,t6.getText());
					ps.setString(7,t7.getText());
					ps.setString(8,t8.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					t8.setText("");
					new msg3(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					}				

			}
			else 
			{
				l10.setText("Enter the table name & fileds values...");
			}	
		   }
			else
			{
				l10.setText("Click on GO before clicking on INSERT ....");
			}
		}
		if(ae.getSource()==b2)
		{
			if(!(t9.getText().equals("")))
			{
			String datas=data;
			String a[]=new String[10];
				try
					{
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("select * from "+t9.getText()+"");
					ResultSet rs=ps.executeQuery();
					ResultSetMetaData rsmd =rs.getMetaData();
					int columns = rsmd.getColumnCount();
					for (int i = 1; i <= columns; i++)
					{
						a[i]=rsmd.getColumnName(i);	
					}
						
					c1.setText(a[1]);
					c2.setText(a[2]);
					c3.setText(a[3]);
					c4.setText(a[4]);
					c5.setText(a[5]);
					c6.setText(a[6]);
					c7.setText(a[7]);
					c8.setText(a[8]);
					m1.setText("Column Name");
					con.close();
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Error! no such table exists...");
					
					}	
			}
			else
			{
				l10.setText("Enter table name...");

			}
			
		
		}
}	

		public static void main(String args[])
		{
		new insert(new JFrame(),"3tier");
		}
}
		
		
		