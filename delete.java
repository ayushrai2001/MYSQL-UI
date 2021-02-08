import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class delete  implements ActionListener
{
int w,h;
JFrame fr,ft;
JButton b1,b2,b3,b4;
JTextField t1,t2,t3,t4,t5,t6,t7;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11;
String data;
String tab="table";
String col="column";
String row="row";
String del="deleted";
String dro="dropped";

	public delete(JFrame ff,String dd)
	{
		ft=ff;
		data=dd;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("DELETE RECORD");
		fr.setLayout(null);
		fr.setBackground(Color.gray);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-750)/2,(h-550)/2,750,600);	
		fr.setContentPane(new JLabel(new ImageIcon("images/d2.jpg")));
				
		Color my1=new Color(118,20,255);
		Color my=new Color(10,67,255);

		l2 = new JLabel("ENTER TABLE NAME");
		l2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l2.setForeground(Color.red);
		l2.setBounds(405,131,200,40);
		fr.add(l2);
		l1 = new JLabel("ENTER TABLE NAME");
		l1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l1.setForeground(Color.red);
		l1.setBounds(405,251,170,40);
		fr.add(l1);
		l3 = new JLabel("ENTER TABLE NAME");
		l3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l3.setForeground(Color.red);
		l3.setBounds(405,371,170,40);
		fr.add(l3);
		l4 = new JLabel("ENTER COL. NAME");
		l4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l4.setForeground(Color.red);
		l4.setBounds(405,432,230,40);
		fr.add(l4);
		l5 = new JLabel("ENTER DATA NAME");
		l5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l5.setForeground(Color.red);
		l5.setBounds(531,432,230,40);
		fr.add(l5);
		l6 = new JLabel("");
		l6.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l6.setForeground(Color.magenta);
		l6.setBounds(210,512,380,40);
		fr.add(l6);
		l7= new JLabel("ENTER TABLE NAME");
		l7.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l7.setForeground(Color.red);
		l7.setBounds(405,490,230,40);
		fr.add(l7);
		l8 = new JLabel("ENTER COL. NAME");
		l8.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l8.setForeground(Color.red);
		l8.setBounds(531,490,230,40);
		fr.add(l8);
		l9 = new JLabel("DELETE RECORD");
		l9.setFont(new Font("cooper black",Font.BOLD|Font.ITALIC,45));
		l9.setForeground(my);
		l9.setBounds(120,20,490,40);
		fr.add(l9);
		
		l11 = new JLabel(new ImageIcon("images/back.png"));
		l11.setBounds(700,0,32,32);
		l11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		fr.add(l11);


		
		b1= new JButton("Drop Table");
		b1.setToolTipText("drop table");
		b1.setFont(new Font("verdana",Font.BOLD,15));
		b1.setForeground(Color.darkGray);
		b1.setBounds(130,100,170,40);
		fr.add(b1);
		b1.addActionListener(this);
		
		b2= new JButton("Delete Table");
		b2.setToolTipText("delete table");
		b2.setFont(new Font("verdana",Font.BOLD,15));
		b2.setForeground(Color.darkGray);
		b2.setBounds(130,220,170,40);
		fr.add(b2);
		b2.addActionListener(this);

		b3= new JButton("Delete Row");
		b3.setToolTipText("delete row");
		b3.setFont(new Font("verdana",Font.BOLD,15));
		b3.setForeground(Color.darkGray);
		b3.setBounds(130,340,170,40);
		fr.add(b3);
		b3.addActionListener(this);

		b4= new JButton("Delete Column");
		b4.setToolTipText("delete column");
		b4.setFont(new Font("verdana",Font.BOLD,15));
		b4.setForeground(Color.darkGray);
		b4.setBounds(130,460,170,40);
		fr.add(b4);
		b4.addActionListener(this);
				
		t1=new JTextField();
		t1.setFont(new Font("verdana",Font.BOLD,15));
		t1.setForeground(my1);
		t1.setBounds(405,100,170,40);
		fr.add(t1);
		t1.setMargin(new Insets(0, 5, 0, 0));
		t1.setOpaque(false);
		t1.setCaretColor(Color.orange);
		t1.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l6.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
			}
		});
		

		t2=new JTextField();
		t2.setFont(new Font("verdana",Font.BOLD,15));
		t2.setForeground(my1);
		t2.setBounds(405,220,170,40);
		fr.add(t2);
		t2.setMargin(new Insets(0, 5, 0, 0));
		t2.setOpaque(false);
		t2.setCaretColor(Color.orange);
		t2.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l6.setText("");
				t1.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
			}
		});
		
		t3=new JTextField();
		t3.setFont(new Font("verdana",Font.BOLD,15));
		t3.setForeground(my1);
		t3.setBounds(405,401,100,40);
		fr.add(t3);
		t3.setMargin(new Insets(0, 5, 0, 0));
		t3.setOpaque(false);
		t3.setCaretColor(Color.orange);
		t3.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l6.setText("");
				t1.setText("");
				t6.setText("");
				t7.setText("");
				t2.setText("");
				
			}
		});

		t4=new JTextField();
		t4.setFont(new Font("verdana",Font.BOLD,15));
		t4.setForeground(my1);
		t4.setBounds(531,401,100,40);
		fr.add(t4);
		t4.setMargin(new Insets(0, 5, 0, 0));
		t4.setOpaque(false);
		t4.setCaretColor(Color.orange);
		t4.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l6.setText("");
				t1.setText("");
				t6.setText("");
				t7.setText("");
				t2.setText("");
				
			}
		});

		t5=new JTextField();
		t5.setFont(new Font("verdana",Font.BOLD,15));
		t5.setForeground(my1);
		t5.setBounds(405,340,170,40);
		fr.add(t5);
		t5.setMargin(new Insets(0, 5, 0, 0));
		t5.setOpaque(false);
		t5.setCaretColor(Color.orange);
		t5.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l6.setText("");
				t1.setText("");
				t6.setText("");
				t7.setText("");
				t2.setText("");
			}
		});

		t6=new JTextField();
		t6.setFont(new Font("verdana",Font.BOLD,15));
		t6.setForeground(my1);
		t6.setBounds(405,460,100,40);
		fr.add(t6);
		t6.setMargin(new Insets(0, 5, 0, 0));
		t6.setOpaque(false);
		t6.setCaretColor(Color.orange);
		t6.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l6.setText("");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
		});

		t7=new JTextField();
		t7.setFont(new Font("verdana",Font.BOLD,15));
		t7.setForeground(my1);
		t7.setBounds(531,460,100,40);
		fr.add(t7);
		t7.setMargin(new Insets(0, 5, 0, 0));
		t7.setOpaque(false);
		t7.setCaretColor(Color.orange);
		t7.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l6.setText("");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
		});

		
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
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("use "+data+" ");
			ps.executeQuery();	
			ps = con.prepareStatement("drop table "+t1.getText()+"");
			int z=ps.executeUpdate();
			con.close();	
			fr.setEnabled(false);
			new msg1(fr,dro,tab);
			}
			catch(Exception e)
			{
			System.out.println(e);
			l6.setText("Error! no such table exist..");
			}
		}
		else
		{
			l6.setText("Enter table name...");
		}
	}
	if(ae.getSource()==b2)
	{
		if(!(t2.getText().equals("")))
		{
			try
			{
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("use "+data+" ");
			ps.executeQuery();	
			ps = con.prepareStatement("delete from "+t2.getText()+"");
			int z=ps.executeUpdate();
			con.close();	
			fr.setEnabled(false);
			new msg1(fr,del,tab);
			}
			catch(Exception e)
			{
			System.out.println(e);
			l6.setText("Error! no such table exist..");
			}
		}
		else
		{
			l6.setText("Enter table name...");
		}
	}
	if(ae.getSource()==b3)
	{
		if(!(t3.getText().equals("")&&t4.getText().equals("")&&t5.getText().equals("")))
		{
			if((!(t3.getText().equals("")))&&(!(t4.getText().equals("")))&&(!(t5.getText().equals(""))))
			{
			try
			{
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("use "+data+" ");
			ps.executeQuery();	
			ps = con.prepareStatement("delete from "+t5.getText()+" where "+t3.getText()+"=?");
			ps.setString(1,t4.getText());
			int z=ps.executeUpdate();
			fr.setEnabled(false);
			new msg1(fr,del,row);
			con.close();	
			}
			catch(Exception e)
			{
			System.out.println(e);
			l6.setText("Error! no such table or column or data exist..");
			}
			}
			else
			{
				l6.setText("Enter table, column name and data ..");
			}
		}
		else
		{
			l6.setText("Error! enter table,column,data name....");
		}	
	}
	if(ae.getSource()==b4)
	{
	if(!(t6.getText().equals("")&&t7.getText().equals("")))
		{
		      if((!(t6.getText().equals("")))&&(!(t7.getText().equals(""))))
		      {
			try
			{
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("use "+data+" ");
			ps.executeQuery();	
			ps = con.prepareStatement("alter table "+t6.getText()+" drop column "+t7.getText()+"");
			int z=ps.executeUpdate();
			fr.setEnabled(false);
			new msg1(fr,del,col);
			con.close();	
			}
			catch(Exception e)
			{
			System.out.println(e);
			l6.setText("Error! no such table or column ... ");
			}
		    }
		   else
		   {
			l6.setText("Enter table and column name... ");
		   }
		}
		else
		{
			l6.setText("Error! enter table,column name....");
		}	
	}


}
			
		public static void main(String args[])
		{
		new delete(new JFrame(),"morning_batch");
		}
}
		
		
		