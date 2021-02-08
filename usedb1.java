import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class usedb1  implements  ActionListener  
{
JFrame fr,fg;
JMenuBar mb;
JMenu operation;
JMenuItem m1,m2,m3,m5,m6,m7,m8,m9;
JLabel l11;
JToolBar tool;
JButton b1,b2,b3,b5,b6,b7,b8;
JPopupMenu pop;
JMenuItem mnu1,mnu2,mnu3,mnu5,mnu6,mnu7,mnu8;
int w,h;
String data;

	public usedb1(JFrame y,String da)
	{
		fg = y;
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		w = dim.width;
		h = dim.height;
		fr = new JFrame("DATABASE");
		fr.setBounds(0,0,w,h);
		fr.setLayout(null);
		fr.setContentPane(new JLabel(new ImageIcon("images/sq1.jpg")));
		fr.setSize(dim.width,dim.height);
		data=da;	
	
  		l11 = new JLabel(new ImageIcon("images/back.png"));
		l11.setBounds(1310,4,32,32);
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
				fg.setEnabled(true);
				fr.dispose();
			}
		});
		fr.add(l11);


		mb = new JMenuBar();
		mb.setBounds(1,1,dim.width,30);
		operation = new JMenu("Operations");
		operation.setFont(new Font("verdana",Font.BOLD,16));
	
		m1 = new JMenuItem("  Create table ");
		m2 = new JMenuItem("  Show tables  ");
		m3 = new JMenuItem("  Delete table ");		
		m5 = new JMenuItem("  Rename table  ");
		m7 = new JMenuItem("  Insert data  ");
		m8 = new JMenuItem("  Modify data  ");
		m9 = new JMenuItem("  Add column  ");
		m6 = new JMenuItem("  Exit  ");

		m1.setFont(new Font("verdana",Font.BOLD,16));
		m2.setFont(new Font("verdana",Font.BOLD,16));
		m3.setFont(new Font("verdana",Font.BOLD,16));		
		m5.setFont(new Font("verdana",Font.BOLD,16));
		m6.setFont(new Font("verdana",Font.BOLD,16));
		m7.setFont(new Font("verdana",Font.BOLD,16));
		m8.setFont(new Font("verdana",Font.BOLD,16));
		m9.setFont(new Font("verdana",Font.BOLD,16));
				

		m1.setIcon(new ImageIcon("images/cre.png"));
		m2.setIcon(new ImageIcon("images/search.png"));
		m3.setIcon(new ImageIcon("images/remove.png"));		
		m5.setIcon(new ImageIcon("images/rename.png"));
		m7.setIcon(new ImageIcon("images/ins.png"));
		m6.setIcon(new ImageIcon("images/exit.png"));
		m8.setIcon(new ImageIcon("images/edit1.png"));
		m9.setIcon(new ImageIcon("images/add.png"));
		

		m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,Event.CTRL_MASK));
		m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.CTRL_MASK));
		m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,Event.CTRL_MASK));
		m5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,Event.CTRL_MASK));
		m7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,Event.CTRL_MASK));
		m6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,Event.CTRL_MASK));
		m8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,Event.CTRL_MASK));
		m9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,Event.CTRL_MASK));
				

		m1.setMnemonic ((int)'I');
		m2.setMnemonic ((int)'S');
		m3.setMnemonic ((int)'R');
		m5.setMnemonic ((int)'D');
		m6.setMnemonic ((int)'E');
		m7.setMnemonic ((int)'V');
		m8.setMnemonic ((int)'M');
		m9.setMnemonic ((int)'A');
				


		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);		
		m5.addActionListener(this);
		m6.addActionListener(this);
		m7.addActionListener(this);
		m8.addActionListener(this);
		m9.addActionListener(this);
		

		operation.add(m1);
		operation.addSeparator();
		operation.add(m2);
		operation.addSeparator();
		operation.add(m7);
		operation.addSeparator();
		operation.add(m8);
		operation.addSeparator();	
		operation.add(m3);
		operation.addSeparator();		
		operation.add(m5);
		operation.addSeparator();
		operation.add(m9);
		operation.addSeparator();
		operation.add(m6);
		mb.add(operation);
		fr.add(mb);

		tool = new JToolBar("Operation");
		tool.setBounds(1,31,dim.width,40);
		tool.setBackground(Color.gray);
		fr.add(tool);
		b1 = new JButton(new ImageIcon("images/cre.png"));
		b2 = new JButton(new ImageIcon("images/search.png"));
		b3 = new JButton(new ImageIcon("images/remove.png"));		
		b6 = new JButton(new ImageIcon("images/ins.png"));		
		b5 = new JButton(new ImageIcon("images/rename.png"));
		b7 = new JButton(new ImageIcon("images/edit1.png"));		
		b8 = new JButton(new ImageIcon("images/add.png"));		
		
		

		b1.setToolTipText("create table");
		b2.setToolTipText("show table");
		b3.setToolTipText("delete table");		
		b5.setToolTipText("rename table");
		b6.setToolTipText("insert data");
		b7.setToolTipText("modify data");
		b8.setToolTipText("add column");
		
			
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);		
		b5.addActionListener(this);
		b6.addActionListener(this);		
		b7.addActionListener(this);
		b8.addActionListener(this);
		

		tool.add(b1);
		tool.add(b2);
		tool.add(b6);
		tool.add(b7);
		tool.add(b3);		
		tool.add(b5);
		tool.add(b8);
		
	
		pop = new JPopupMenu();
		mnu1 = new JMenuItem("  Create table");	
		mnu2 = new JMenuItem("  Show table");	
		mnu3 = new JMenuItem("  Delete table");	
		mnu5 = new JMenuItem("  Rename table");	
		mnu6 = new JMenuItem("  Insert data");	
		mnu7 = new JMenuItem("  Modify data");	
		mnu8 = new JMenuItem("  Add column");	
	
		mnu1.setIcon(new ImageIcon("images/cre.png"));
		mnu2.setIcon(new ImageIcon("images/search.png"));
		mnu3.setIcon(new ImageIcon("images/remove.png"));	
		mnu5.setIcon(new ImageIcon("images/rename.png"));
		mnu6.setIcon(new ImageIcon("images/ins.png"));
		mnu7.setIcon(new ImageIcon("images/edit1.png"));
		mnu8.setIcon(new ImageIcon("images/add.png"));
				
	
		mnu1.addActionListener(this);
		mnu2.addActionListener(this);
		mnu3.addActionListener(this);
		mnu6.addActionListener(this);
		mnu5.addActionListener(this);
		mnu7.addActionListener(this);
		mnu8.addActionListener(this);

		pop.add(mnu1);
		pop.add(mnu2);
		pop.add(mnu6);
		pop.add(mnu7);
		pop.add(mnu3);
		pop.add(mnu5);
		pop.add(mnu8);
		
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.addMouseListener(new MouseAdapter()
		{
			public void cat(MouseEvent me)
			{
				if(me.isPopupTrigger())
				{
					pop.show(fr,me.getX(),me.getY());
				}	
			}
			public void mousePressed(MouseEvent me)
			{
				cat(me);	
			}
			public void mouseReleased(MouseEvent me)
			{
				cat(me);
			}
		});
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==m1||ae.getSource()==mnu1||ae.getSource()==b1)
		{
			fr.setEnabled(false);
			new create(fr,data);
		}
		if(ae.getSource()==m2||ae.getSource()==mnu2||ae.getSource()==b2)
		{
			fr.setEnabled(false);
			new usedb2(fr,data);	
		}
		if(ae.getSource()==m3||ae.getSource()==mnu3||ae.getSource()==b3)
		{
			fr.setEnabled(false);
			new delete(fr,data);	
		}
		if(ae.getSource()==m7||ae.getSource()==mnu6||ae.getSource()==b6)
		{
			fr.setEnabled(false);
			new insert(fr,data);
		}
		if(ae.getSource()==m5||ae.getSource()==mnu5||ae.getSource()==b5)
		{
			fr.setEnabled(false);
			new rename(fr,data);	
		}
		if(ae.getSource()==m8||ae.getSource()==mnu7||ae.getSource()==b7)
		{
			fr.setEnabled(false);
			new modify(fr,data);		
		}
		if(ae.getSource()==m6)
		{
			fr.dispose();
			fg.setEnabled(true);
		}
		if(ae.getSource()==m9||ae.getSource()==mnu8||ae.getSource()==b8)
		{
			fr.setEnabled(false);
			new add(fr,data);
		}
	}

	public static void main(String args[])
	{
		new usedb1(new JFrame(),"3tier");
	}
}