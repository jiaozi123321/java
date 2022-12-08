package sys2_2.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sys2_2.model.Admin;
import sys2_2.service.AdminService;
import sys2_2.service.impl.AdminServiceImpl;
import sys2_2.util.StringUtil;
import sys2_2.view.Admin.AdminFrm;
import sys2_2.view.Assistant.AssistantFrm;
import sys2_2.view.Instructor.InstructotFrm;
import sys2_2.view.Mangement.ManagementFrm;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogONFrm extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//private static Scanner sc = new Scanner(System.in);
	private static AdminService adminService = new AdminServiceImpl();

	private JPanel contentPane;
	private JTextField userNameTxt;
	private JPasswordField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogONFrm frame = new LogONFrm();
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
	public LogONFrm() {
		setResizable(false);
		setTitle("\u767B\u5F55\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5BDD\u5BA4\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 19));
		lblNewLabel.setIcon(new ImageIcon(LogONFrm.class.getResource("/sys2_2/imges/\u5BBF\u820D\u7BA1\u7406 (1).png")));
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel_1.setFont(new Font("黑体", Font.PLAIN, 12));
		lblNewLabel_1.setIcon(new ImageIcon(LogONFrm.class.getResource("/sys2_2/imges/\u7528\u6237\u540D.png")));
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6  \u7801\uFF1A");
		lblNewLabel_2.setFont(new Font("黑体", Font.PLAIN, 12));
		lblNewLabel_2.setIcon(new ImageIcon(LogONFrm.class.getResource("/sys2_2/imges/\u5BC6\u7801.png")));
		
		userNameTxt = new JTextField();
		userNameTxt.setColumns(10);
		
		passwordTxt = new JPasswordField();
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setFont(new Font("黑体", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logActionPerformed(e);
			}
		});
		btnNewButton.setIcon(new ImageIcon(LogONFrm.class.getResource("/sys2_2/imges/\u767B\u5F55.png")));
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.setFont(new Font("黑体", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetVlueActionPerforme(e);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(LogONFrm.class.getResource("/sys2_2/imges/_\u91CD\u7F6E.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(83)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(btnNewButton)
							.addComponent(lblNewLabel_2))
						.addComponent(lblNewLabel_1))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(51)
							.addComponent(btnNewButton_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(userNameTxt, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(passwordTxt, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
					.addGap(110))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(152, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(118))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(userNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(passwordTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(47))
		);
		contentPane.setLayout(gl_contentPane);
		//设置窗口居中显示
		this.setLocationRelativeTo(null);
	}

	
	
	/**
	 * 登录事件处理
	 * @param e
	 */
	private void logActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String userName =this.userNameTxt.getText();
		String password =new String(this.passwordTxt.getPassword());
		if(StringUtil.isEmpty(userName)) {
			JOptionPane.showMessageDialog(null, "用户名不能为空");
			return;
		}
		if(StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码不能为空");
			return;
		}
		//User user=new User()
		//Admin admin=new Admin();
		Admin admin=null;
		admin = adminService.getAdmin(userName);
		if(password.equals(admin.toString())) {
			//JOptionPane.showMessageDialog(null, "登录成功");
			dispose();
			switch(admin.toStringTow()) {
			case 1:new AdminFrm().setVisible(true);break;//系统管理员登录
			case 2:new ManagementFrm().setVisible(true);break;//宿管登录
			case 3:new InstructotFrm().setVisible(true);break;//辅导员登录
			case 4:new  AssistantFrm().setVisible(true);break;//学生助理登录
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "用户名或密码错误！");
		}
	}

	/**
	 * 重置事件处理
	 * @param e
	 */
	private void resetVlueActionPerforme(ActionEvent evt) {
		// TODO Auto-generated method stub
		this.userNameTxt.setText("");
		this.passwordTxt.setText("");
	}
}
