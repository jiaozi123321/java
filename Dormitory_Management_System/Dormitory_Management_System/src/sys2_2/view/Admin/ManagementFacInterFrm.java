package sys2_2.view.Admin;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import sys2_2.model.Dormitory;
import sys2_2.service.DormitoryService;
import sys2_2.service.impl.DormitoryServiceImpl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagementFacInterFrm extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField dor_num;
	private JTextField kind;
	private static DormitoryService dormitoryService = new DormitoryServiceImpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagementFacInterFrm frame = new ManagementFacInterFrm();
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
	public ManagementFacInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setTitle("\u7BA1\u7406\u5BDD\u5BA4");
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("\u5BDD\u5BA4\u53F7\uFF1A");
		
		dor_num = new JTextField();
		dor_num.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u529F\u80FD\u9009\u62E9\uFF1A");
		
		kind = new JTextField();
		kind.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("1\uFF1A\u80FD\u5165\u4F4F");
		
		JLabel lblNewLabel_3 = new JLabel("2\uFF1A\u4E0D\u80FD\u5165\u4F4F");
		
		JLabel lblNewLabel_4 = new JLabel("3\uFF1A\u529F\u80FD\u6027\u5BDD\u5BA4");
		
		JButton btnNewButton = new JButton("\u63D0\u4EA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagementPerformed(e);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dor_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_2)
						.addComponent(kind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(115, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(75)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(dor_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(kind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4)
					.addGap(44)
					.addComponent(btnNewButton)
					.addContainerGap(44, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

	private void ManagementPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		Dormitory dormitory = new Dormitory();
		dormitory.setDor_num(this.dor_num.getText());
		dormitory.setKind(Integer.parseInt(this.kind.getText()));
		if(dormitoryService.managementDormitory(dormitory)>0) {
			JOptionPane.showMessageDialog(null, "提交成功");
		}else {
			JOptionPane.showMessageDialog(null, "提交失败");
		}
	}

}
