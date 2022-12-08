package sys2_2.view.Instructor;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import sys2_2.model.Admin;
import sys2_2.service.AdminService;
import sys2_2.service.impl.AdminServiceImpl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddAssistantInterFrm extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField name;
	private JTextField npassword;
	private static AdminService adminService = new AdminServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAssistantInterFrm frame = new AddAssistantInterFrm();
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
	public AddAssistantInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setTitle("\u6DFB\u52A0\u5B66\u751F\u52A9\u7406");
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("\u52A9\u7406\u59D3\u540D\uFF1A");
		
		name = new JTextField();
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u767B\u5F55\u5BC6\u7801\uFF1A");
		
		npassword = new JTextField();
		npassword.setColumns(10);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				addassiatantPerformed(e);
			}
		});
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValuePerformed(e);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(npassword, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_1))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(90)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(npassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(65))
		);
		getContentPane().setLayout(groupLayout);

	}
	/**
	 * 重置事件处理
	 * @param evt
	 */
private void resetValuePerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		this.resetValue();
	}

/**
 * 添加事件处理
 * @param e
 */
	private void addassiatantPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setName(this.name.getText());
		admin.setPassword(this.npassword.getText());
		if(adminService.saveAdmin(admin)>0) {
			JOptionPane.showMessageDialog(null, "添加成功");
			resetValue();
		}else {
			JOptionPane.showMessageDialog(null, "添加失败");
		}
	}
	/**
	 * 重置方法
	 */
private void resetValue() {
	this.name.setText("");
	this.npassword.setText("");
}
	
}
