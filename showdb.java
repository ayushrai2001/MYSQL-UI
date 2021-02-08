import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.DefaultListModel;

class showdb 
{
int w,h;
JLabel l1,limg;
JFrame fr,fk;
JList ls;
JScrollPane jsp;

	public showdb(JFrame ft)
	{
		fk=ft;
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("SHOW DATABASE");
		fr.setLayout(null);
		fr.setBackground(Color.white);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-700)/2,(h-600)/2,800,620);	
		fr.setContentPane(new JLabel(new ImageIcon("images/DATAS.png")));
		
		Color my=new Color(70,33,255);		

		 l1 = new JLabel("DATABASE");
		 l1.setFont(new Font("cooper black",Font.BOLD,50));
		 l1.setBounds(225,2,600,100);
		 l1.setForeground(my);
                                        fr.add(l1);
		 DefaultListModel<String>lm = new DefaultListModel<>();
        		 ls = new JList();
		 ls.setFont(new Font("verdana",Font.BOLD,50));
		 ls.setForeground(Color.red);


		limg = new JLabel(new ImageIcon("images/back.png"));
		limg.setBounds(740,1,30,30);
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
				new database();
				fr.dispose();
			}
		});
		fr.add(limg);


			
		try 
			{
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("show databases");
			ResultSet rs=ps.executeQuery();	
			ResultSetMetaData md = rs.getMetaData();
			while (rs.next())	
			 {
				lm.addElement(""+rs.getObject(1)+"");

			 }
			ls = new JList<>(lm);
			ls.setOpaque(false);
			jsp=new JScrollPane(ls);
			jsp.setBounds(60,110,280,200);
        			fr.add(jsp);
			
			con.close();
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
			
			//fr.setUndecorated(true);
			fr.setVisible(true);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

		
		public static void main(String args[])
		{
		new showdb(new JFrame());
		}
}
		
		
		