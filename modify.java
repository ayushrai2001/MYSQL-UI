import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.DefaultListModel;

class modify implements ActionListener
{
int w,h;
JFrame fr,fk;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,c1,c2,c3,c4,c5,c6,c7,c8,m1,m2;
JButton b1,b2;
String data;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,v1,v2,v3,v4,v5,v6,v7,v8,k1,k2;

	public modify(JFrame ft,String dd)
	{
		fk=ft;
		data=dd;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("MODIFY RECORD");
		fr.setLayout(null);
		fr.setBackground(Color.gray);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-750)/2,(h-550)/2,775,600);
		fr.setContentPane(new JLabel(new ImageIcon("images/mod3.jpg")));

		Color my1=new Color(118,20,255);
		Color my=new Color(147,0,0);		

		t1=new JTextField();
		t1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t1.setForeground(my1);
		t1.setBounds(500,120,150,30);
		fr.add(t1);	
		t1.setOpaque(false);
		t1.setCaretColor(my1);
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
		t2.setBounds(500,170,150,30);
		fr.add(t2);	
		t2.setOpaque(false);
		t2.setCaretColor(Color.orange);
		
		t3=new JTextField();
		t3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t3.setForeground(my1);
		t3.setBounds(500,220,150,30);
		fr.add(t3);	
		t3.setOpaque(false);
		t3.setCaretColor(Color.orange);
		
		t4=new JTextField();
		t4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t4.setForeground(my1);
		t4.setBounds(500,270,150,30);
		fr.add(t4);	
		t4.setOpaque(false);
		t4.setCaretColor(Color.orange);
		
		t5=new JTextField();
		t5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t5.setForeground(my1);
		t5.setBounds(500,320,150,30);
		fr.add(t5);	
		t5.setOpaque(false);
		t5.setCaretColor(Color.orange);
		
		t6=new JTextField();
		t6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t6.setForeground(my1);
		t6.setBounds(500,370,150,30);
		fr.add(t6);	
		t6.setOpaque(false);
		t6.setCaretColor(Color.orange);

		t7=new JTextField();
		t7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t7.setForeground(my1);
		t7.setBounds(500,420,150,30);
		fr.add(t7);	
		t7.setOpaque(false);
		t7.setCaretColor(Color.orange);

		t8=new JTextField();
		t8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t8.setForeground(my1);
		t8.setBounds(500,470,150,30);
		fr.add(t8);	
		t8.setOpaque(false);
		t8.setCaretColor(Color.orange);
		
		t9=new JTextField();
		t9.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t9.setForeground(my1);
		t9.setBounds(500,70,150,30);
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

		c1=new JTextField();
		c1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		c1.setForeground(my1);
		c1.setBounds(140,120,150,30);
		fr.add(c1);	
		c1.setOpaque(false);
		c1.setCaretColor(Color.orange);
		c1.setEditable(false);
		
		c2=new JTextField();
		c2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		c2.setForeground(my1);
		c2.setBounds(140,170,150,30);
		fr.add(c2);	
		c2.setOpaque(false);
		c2.setCaretColor(Color.orange);
		c2.setEditable(false);
		
		c3=new JTextField();
		c3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		c3.setForeground(my1);
		c3.setBounds(140,220,150,30);
		fr.add(c3);	
		c3.setOpaque(false);
		c3.setCaretColor(Color.orange);
		c3.setEditable(false);	
	
		c4=new JTextField();
		c4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		c4.setForeground(my1);
		c4.setBounds(140,270,150,30);
		fr.add(c4);	
		c4.setOpaque(false);
		c4.setCaretColor(Color.orange);
		c4.setEditable(false);

		c5=new JTextField();
		c5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		c5.setForeground(my1);
		c5.setBounds(140,320,150,30);
		fr.add(c5);	
		c5.setOpaque(false);
		c5.setCaretColor(Color.orange);
		c5.setEditable(false);
		
		c6=new JTextField();
		c6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		c6.setForeground(my1);
		c6.setBounds(140,370,150,30);
		fr.add(c6);	
		c6.setOpaque(false);
		c6.setCaretColor(Color.orange);
		c6.setEditable(false);

		c7=new JTextField();
		c7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		c7.setForeground(my1);
		c7.setBounds(140,420,150,30);
		fr.add(c7);	
		c7.setOpaque(false);
		c7.setCaretColor(Color.orange);
		c7.setEditable(false);
		
		c8=new JTextField();
		c8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		c8.setForeground(my1);
		c8.setBounds(140,470,150,30);
		fr.add(c8);	
		c8.setOpaque(false);
		c8.setCaretColor(Color.orange);
		c8.setEditable(false);
			
		m1=new JTextField();
		m1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		m1.setForeground(my1);
		m1.setBounds(140,520,150,30);
		fr.add(m1);	
		m1.setOpaque(false);
		m1.setCaretColor(Color.orange);
		m1.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l10.setText("");
			}		
		});

		m2=new JTextField();
		m2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		m2.setForeground(my1);
		m2.setBounds(380,520,150,30);
		fr.add(m2);	
		m2.setOpaque(false);
		m2.setCaretColor(Color.orange);
		m2.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l10.setText("");
			}		
		});
		
		l1 = new JLabel("VALUE 1.");
		l1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l1.setForeground(Color.blue);
		l1.setBounds(370,120,100,40);
		fr.add(l1);

		l2 = new JLabel("VALUE 2.");
		l2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l2.setForeground(Color.blue);
		l2.setBounds(370,170,100,40);
		fr.add(l2);		
		
		l3 = new JLabel("VALUE 3.");
		l3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l3.setForeground(Color.blue);
		l3.setBounds(370,220,100,40);
		fr.add(l3);

		l4 = new JLabel("VALUE 4.");
		l4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l4.setForeground(Color.blue);
		l4.setBounds(370,270,120,40);
		fr.add(l4);

		l5 = new JLabel("VALUE 5.");
		l5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l5.setForeground(Color.blue);
		l5.setBounds(370,320,200,40);
		fr.add(l5);
		
		l6 = new JLabel("VALUE 6.");
		l6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l6.setForeground(Color.blue);
		l6.setBounds(370,370,100,40);
		fr.add(l6);
				
		l7 = new JLabel("VALUE 7.");
		l7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l7.setForeground(Color.blue);
		l7.setBounds(370,420,100,40);
		fr.add(l7);	

		l8 = new JLabel("VALUE 8.");
		l8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l8.setForeground(Color.blue);
		l8.setBounds(370,470,100,40);
		fr.add(l8);		
		
		l9 = new JLabel("MODIFY RECORD");
		l9.setFont(new Font("cooper black",Font.BOLD|Font.ITALIC,45));
		l9.setForeground(my);
		l9.setBounds(180,6,500,50);
		fr.add(l9);		
		
		l10 = new JLabel("");
		l10.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l10.setForeground(Color.magenta);
		l10.setBounds(30,55,450,30);
		fr.add(l10);		
		
		l11 = new JLabel("TABLE NAME");
		l11.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l11.setForeground(Color.red);
		l11.setBounds(370,70,120,40);
		fr.add(l11);		
		
		v1 = new JLabel("COLUMN 1.");
		v1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		v1.setForeground(Color.blue);
		v1.setBounds(20,120,100,40);
		fr.add(v1);

		v2 = new JLabel("COLUMN 2.");
		v2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		v2.setForeground(Color.blue);
		v2.setBounds(20,170,100,40);
		fr.add(v2);		
		
		v3 = new JLabel("COLUMN 3.");
		v3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		v3.setForeground(Color.blue);
		v3.setBounds(20,220,100,40);
		fr.add(v3);

		v4 = new JLabel("COLUMN 4.");
		v4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		v4.setForeground(Color.blue);
		v4.setBounds(20,270,120,40);
		fr.add(v4);

		v5 = new JLabel("COLUMN 5.");
		v5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		v5.setForeground(Color.blue);
		v5.setBounds(20,320,200,40);
		fr.add(v5);
		
		v6 = new JLabel("COLUMN 6.");
		v6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		v6.setForeground(Color.blue);
		v6.setBounds(20,370,100,40);
		fr.add(v6);
				
		v7 = new JLabel("COLUMN 7.");
		v7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		v7.setForeground(Color.blue);
		v7.setBounds(20,420,100,40);
		fr.add(v7);	

		v8 = new JLabel("COLUMN 8.");
		v8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		v8.setForeground(Color.blue);
		v8.setBounds(20,470,100,40);
		fr.add(v8);	
		
		k1 = new JLabel("COLUMN NAME");
		k1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,12));
		k1.setForeground(Color.red);
		k1.setBounds(20,520,100,40);
		fr.add(k1);	

		k2 = new JLabel("VALUE");
		k2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,12));
		k2.setForeground(Color.red);
		k2.setBounds(320,520,70,40);
		fr.add(k2);		

		
		
		b1= new JButton("MODIFY",new ImageIcon("images/mod.png"));
		b1.setToolTipText("modify");
		b1.setFont(new Font("verdana",Font.BOLD,15));
		b1.setForeground(Color.darkGray);
		b1.setBounds(590,520,150,30);
		fr.add(b1);
		b1.addActionListener(this);	

		b2= new JButton("GO");
		b2.setToolTipText("go");
		b2.setFont(new Font("verdana",Font.BOLD,12));
		b2.setForeground(Color.darkGray);
		b2.setBounds(654,70,55,30);
		fr.add(b2);
		b2.addActionListener(this);	

		l12 = new JLabel(new ImageIcon("images/back.png"));
		l12.setBounds(715,2,32,32);
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
			if((!(t1.getText().equals("")&&t9.getText().equals("")))&&(t2.getText().equals("")&&t4.getText().equals("")&&t3.getText().equals("")&&t5.getText().equals("")&&t6.getText().equals("")&&t7.getText().equals("")&&t8.getText().equals("")))
			{	
				String datas=data;
				try
					{
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("update "+t9.getText()+" set "+c1.getText()+"=?  where "+m1.getText()+"=?");
					ps.setString(1,t1.getText());
					ps.setString(2,m2.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					new msg4(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Click on GO button before clicking on MODIFY button...");
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
					ps=con.prepareStatement("update "+t9.getText()+" set "+c1.getText()+"=?,"+c2.getText()+"=?  where "+m1.getText()+"=?");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,m2.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					new msg4(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Click on GO button before clicking on MODIFY button...");
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
					ps=con.prepareStatement("update "+t9.getText()+" set "+c1.getText()+"=?,"+c2.getText()+"=?,"+c3.getText()+"=?  where "+m1.getText()+"=?");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,m2.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					new msg4(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Click on GO button before clicking on MODIFY button...");
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
					ps=con.prepareStatement("update "+t9.getText()+" set "+c1.getText()+"=?,"+c2.getText()+"=?,"+c3.getText()+"=?,"+c4.getText()+"=?  where "+m1.getText()+"=?");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,m2.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					new msg4(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Click on GO button before clicking on MODIFY button...");
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
					ps=con.prepareStatement("update "+t9.getText()+" set "+c1.getText()+"=?,"+c2.getText()+"=?,"+c3.getText()+"=?,"+c4.getText()+"=?,"+c5.getText()+"=?  where "+m1.getText()+"=?");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,t5.getText());
					ps.setString(6,m2.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					new msg4(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Click on GO button before clicking on MODIFY button...");
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
					ps=con.prepareStatement("update "+t9.getText()+" set "+c1.getText()+"=?,"+c2.getText()+"=?,"+c3.getText()+"=?,"+c4.getText()+"=?,"+c5.getText()+"=?,"+c6.getText()+"=?  where "+m1.getText()+"=?");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,t5.getText());
					ps.setString(6,t6.getText());
					ps.setString(7,m2.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					new msg4(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Click on GO button before clicking on MODIFY button...");
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
					ps=con.prepareStatement("update "+t9.getText()+" set "+c1.getText()+"=?,"+c2.getText()+"=?,"+c3.getText()+"=?,"+c4.getText()+"=?,"+c5.getText()+"=?,"+c6.getText()+"=?,"+c7.getText()+"=?  where "+m1.getText()+"=?");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,t5.getText());
					ps.setString(6,t6.getText());
					ps.setString(7,t7.getText());
					ps.setString(8,m2.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					new msg4(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Click on GO button before clicking on MODIFY button...");
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
					ps=con.prepareStatement("update "+t9.getText()+" set "+c1.getText()+"=?,"+c2.getText()+"=?,"+c3.getText()+"=?,"+c4.getText()+"=?,"+c5.getText()+"=?,"+c6.getText()+"=?,"+c7.getText()+"=?,"+c8.getText()+"=?  where "+m1.getText()+"=?");
					ps.setString(1,t1.getText());
					ps.setString(2,t2.getText());
					ps.setString(3,t3.getText());
					ps.setString(4,t4.getText());
					ps.setString(5,t5.getText());
					ps.setString(6,t6.getText());
					ps.setString(7,t7.getText());
					ps.setString(8,t8.getText());
					ps.setString(8,m2.getText());
					ps.executeUpdate();	
					con.close();
					fr.setEnabled(false);
					new msg4(fr);
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Click on GO button before clicking on MODIFY button...");
					}
			}
			else 
			{
				l10.setText("Enter the table name and fileds value...");
			}
		}	
		if(ae.getSource()==b2)
		{

			if(!(t9.getText().equals(""))&&(!(m1.getText().equals("")))&&(!(m2.getText().equals(""))))
			{
			String datas=data;
			String a[]=new String[10];
			String b[]=new String[10];
				try
					{
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("select * from "+t9.getText()+" where  "+m1.getText()+"=?");
					ps.setString(1,m2.getText());
					ResultSet rs=ps.executeQuery();
					ResultSetMetaData rsmd =rs.getMetaData();
					int columns = rsmd.getColumnCount();
					for (int i = 1; i <= columns; i++)
					{
						a[i]=rsmd.getColumnName(i);	
					}
					while(rs.next())
					{	
						for( int i=1;i<=columns;i++)
						{
						b[i]=rs.getString(i);
						}
					}	
					c1.setText(a[1]);
					c2.setText(a[2]);
					c3.setText(a[3]);
					c4.setText(a[4]);
					c5.setText(a[5]);
					c6.setText(a[6]);
					c7.setText(a[7]);
					c8.setText(a[8]);
					t1.setText(b[1]);
					t2.setText(b[2]);
					t3.setText(b[3]);
					t4.setText(b[4]);
					t5.setText(b[5]);
					t6.setText(b[6]);
					t7.setText(b[7]);
					t8.setText(b[8]);
					
					//l10.setText("data inserted successfully...");
					con.close();
					}
					catch(Exception e)
					{
					System.out.print(e);
					l10.setText("Error! no such table or column name or value exist...");
					
					}	
			}
			else
			{
				l10.setText("Enter table name,column name and value...");

			}
		}
			
		
}	

		public static void main(String args[])
		{
		new modify(new JFrame(),"3tier");
		}
}
		
		
		