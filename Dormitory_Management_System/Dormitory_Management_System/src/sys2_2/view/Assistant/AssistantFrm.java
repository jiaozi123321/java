package sys2_2.view.Assistant;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sys2_2.view.AboutInterFrm;
import sys2_2.view.Instructor.EntryStudentInterFrm;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AssistantFrm extends JFrame {
	private JDesktopPane table =null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssistantFrm frame = new AssistantFrm();
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
	public AssistantFrm() {
		setTitle("\u5B66\u751F\u52A9\u7406\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u64CD\u4F5C\u83DC\u5355");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u5F55\u5165\u672A\u5F52\u5B66\u751F\u4FE1\u606F");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntryStudentInterFrm entryStudentInterfrm=new EntryStudentInterFrm();
				entryStudentInterfrm.setVisible(true);
				table.add(entryStudentInterfrm);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出系统？");
				if(result==0){
					dispose();
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("\u5173\u4E8E\u6211\u4EEC");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u5F00\u53D1\u5C0F\u7EC4\u4E0E\u7CFB\u7EDF");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutInterFrm aboutInterFrm=new AboutInterFrm();
				aboutInterFrm.setVisible(true);
				table.add(aboutInterFrm);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		table = new JDesktopPane();
		table.setBackground(Color.GRAY);
		getContentPane().add(table, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
	}

}
