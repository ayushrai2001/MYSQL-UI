import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class add  implements ActionListener
{
int w,h;
JFrame fr,fk;
JButton b1;
JTextField p1,p2;
JLabel l1,l2,l3,l4,l5,l11;
JComboBox c1;
String st;
	public add(JFrame ff,String ss)
	{
		fk=ff;
		st=ss;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("ADD COLUMN");
		fr.setLayout(null);
		fr.setBackground(Color.gray);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-630)/2,(h-530)/2,600,515);	
		fr.setContentPane(new JLabel(new ImageIcon("images/k5.jpg")));
		
		Color my1=new Color(108,22,255);
		Color my=new Color(255,7,57);
		
		b1= new JButton("ADD",new ImageIcon("images/adds.png"));
		b1.setToolTipText("add");
		b1.setFont(new Font("verdana",Font.BOLD,15));
		b1.setForeground(Color.darkGray);
		b1.setBounds(300,420,150,30);
		fr.add(b1);
		b1.addActionListener(this);
		
		p1=new JTextField();
		p1.setFont(new Font("verdana",Font.BOLD,15));
		p1.setForeground(my1);
		p1.setBounds(300,180,150,30);
		p1.setMargin(new Insets(0, 5, 0, 0));
		p1.setOpaque(false);
		p1.setCaretColor(Color.orange);
		p1.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l1.setText("");
			}
		});
		fr.add(p1);
		
		p2=new JTextField();
		p2.setFont(new Font("verdana",Font.BOLD,15));
		p2.setForeground(my1);
		p2.setBounds(300,260,150,30);
		p2.setMargin(new Insets(0, 5, 0, 0));
		p2.setOpaque(false);
		p2.setCaretColor(Color.orange);
		p2.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l1.setText("");
			}
		});
		fr.add(p2);

		l1 = new JLabel("");
		l1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l1.setForeground(Color.magenta);
		l1.setBounds(80,445,300,30);
		fr.add(l1);
		
		l2 = new JLabel("ADD COLUMN");
		l2.setFont(new Font("cooper black",Font.BOLD|Font.ITALIC,50));
		l2.setForeground(my);
		l2.setBounds(115,50,550,60);
		fr.add(l2);

		l3 = new JLabel("TABLE NAME");
		l3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,17));
		l3.setForeground(Color.blue);
		l3.setBounds(125,180,150,30);
		fr.add(l3);
		
		l4 = new JLabel("COLUMN NAME");
		l4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,17));
		l4.setForeground(Color.blue);
		l4.setBounds(125,260,150,30);
		fr.add(l4);

		l5 = new JLabel("DATA TYPE");
		l5.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,17));
		l5.setForeground(Color.blue);
		l5.setBounds(125,340,250,30);
		fr.add(l5);
		
		l11 = new JLabel(new ImageIcon("images/back.png"));
		l11.setBounds(536,1,32,32);
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
				fk.setEnabled(true);
				fr.dispose();
			}
		});
		fr.add(l11);


		
		c1 = new JComboBox();
		c1.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		c1.setForeground(my1);
		c1.setBounds(300,340,150,30);
		c1.addItem("int");
		c1.addItem("float(5,5)");
		c1.addItem("float(10,10)");
		c1.addItem("varchar(10)");
		c1.addItem("varchar(20)");
		c1.addItem("varchar(30)");
		c1.addItem("char(10)");
		c1.addItem("char(20)");
		fr.add(c1);
		
		fr.setUndecorated(true);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent ae)
		{
		if(ae.getSource()==b1)
		{
			 if((!(p1.getText().equals("")))&&(!(p2.getText().equals(""))))
			{
			try
			{
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("use "+st+" ");
			ps.executeQuery();	
			ps = con.prepareStatement("alter table "+p1.getText()+" add column "+p2.getText()+" "+c1.getSelectedItem()+"");
			int z=ps.executeUpdate();
			con.close();	
			fr.setEnabled(false);
			new msg5(fr);
			}
			catch(Exception e)
			{
			System.out.println(e);
			l1.setText("Error! no such table exist..");
			}
		}
		else
		{
			l1.setText("Enter table and column name...");
		}
	
					
		}
}

		
		public static void main(String args[])
		{
		new add(new JFrame(),"3tier");
		}
}
		
		
		