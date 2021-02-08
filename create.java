import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.DefaultListModel;

class create implements ActionListener
{
int w,h;
JFrame fr,fk;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
JComboBox c1,c2,c3,c4,c5,c6,c7,c8;
JButton b1;
String data;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;

	public create(JFrame ft,String dd)
	{
		fk=ft;
		data=dd;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("CREATE TABLE");
		fr.setLayout(null);
		fr.setBackground(Color.gray);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-750)/2,(h-550)/2,750,600);
		fr.setContentPane(new JLabel(new ImageIcon("images/k3.jpg")));
		
		Color my1=new Color(132,10,255);

		t1=new JTextField();
		t1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t1.setForeground(my1);
		t1.setBounds(170,120,150,30);
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
		t2.setBounds(170,170,150,30);
		fr.add(t2);	
		t2.setOpaque(false);
		t2.setCaretColor(Color.orange);
		
		t3=new JTextField();
		t3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t3.setForeground(my1);
		t3.setBounds(170,220,150,30);
		fr.add(t3);	
		t3.setOpaque(false);
		t3.setCaretColor(Color.orange);
		
		t4=new JTextField();
		t4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t4.setForeground(my1);
		t4.setBounds(170,270,150,30);
		fr.add(t4);	
		t4.setOpaque(false);
		t4.setCaretColor(Color.orange);
		
		t5=new JTextField();
		t5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t5.setForeground(my1);
		t5.setBounds(170,320,150,30);
		fr.add(t5);	
		t5.setOpaque(false);
		t5.setCaretColor(Color.orange);
		
		t6=new JTextField();
		t6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t6.setForeground(my1);
		t6.setBounds(170,370,150,30);
		fr.add(t6);	
		t6.setOpaque(false);
		t6.setCaretColor(Color.orange);

		t7=new JTextField();
		t7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t7.setForeground(my1);
		t7.setBounds(170,420,150,30);
		fr.add(t7);	
		t7.setOpaque(false);
		t7.setCaretColor(Color.orange);

		t8=new JTextField();
		t8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t8.setForeground(my1);
		t8.setBounds(170,470,150,30);
		fr.add(t8);	
		t8.setOpaque(false);
		t8.setCaretColor(Color.orange);
		
		t9=new JTextField();
		t9.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t9.setForeground(my1);
		t9.setBounds(170,70,150,30);
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

		
		l1 = new JLabel("COLUMN 1.");
		l1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l1.setForeground(Color.blue);
		l1.setBounds(61,120,100,40);
		fr.add(l1);

		l2 = new JLabel("COLUMN 2.");
		l2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l2.setForeground(Color.blue);
		l2.setBounds(61,170,100,40);
		fr.add(l2);		
		
		l3 = new JLabel("COLUMN 3.");
		l3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l3.setForeground(Color.blue);
		l3.setBounds(61,220,100,40);
		fr.add(l3);

		l4 = new JLabel("COLUMN 4.");
		l4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l4.setForeground(Color.blue);
		l4.setBounds(61,270,120,40);
		fr.add(l4);

		l5 = new JLabel("COLUMN 5.");
		l5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l5.setForeground(Color.blue);
		l5.setBounds(61,320,200,40);
		fr.add(l5);
		
		l6 = new JLabel("COLUMN 6.");
		l6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l6.setForeground(Color.blue);
		l6.setBounds(61,370,100,40);
		fr.add(l6);
				
		l7 = new JLabel("COLUMN 7.");
		l7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l7.setForeground(Color.blue);
		l7.setBounds(61,420,100,40);
		fr.add(l7);	

		l8 = new JLabel("COLUMN 8.");
		l8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l8.setForeground(Color.blue);
		l8.setBounds(61,470,100,40);
		fr.add(l8);		
		
		l9 = new JLabel("CREATE TABLE");
		l9.setFont(new Font("cooper black",Font.BOLD|Font.ITALIC,45));
		l9.setForeground(my1);
		l9.setBounds(180,10,400,50);
		fr.add(l9);		
		
		l10 = new JLabel("");
		l10.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l10.setForeground(Color.magenta);
		l10.setBounds(110,520,400,30);
		fr.add(l10);		
		
		l11 = new JLabel("TABLE NAME");
		l11.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l11.setForeground(Color.red);
		l11.setBounds(31,70,120,40);
		fr.add(l11);		
		
		
		
		c1 = new JComboBox();
		c1.addItem("int");
		c1.addItem("bigint");
		c1.addItem("float(5,5)");
		c1.addItem("float(10,10)");
		c1.addItem("varchar(10)");
		c1.addItem("varchar(20)");
		c1.addItem("varchar(30)");
		c1.addItem("varchar(40)");
		c1.addItem("varchar(50)");
		c1.addItem("char(10)");
		c1.addItem("char(20)");
		c1.addItem("char(30)");
		c1.setBounds(450,120,150,30);
		fr.add(c1);

		c2 = new JComboBox();
		c2.addItem("int");
		c2.addItem("bigint");
		c2.addItem("float(5,5)");
		c2.addItem("float(10,10)");
		c2.addItem("varchar(10)");
		c2.addItem("varchar(20)");
		c2.addItem("varchar(30)");
		c2.addItem("varchar(40)");
		c2.addItem("varchar(50)");
		c2.addItem("char(10)");
		c2.addItem("char(20)");
		c2.addItem("char(30)");
		c2.setBounds(450,170,150,30);
		fr.add(c2);

		c3 = new JComboBox();
		c3.addItem("int");
		c3.addItem("bigint");
		c3.addItem("float(5,5)");
		c3.addItem("float(10,10)");
		c3.addItem("varchar(10)");
		c3.addItem("varchar(20)");
		c3.addItem("varchar(30)");
		c3.addItem("varchar(40)");
		c3.addItem("varchar(50)");
		c3.addItem("char(10)");
		c3.addItem("char(20)");
		c3.addItem("char(30)");
		c3.setBounds(450,220,150,30);
		fr.add(c3);

		c4 = new JComboBox();
		c4.addItem("int");
		c4.addItem("bigint");
		c4.addItem("float(5,5)");
		c4.addItem("float(10,10)");
		c4.addItem("varchar(10)");
		c4.addItem("varchar(20)");
		c4.addItem("varchar(30)");
		c4.addItem("varchar(40)");
		c4.addItem("varchar(50)");
		c4.addItem("char(10)");
		c4.addItem("char(20)");
		c4.addItem("char(30)");
		c4.setBounds(450,270,150,30);
		fr.add(c4);

		c5 = new JComboBox();
		c5.addItem("int");
		c5.addItem("bigint");
		c5.addItem("float(5,5)");
		c5.addItem("float(10,10)");
		c5.addItem("varchar(10)");
		c5.addItem("varchar(20)");
		c5.addItem("varchar(30)");
		c5.addItem("varchar(40)");
		c5.addItem("varchar(50)");
		c5.addItem("char(10)");
		c5.addItem("char(20)");
		c5.addItem("char(30)");
		c5.setBounds(450,320,150,30);
		fr.add(c5);

		c6 = new JComboBox();
		c6.addItem("int");
		c6.addItem("bigint");
		c6.addItem("float(5,5)");
		c6.addItem("float(10,10)");
		c6.addItem("varchar(10)");
		c6.addItem("varchar(20)");
		c6.addItem("varchar(30)");
		c6.addItem("varchar(40)");
		c6.addItem("varchar(50)");
		c6.addItem("char(10)");
		c6.addItem("char(20)");
		c6.addItem("char(30)");
		c6.setBounds(450,370,150,30);
		fr.add(c6);
		
		c7 = new JComboBox();
		c7.addItem("int");
		c7.addItem("bigint");
		c7.addItem("float(5,5)");
		c7.addItem("float(10,10)");
		c7.addItem("varchar(10)");
		c7.addItem("varchar(20)");
		c7.addItem("varchar(30)");
		c7.addItem("varchar(40)");
		c7.addItem("varchar(50)");
		c7.addItem("char(10)");
		c7.addItem("char(20)");
		c7.addItem("char(30)");
		c7.setBounds(450,420,150,30);
		fr.add(c7);

		c8 = new JComboBox();
		c8.addItem("int");
		c8.addItem("bigint");
		c8.addItem("float(5,5)");
		c8.addItem("float(10,10)");
		c8.addItem("varchar(10)");
		c8.addItem("varchar(20)");
		c8.addItem("varchar(30)");
		c8.addItem("varchar(40)");
		c8.addItem("varchar(50)");
		c8.addItem("char(10)");
		c8.addItem("char(20)");
		c8.addItem("char(30)");
		c8.setBounds(450,470,150,30);
		fr.add(c8);	

		b1= new JButton("CREATE",new ImageIcon("images/cr.png"));
		b1.setToolTipText("create");
		b1.setFont(new Font("verdana",Font.BOLD,15));
		b1.setForeground(Color.darkGray);
		b1.setBounds(450,520,150,25);
		fr.add(b1);
		b1.addActionListener(this);	

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
			if((!(t1.getText().equals("")&&t9.getText().equals("")))&&(t2.getText().equals("")&&t4.getText().equals("")&&t3.getText().equals("")&&t5.getText().equals("")&&t6.getText().equals("")&&t7.getText().equals("")&&t8.getText().equals("")))
			{
				String datas=data;
				try
					{
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("create table "+t9.getText()+" ( "+t1.getText()+" "+(String)c1.getSelectedItem()+ " )" );
					ps.executeUpdate();	
					fr.setEnabled(false);
					con.close();
					new msg(fr,data,t9.getText());
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
					ps=con.prepareStatement("create table "+t9.getText()+" ( "+t1.getText()+" "+(String)c1.getSelectedItem()+","+t2.getText()+" "+(String)c2.getSelectedItem()+ " )" );
					ps.executeUpdate();	
					fr.setEnabled(false);
					con.close();
					new msg(fr,data,t9.getText());
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
					ps=con.prepareStatement("create table "+t9.getText()+" ( "+t1.getText()+" "+(String)c1.getSelectedItem()+","+t2.getText()+" "+(String)c2.getSelectedItem()+","+t3.getText()+" "+(String)c3.getSelectedItem()+" )" );
					ps.executeUpdate();	
					fr.setEnabled(false);
					con.close();
					new msg(fr,data,t9.getText());
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
					ps=con.prepareStatement("create table "+t9.getText()+" ( "+t1.getText()+" "+(String)c1.getSelectedItem()+","+t2.getText()+" "+(String)c2.getSelectedItem()+","+t3.getText()+" "+(String)c3.getSelectedItem()+","+t4.getText()+" "+(String)c4.getSelectedItem()+ " )" );
					ps.executeUpdate();	
					fr.setEnabled(false);
					con.close();
					new msg(fr,data,t9.getText());
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
					ps=con.prepareStatement("create table "+t9.getText()+" ( "+t1.getText()+" "+(String)c1.getSelectedItem()+","+t2.getText()+" "+(String)c2.getSelectedItem()+","+t3.getText()+" "+(String)c3.getSelectedItem()+","+t4.getText()+" "+(String)c4.getSelectedItem()+","+t5.getText()+" "+(String)c5.getSelectedItem()+ " )" );
					ps.executeUpdate();	
					fr.setEnabled(false);
					con.close();
					new msg(fr,data,t9.getText());
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
					ps=con.prepareStatement("create table "+t9.getText()+" ( "+t1.getText()+" "+(String)c1.getSelectedItem()+","+t2.getText()+" "+(String)c2.getSelectedItem()+","+t3.getText()+" "+(String)c3.getSelectedItem()+","+t4.getText()+" "+(String)c4.getSelectedItem()+","+t5.getText()+" "+(String)c5.getSelectedItem()+","+t6.getText()+" "+(String)c6.getSelectedItem()+ " )" );
					ps.executeUpdate();	
					fr.setEnabled(false);
					con.close();
					new msg(fr,data,t9.getText());
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
					ps=con.prepareStatement("create table "+t9.getText()+" ( "+t1.getText()+" "+(String)c1.getSelectedItem()+","+t2.getText()+" "+(String)c2.getSelectedItem()+","+t3.getText()+" "+(String)c3.getSelectedItem()+","+t4.getText()+" "+(String)c4.getSelectedItem()+","+t5.getText()+" "+(String)c5.getSelectedItem()+","+t6.getText()+" "+(String)c6.getSelectedItem()+","+t7.getText()+" "+(String)c7.getSelectedItem()+ " )" );
					ps.executeUpdate();	
					fr.setEnabled(false);
					con.close();
					new msg(fr,data,t9.getText());
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
					ps=con.prepareStatement("create table "+t9.getText()+" ( "+t1.getText()+" "+(String)c1.getSelectedItem()+","+t2.getText()+" "+(String)c2.getSelectedItem()+","+t3.getText()+" "+(String)c3.getSelectedItem()+","+t4.getText()+" "+(String)c4.getSelectedItem()+","+t5.getText()+" "+(String)c5.getSelectedItem()+","+t6.getText()+" "+(String)c6.getSelectedItem()+","+t7.getText()+" "+(String)c7.getSelectedItem()+","+t8.getText()+" "+(String)c8.getSelectedItem()+ " )" );
					ps.executeUpdate();	
					fr.setEnabled(false);
					con.close();
					new msg(fr,data,t9.getText());
					}
					catch(Exception e)
					{
					
					System.out.print(e);
					}
			}			





			else 
			{
				l10.setText("Enter table name and column name...");
			}	
			
		}
}	

		public static void main(String args[])
		{
		new create(new JFrame(),"3tier");
		}
}
		
		
		