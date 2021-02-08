import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.DefaultListModel;
import java.util.*;
import javax.swing.table.*;

class usedb2  implements ActionListener
{
int w,h;
JLabel l1,l2,limg,l3;
JFrame fr,fk;
JList ls;
JScrollPane jsp,jsp1;
JButton b1,b2;
JTable table;
String data;

	public usedb2(JFrame ft,String da)
	{
		fk=ft;
		data=da;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("SHOW DATA");
		fr.setLayout(null);
		fr.setBackground(Color.white);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-900)/2,(h-560)/2,860,610);
		fr.setContentPane(new JLabel(new ImageIcon("images/l2.jpg")));
		
		Color my=new Color(255,36,56);
		
		b1= new JButton("Show Data ",new ImageIcon("images/sh.png"));
		b1.setToolTipText("show data");
		b1.setFont(new Font("verdana",Font.BOLD,15));
		b1.setForeground(Color.darkGray);
		b1.setBounds(46,370,200,30);
		fr.add(b1);
		b1.addActionListener(this);
		
		b2= new JButton("Describe Table ",new ImageIcon("images/desc.png"));
		b2.setToolTipText("describe data");
		b2.setFont(new Font("verdana",Font.BOLD,15));
		b2.setForeground(Color.darkGray);
		b2.setBounds(46,450,200,30);
		fr.add(b2);
		b2.addActionListener(this);
		

		 l1 = new JLabel("SHOW RECORD");
		 l1.setFont(new Font("cooper black",Font.BOLD,50));
		 l1.setBounds(220,0,600,180);
		 l1.setForeground(my);
                                        fr.add(l1);
		 l3 = new JLabel("TABLE");
		 l3.setFont(new Font("verdana",Font.BOLD,15));
		 l3.setBounds(46,111,200,30);
		 l3.setForeground(Color.red);
                                        fr.add(l3);
		
		 l2 = new JLabel("");
		 l2.setFont(new Font("verdana",Font.BOLD,20));
		 l2.setBounds(46,475,500,100);
		 l2.setForeground(Color.red);
                                        fr.add(l2);
		
		 DefaultListModel<String>lm = new DefaultListModel<>();
        		 ls = new JList();
		 ls.setFont(new Font("verdana",Font.BOLD,50));
		 ls.setForeground(Color.red);


		limg = new JLabel(new ImageIcon("images/back.png"));
		limg.setBounds(800,1,30,30);
		limg.setToolTipText("Back");
		limg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		limg.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				limg.setIcon(new ImageIcon("images/back2.png"));
			}
			public void mouseExited(MouseEvent me)
			{	
				limg.setIcon(new ImageIcon("images/back.png"));
			}
			public void mouseClicked(MouseEvent me)
			{
				fk.setEnabled(true);
				fr.dispose();
			}
		});
		fr.add(limg);


			
			try 
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","lakshay");
			PreparedStatement ps = con.prepareStatement("use "+data+"");
			ps.executeQuery();	
			ps = con.prepareStatement("show tables");
			ResultSet rs=ps.executeQuery();	
			ResultSetMetaData md = rs.getMetaData();
			while (rs.next())	
			 {
				lm.addElement(""+rs.getObject(1)+"");

			 }
			ls = new JList<>(lm);
			ls.setOpaque(false);
			jsp=new JScrollPane(ls);
			jsp.setBounds(46,145,200,200);
        			fr.add(jsp);
			rs.close();
			con.close();
			}
			catch(Exception e)
			{
				System.out.print(e);
				l2.setText("Error! no such database exist");
			}
			
			fr.setVisible(true);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		try 
		{
			String dat=ls.getSelectedValue().toString();
			String datas=data;
			Vector columnNames = new Vector();
			Vector data = new Vector();			
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("use "+datas+" ");
			ps.executeQuery();
			ps = con.prepareStatement("select * from "+dat+" ");
			ResultSet rs=ps.executeQuery();	
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();
			l2.setText("");
			for (int i = 1; i <= columns; i++)
			{
			columnNames.addElement( md.getColumnName(i) );
			}
			while (rs.next())	
			{
			Vector row = new Vector(columns);
			for (int i = 1; i <= columns; i++)
			{
			row.addElement( rs.getObject(i) );
			}
			data.addElement( row );
			}
			
			con.close();
			rs.close();
			table = new JTable(data,columnNames);
			TableColumn col;
			for (int i = 0; i < table.getColumnCount(); i++)
			 {
			col = table.getColumnModel().getColumn(i);
			col.setMaxWidth(250);
			}

			jsp1 = new JScrollPane(table);
			jsp1.setBounds(320,145,520,200);
			fr.add(jsp1);
			
		}
			catch(Exception e)
			{
				System.out.println(e);
				l2.setText("Select table name from list");
			}
	}

		if(ae.getSource()==b2)
	{
		try 
		{
			String dat=ls.getSelectedValue().toString();
			String datas=data;
			Vector columnNames = new Vector();
			Vector data = new Vector();			
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("use "+datas+" ");
			ps.executeQuery();
			ps = con.prepareStatement("desc "+dat+"");
			ResultSet rs=ps.executeQuery();	
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();
			l2.setText("");
			for (int i = 1; i <= columns; i++)
			{
			columnNames.addElement( md.getColumnName(i) );
			}
			while (rs.next())	
			{
			Vector row = new Vector(columns);
			for (int i = 1; i <= columns; i++)
			{
			row.addElement( rs.getObject(i) );
			}
			data.addElement( row );
			}
			
			con.close();
			rs.close();
			table = new JTable(data,columnNames);
			TableColumn col;
			for (int i = 0; i < table.getColumnCount(); i++)
			 {
			col = table.getColumnModel().getColumn(i);
			col.setMaxWidth(250);
			}

			jsp1 = new JScrollPane(table);
			jsp1.setBounds(320,145,520,200);
			fr.add(jsp1);
			
		}
			catch(Exception e)
			{
				System.out.println(e);
				l2.setText("Select table name from list");
			}
	}
}
		
public static void main(String args[])
		{
		new usedb2(new JFrame(),"morning_batch");
		}
}
		
		
		