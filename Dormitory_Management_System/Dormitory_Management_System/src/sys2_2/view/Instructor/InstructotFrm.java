package sys2_2.view.Instructor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import sys2_2.view.AboutInterFrm;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InstructotFrm extends JFrame {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	//private JPanel contentPane;
	private JDesktopPane table =null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstructotFrm frame = new InstructotFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InstructotFrm() {
		setTitle("\u8F85\u5BFC\u5458\u7BA1\u7406\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u8F85\u5BFC\u5458\u64CD\u4F5C\u83DC\u5355");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u67E5\u8BE2\u8D1F\u8D23\u73ED\u7EA7\u7684\u5BDD\u5BA4\u5B66\u751F\u4FE1\u606F");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetstuInterFrm getstuInterFrm=new GetstuInterFrm();
				getstuInterFrm.setVisible(true);
				table.add(getstuInterFrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5F55\u5165\u5B66\u751F\u5F53\u5929\u5C31\u5BDD\u8BB0\u5F55");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntryStudentInterFrm entryStudentInterfrm=new EntryStudentInterFrm();
				entryStudentInterfrm.setVisible(true);
				table.add(entryStudentInterfrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u5BFC\u51FA\u8D1F\u8D23\u73ED\u7EA7\u672A\u5F52\u5B66\u751F\u540D\u5355");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExportClassStudentInterFrm exportclassstudentinterfrm=new ExportClassStudentInterFrm();
				exportclassstudentinterfrm.setVisible(true);
				table.add(exportclassstudentinterfrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u6DFB\u52A0\u5B66\u751F\u52A9\u7406");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAssistantInterFrm addassistantinterfrm =new AddAssistantInterFrm();
				addassistantinterfrm.setVisible(true);
				table.add(addassistantinterfrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出系统？");
				if(result==0){
					dispose();
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("\u5173\u4E8E\u6211\u4EEC");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u5F00\u53D1\u5C0F\u7EC4\u4E0E\u7CFB\u7EDF");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutInterFrm aboutInterFrm=new AboutInterFrm();
				aboutInterFrm.setVisible(true);
				table.add(aboutInterFrm);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		table = new JDesktopPane();
		table.setBackground(Color.GRAY);
		getContentPane().add(table, BorderLayout.CENTER);
		//设置界面最大化
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
	}
}
