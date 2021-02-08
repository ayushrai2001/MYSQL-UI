import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class msg3
{
int w,h;
JFrame fr,f1;
JLabel l2,l11;

	public msg3(JFrame ff)
	{

		f1=ff;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("MY SQL");
		fr.setLayout(null);
		fr.setBackground(Color.gray);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-320)/2,(h-200)/2,300,150);	
		fr.setContentPane(new JLabel(new ImageIcon("images/laku3.png")));
		
		
		l2 = new JLabel("record inserted succesfully....");
		l2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,13));
		l2.setForeground(Color.magenta);
		l2.setBounds(32,47,250,40);
		fr.add(l2);
		
	
		
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
		new msg3(new JFrame());
		}
}
		
		
		