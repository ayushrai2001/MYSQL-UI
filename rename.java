import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class rename implements ActionListener 
{
int w,h;
JFrame fr,ft;
JButton b1,b2;
JTextField t1,t2,t3,t4,t5;
JComboBox cb;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11;
String data;
String col="column";
String tab="table";
	
	public  rename(JFrame ff,String dd)
	{
		ft=ff;
		data=dd;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("RENAME RECORD");
		fr.setLayout(null);
		fr.setBackground(Color.gray);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-750)/2,(h-540)/2,750,610);	
		fr.setContentPane(new JLabel(new ImageIcon("images/d8.jpg")));
		
		Color my1=new Color(118,20,255);
		Color my=new Color(10,79,255);
		
		

		b1= new JButton("RENAME TABLE",new ImageIcon("images/re.png"));
		b1.setToolTipText("rename table");
		b1.setFont(new Font("verdana",Font.BOLD,15));
		b1.setForeground(Color.darkGray);
		b1.setBounds(44,160,230,40);
		fr.add(b1);
		b1.addActionListener(this);

		b2= new JButton("RENAME COLUMN",new ImageIcon("images/rename.png"));
		b2.setToolTipText("rename column");
		b2.setFont(new Font("verdana",Font.BOLD,15));
		b2.setForeground(Color.darkGray);
		b2.setBounds(44,310,230,40);
		fr.add(b2);
		b2.addActionListener(this);
		
		
		t1=new JTextField();
		t1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t1.setForeground(my1);
		t1.setBounds(360,160,140,40);
		fr.add(t1);	
		t1.setOpaque(false);
		t1.setCaretColor(Color.orange);
		t1.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
		});
		
				
		t2=new JTextField();
		t2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t2.setForeground(my1);
		t2.setBounds(510,160,150,40);
		fr.add(t2);	
		t2.setOpaque(false);		
		t2.setCaretColor(Color.orange);
		t2.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
		});

		t3=new JTextField();
		t3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t3.setForeground(my1);
		t3.setBounds(360,310,140,40);
		fr.add(t3);
		t3.setOpaque(false);
		t3.setCaretColor(Color.orange);
		t3.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l2.setText("");
				t1.setText("");
				t2.setText("");
				
			}
		});
		
		t4=new JTextField();
		t4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t4.setForeground(my1);
		t4.setBounds(510,310,150,40);
		fr.add(t4);	
		t4.setOpaque(false);
		t4.setCaretColor(Color.orange);
		t4.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l2.setText("");
				t1.setText("");
				t2.setText("");
			}
		});
	
		t5=new JTextField();
		t5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,25));
		t5.setForeground(my1);
		t5.setBounds(360,370,140,40);
		fr.add(t5);	
		t5.setOpaque(false);
		t5.setCaretColor(Color.orange);
		t5.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				t1.setText("");
				t2.setText("");
				l2.setText("");
			}
		});

		cb=new JComboBox();
		cb.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		cb.setForeground(Color.red);
		cb.addItem("int");
		cb.addItem("bigint");
		cb.addItem("float(5,5)");
		cb.addItem("float(10,10)");
		cb.addItem("varchar(10)");
		cb.addItem("varchar(20)");
		cb.addItem("varchar(30)");
		cb.addItem("varchar(40)");
		cb.addItem("varchar(50)");
		cb.addItem("char(10)");
		cb.addItem("char(20)");
		cb.addItem("char(30)");
		cb.setBounds(510,370,150,40);
		fr.add(cb);	
		
		l1 = new JLabel("RENAME RECORD");
		l1.setFont(new Font("cooper black",Font.BOLD|Font.ITALIC,45));
		l1.setForeground(my);
		l1.setBounds(120,30,490,80);
		fr.add(l1);

		l2 = new JLabel("");
		l2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l2.setForeground(Color.red);
		l2.setBounds(190,510,380,40);
		fr.add(l2);		
		
		l3 = new JLabel("OLD TABLE NAME ");
		l3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l3.setForeground(Color.red);
		l3.setBounds(360,187,100,40);
		fr.add(l3);

		l4 = new JLabel("NEW TABLE NAME ");
		l4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l4.setForeground(Color.red);
		l4.setBounds(515,187,120,40);
		fr.add(l4);

		l5 = new JLabel("TABLE NAME ");
		l5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l5.setForeground(Color.red);
		l5.setBounds(360,400,200,40);
		fr.add(l5);
		
		l6 = new JLabel("OLD COL. NAME ");
		l6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l6.setForeground(Color.red);
		l6.setBounds(360,341,100,40);
		fr.add(l6);
				
		l7 = new JLabel("NEW COL. NAME ");
		l7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l7.setForeground(Color.red);
		l7.setBounds(515,341,100,40);
		fr.add(l7);	
		l8 = new JLabel("NEW TYPE ");
		l8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l8.setForeground(Color.red);
		l8.setBounds(575,400,100,40);
		fr.add(l8);		
		
		l11 = new JLabel(new ImageIcon("images/back.png"));
		l11.setBounds(700,1,32,32);
		l11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(l11);
		l11.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l11.setIcon(new ImageIcon("images/back2.png"));
			}
			public void mouseExited(MouseEvent me)
			{	
				l11.setIcon(new ImageIcon("images/back.png"));
			}
			public void mouseClicked(MouseEvent me)
			{
				ft.setEnabled(true);
				fr.dispose();
			}
		});
		

		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent ae)
		{
		if(ae.getSource()==b1)
		{	
			if(!(t1.getText().equals("")&&t2.getText().equals("")))
			{
				String datas=data;
				try
					{
					Connection con = dao.createconnection();
					PreparedStatement ps = con.prepareStatement("use "+datas+"");
					ps.executeQuery();	
					ps=con.prepareStatement("alter table "+t1.getText()+" rename to "+t2.getText()+"");
					ps.executeUpdate();		
					t1.setText("");	
					t2.setText("");	
					con.close();
					fr.setEnabled(false);
					new msg2(fr,tab);
					}
					catch(Exception e)
					{
					l2.setText("Error! no such table exists....");
					System.out.print(e);
					}
			}

		
			else
			{
				l2.setText("Error! enter table name");
			}	
			
		}
		else if(ae.getSource()==b2)
		{	
		        if(!(t3.getText().equals("")&&t4.getText().equals("")&&t5.getText().equals("")))
		       {	
			String datas=data;
			try
			{
			String db=t2.getText();
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("use "+datas+"");
			ps.executeQuery();	
			ps=con.prepareStatement("ALTER TABLE "+t5.getText()+" CHANGE "+t3.getText()+" "+ t4.getText()+" "+ (String)cb.getSelectedItem()+"");
			ps.executeUpdate();
			t1.setText("");	
			t2.setText("");
			fr.setEnabled(false);
			new msg2(fr,col);
			con.close();		
			}
			catch(Exception e)
			{	
				System.out.print(e);
				l2.setText("Error! no such table or column exist..");
			}
			
			}
			else
			{
				l2.setText("Error! enter table and column name");
			}
			
		}		
		else
		{
		}	
}
				
		public static void main(String args[])
		{		
			new rename(new JFrame(),"morning_batch");
		}
}
		
		
		