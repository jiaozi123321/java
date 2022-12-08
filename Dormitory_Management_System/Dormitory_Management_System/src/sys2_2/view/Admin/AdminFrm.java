package sys2_2.view.Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sys2_2.view.AboutInterFrm;
import sys2_2.view.Instructor.AddAssistantInterFrm;
import sys2_2.view.Instructor.EntryStudentInterFrm;
import sys2_2.view.Instructor.ExportClassStudentInterFrm;
import sys2_2.view.Mangement.DeleteStudentInterFrm;
import sys2_2.view.Mangement.GetDormitoryInterFrm;
import sys2_2.view.Mangement.ListStuNbackInterFrm;
import sys2_2.view.Mangement.SaveStudentInterFrm;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminFrm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane table =null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrm frame = new AdminFrm();
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
	public AdminFrm() {
		setTitle("\u7CFB\u7EDF\u7BA1\u7406\u5458\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u7CFB\u7EDF\u7BA1\u7406\u5458\u64CD\u4F5C\u83DC\u5355");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u67E5\u8BE2\u5BDD\u5BA4\u5165\u4F4F\u4FE1\u606F");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetDormitoryInterFrm getDormitoryInterFrm=new GetDormitoryInterFrm();
				getDormitoryInterFrm.setVisible(true);
				table.add(getDormitoryInterFrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5220\u9664\u5B66\u751F\u5E8A\u4F4D\u4FE1\u606F");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudentInterFrm deletstudentInterFrm=new DeleteStudentInterFrm();
				deletstudentInterFrm.setVisible(true);
				table.add(deletstudentInterFrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u65B0\u589E\u5B66\u751F\u5165\u4F4F\u4FE1\u606F");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveStudentInterFrm savestudentInterFrm=new SaveStudentInterFrm();
				savestudentInterFrm.setVisible(true);
				table.add(savestudentInterFrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u7EDF\u8BA1\u5F53\u5929\u6240\u6709\u5B66\u751F\u672A\u5F52\u4FE1\u606F");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListStuNbackInterFrm lisStuNbackInterFrm=new ListStuNbackInterFrm();
				lisStuNbackInterFrm.setVisible(true);
				table.add(lisStuNbackInterFrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u67E5\u8BE2\u73ED\u7EA7\u5BDD\u5BA4\u5B66\u751F\u4FE1\u606F");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntryStudentInterFrm entryStudentInterfrm=new EntryStudentInterFrm();
				entryStudentInterfrm.setVisible(true);
				table.add(entryStudentInterfrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u5F55\u5165\u5B66\u751F\u5F53\u5929\u5C31\u5BDD\u8BB0\u5F55");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntryStudentInterFrm entryStudentInterfrm=new EntryStudentInterFrm();
				entryStudentInterfrm.setVisible(true);
				table.add(entryStudentInterfrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\u5BFC\u51FA\u73ED\u7EA7\u591C\u4E0D\u5F52\u5BDD\u5B66\u751F\u540D\u5355");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExportClassStudentInterFrm exportclassstudentinterfrm=new ExportClassStudentInterFrm();
				exportclassstudentinterfrm.setVisible(true);
				table.add(exportclassstudentinterfrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("\u6DFB\u52A0\u5B66\u751F\u52A9\u7406");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAssistantInterFrm addassistantinterfrm =new AddAssistantInterFrm();
				addassistantinterfrm.setVisible(true);
				table.add(addassistantinterfrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("\u7BA1\u7406\u5BDD\u5BA4");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagementFacInterFrm managementfaceinterfrm=new ManagementFacInterFrm();
				managementfaceinterfrm.setVisible(true);
				table.add(managementfaceinterfrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出系统？");
				if(result==0){
					dispose();
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_9);
		
		JMenu mnNewMenu_1 = new JMenu("\u5173\u4E8E\u6211\u4EEC");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("\u5F00\u53D1\u5C0F\u7EC4\u4E0E\u7CFB\u7EDF");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutInterFrm aboutInterFrm=new AboutInterFrm();
				aboutInterFrm.setVisible(true);
				table.add(aboutInterFrm);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_10);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		table = new JDesktopPane();
		table.setBackground(Color.GRAY);
		getContentPane().add(table, BorderLayout.CENTER);
		//设置界面最大化
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
	}

}
