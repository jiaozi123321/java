package sys2_2.view.Mangement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import sys2_2.view.AboutInterFrm;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagementFrm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JDesktopPane table =null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagementFrm frame = new ManagementFrm();
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
	public ManagementFrm() {
		setTitle("\u5BDD\u5BA4\u7BA1\u7406\u5458\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u8F85\u5BFC\u5458\u64CD\u4F5C\u83DC\u5355");
		mnNewMenu.setIcon(new ImageIcon(ManagementFrm.class.getResource("/sys2_2/imges/\u83DC\u5355.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u67E5\u8BE2\u5BDD\u5BA4\u5165\u4F4F\u4FE1\u606F");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetDormitoryInterFrm getDormitoryInterFrm=new GetDormitoryInterFrm();
				getDormitoryInterFrm.setVisible(true);
				table.add(getDormitoryInterFrm);
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(ManagementFrm.class.getResource("/sys2_2/imges/\u67E5\u8BE2.png")));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u5220\u9664\u5B66\u751F\u5E8A\u4F4D\u4FE1\u606F");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudentInterFrm deletstudentInterFrm=new DeleteStudentInterFrm();
				deletstudentInterFrm.setVisible(true);
				table.add(deletstudentInterFrm);
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon(ManagementFrm.class.getResource("/sys2_2/imges/\u5220\u96642.png")));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u65B0\u589E\u5B66\u751F\u5165\u4F4F\u4FE1\u606F");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveStudentInterFrm savestudentInterFrm=new SaveStudentInterFrm();
				savestudentInterFrm.setVisible(true);
				table.add(savestudentInterFrm);
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon(ManagementFrm.class.getResource("/sys2_2/imges/\u589E\u52A0.png")));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u7EDF\u8BA1\u5F53\u5929\u672A\u5F52\u4FE1\u606F");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListStuNbackInterFrm lisStuNbackInterFrm=new ListStuNbackInterFrm();
				lisStuNbackInterFrm.setVisible(true);
				table.add(lisStuNbackInterFrm);
			}
		});
		mntmNewMenuItem_5.setIcon(new ImageIcon(ManagementFrm.class.getResource("/sys2_2/imges/ico_\u6570\u636E\u67E5\u8BE2\u4E0E\u7EDF\u8BA1_\u4FDD\u6D01\u5DE5\u4F5C\u7EDF\u8BA1.png")));
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出系统？");
				if(result==0){
					dispose();
				}
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(ManagementFrm.class.getResource("/sys2_2/imges/\u5B89\u5168\u9000\u51FA.png")));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("\u5173\u4E8E\u6211\u4EEC");
		mnNewMenu_1.setIcon(new ImageIcon(ManagementFrm.class.getResource("/sys2_2/imges/\u5173\u4E8E\u6211\u4EEC.png")));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u5F00\u53D1\u5C0F\u7EC4\u4E0E\u7CFB\u7EDF");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutInterFrm aboutInterFrm=new AboutInterFrm();
				aboutInterFrm.setVisible(true);
				table.add(aboutInterFrm);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		table = new JDesktopPane();
		table.setBackground(Color.GRAY);
		getContentPane().add(table, BorderLayout.CENTER);
		//设置界面最大化
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
	}

}
