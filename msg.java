import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class msg 
{
int w,h;
JFrame fr,f1;
JLabel l2,l3,l4,l11;
String data,tab;
	public msg(JFrame ff,String d1,String d2)
	{
		data=d1;
		tab=d2;
		f1=ff;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("MY SQL");
		fr.setLayout(null);
		fr.setBackground(Color.gray);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-320)/2,(h-200)/2,300,150);	
		fr.setContentPane(new JLabel(new ImageIcon("images/laku.png")));
		
		
		l2 = new JLabel("table created succesfully....");
		l2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,13));
		l2.setForeground(Color.magenta);
		l2.setBounds(20,25,250,40);
		fr.add(l2);
		
		l3 = new JLabel("TABLE NAME :-"+tab+"");
		l3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,13));
		l3.setForeground(Color.blue);
		l3.setBounds(20,60,250,30);
		fr.add(l3);
		
		l4 = new JLabel("DATABASE NAME:-"+data+"");
		l4.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,13));
		l4.setForeground(Color.blue);
		l4.setBounds(20,80,250,30);
		fr.add(l4);
		
		l11 = new JLabel(new ImageIcon("images/exit.png"));
		l11.setBounds(256,18,32,32);
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
				f1.setEnabled(true);
				fr.dispose();
			}
		});
		fr.add(l11);


		
		fr.setUndecorated(true);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
				
		public static void main(String args[])
		{
		new msg(new JFrame(),"hello","everyone");
		}
}
		
		
		