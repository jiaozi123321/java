package sys2_2.view.Mangement;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import sys2_2.service.StudentService;
import sys2_2.service.impl.StudentServiceImpl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStudentInterFrm extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField stu_num;
	private static StudentService studentService = new StudentServiceImpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudentInterFrm frame = new DeleteStudentInterFrm();
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
	public DeleteStudentInterFrm() {
		setClosable(true);
		setIconifiable(true);
		setTitle("\u5220\u9664\u5B66\u751F\u5E8A\u4F4D\u4FE1\u606F");
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u9700\u8981\u5220\u9664\u7684\u5B66\u751F\u5B66\u53F7\uFF1A");
		
		stu_num = new JTextField();
		stu_num.setColumns(10);
		
		JButton btnNewButton = new JButton("\u5220\u9664");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletstudentActionPerformed(e);
			}
		});
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(73)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(stu_num, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(48)
							.addComponent(btnNewButton)
							.addGap(39)
							.addComponent(btnNewButton_1)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(80)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(stu_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(60))
		);
		getContentPane().setLayout(groupLayout);

	}

	protected void deletstudentActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String stu_num=this.stu_num.getText();
		if(studentService.deleteStudent(stu_num)>0) {
			JOptionPane.showMessageDialog(null, "É¾³ý³É¹¦");
		}else {
			JOptionPane.showMessageDialog(null, "É¾³ýÊ§°Ü");
		}
	}

	private void resetValueActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		this.resetValue();
	}

	private void resetValue() {
		// TODO Auto-generated method stub
		this.stu_num.setText("");
	}
}
