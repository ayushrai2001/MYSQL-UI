import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class home  implements ActionListener
{
int w,h;
JFrame fr;
JButton b1;
JPasswordField pf;
JLabel l2,l3,limg;

	public home()
	{
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr = new JFrame("MY SQL");
		fr.setLayout(null);
		fr.setBackground(Color.red);
		w = dim.width;
		h = dim.height;
		fr.setBounds((w-490)/2,(h-600)/2,450,600);	
		fr.setContentPane(new JLabel(new ImageIcon("images/sqlk.png")));
		
		b1= new JButton("   CONNECT",new ImageIcon("images/cnt.png"));
		b1.setToolTipText("connect to mysql");
		b1.setFont(new Font("verdana",Font.BOLD,15));
		b1.setForeground(Color.darkGray);
		b1.setBounds(130,410,170,30);
		fr.add(b1);
		b1.addActionListener(this);
		
		pf=new JPasswordField();
		pf.setFont(new Font("verdana",Font.BOLD,15));
		pf.setForeground(Color.black);
		pf.setBounds(120,300,200,35);
		fr.add(pf);
		pf.setMargin(new Insets(0, 5, 0, 0));
		pf.setOpaque(false);
		pf.setCaretColor(Color.orange);
		pf.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				l2.setText("");
			}
			
		});

		l2 = new JLabel("");
		l2.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,15));
		l2.setForeground(Color.blue);
		l2.setBounds(130,350,250,40);
		fr.add(l2);
		
		l3 = new JLabel("ENTER PASSWORD");
		l3.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,10));
		l3.setForeground(Color.red);
		l3.setBounds(155,335,250,30);
		fr.add(l3);
		
		limg = new JLabel(new ImageIcon("images/sql.png"));
		limg.setBounds(110,110,250,170);		
		fr.add(limg);

		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent ae)
		{
		if(ae.getSource()==b1)
		{

			if(pf.getText().equals("ayush"))
			{
				l2.setText("");
				//fr.setEnabled(false);
				fr.dispose();
				new database();
				
				
			}
			else
			{
				l2.setText("Oops! Invalid password");
			}
		}
}

		
		public static void main(String args[])
		{
		new home();
		}
}
		
		
		