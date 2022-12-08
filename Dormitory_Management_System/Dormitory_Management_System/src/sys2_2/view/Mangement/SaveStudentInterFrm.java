package sys2_2.view.Mangement;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import sys2_2.model.Student;
import sys2_2.service.StudentService;
import sys2_2.service.impl.StudentServiceImpl;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaveStudentInterFrm extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField stu_num;
	private JTextField stu_name;
	private JTextField stu_dor_num;
	private JTextField stu_bed;
	private JTextField stu_tel;
	private JTextField stu_cid;
	private JTextField stu_class;
	private JTextField stu_back;
	private static StudentService studentService = new StudentServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaveStudentInterFrm frame = new SaveStudentInterFrm();
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
	public SaveStudentInterFrm() {
		setTitle("\u65B0\u589E\u5B66\u751F\u5165\u4F4F\u4FE1\u606F");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("\u5B66  \u53F7\uFF1A  ");
		
		JLabel lblNewLabel_1 = new JLabel("\u59D3  \u540D\uFF1A  ");
		
		JLabel lblNewLabel_2 = new JLabel("\u5BBF\u820D\u53F7\uFF1A  ");
		
		JLabel lblNewLabel_3 = new JLabel("\u5E8A  \u4F4D\uFF1A  ");
		
		JLabel lblNewLabel_4 = new JLabel("\u624B\u673A\u53F7\uFF1A");
		
		JLabel lblNewLabel_5 = new JLabel("\u8F85\u5BFC\u5458\u7F16\u53F7\uFF1A");
		
		JLabel lblNewLabel_6 = new JLabel("\u73ED  \u7EA7\uFF1A  ");
		
		JLabel lblNewLabel_7 = new JLabel("\u8003\u52E4\u72B6\u6001\uFF1A");
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				savestudentActionPerformed(e);
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		
		stu_num = new JTextField();
		stu_num.setColumns(10);
		
		stu_name = new JTextField();
		stu_name.setColumns(10);
		
		stu_dor_num = new JTextField();
		stu_dor_num.setColumns(10);
		
		stu_bed = new JTextField();
		stu_bed.setToolTipText("");
		stu_bed.setColumns(10);
		
		stu_tel = new JTextField();
		stu_tel.setColumns(10);
		
		stu_cid = new JTextField();
		stu_cid.setColumns(10);
		
		stu_class = new JTextField();
		stu_class.setColumns(10);
		
		stu_back = new JTextField();
		stu_back.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(105)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addGap(18))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_6)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(btnNewButton)
									.addComponent(lblNewLabel_7)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(stu_back, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
							.addComponent(stu_class, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
							.addComponent(stu_cid, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
							.addComponent(stu_tel, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
							.addComponent(stu_num, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
							.addComponent(stu_name, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
							.addComponent(stu_dor_num, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
							.addComponent(stu_bed, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
					.addGap(149))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(stu_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(stu_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(stu_dor_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(stu_bed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(stu_tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(stu_cid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(stu_class, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(stu_back, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		

	}
	/**
	 * 新增学生信息事件处理
	 * @param e
	 */
	private void savestudentActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStu_num(this.stu_num.getText());
		student.setStu_name(this.stu_name.getText());
		student.setStu_dor_num(this.stu_dor_num.getText());
		student.setStu_bed(Integer.parseInt(this.stu_bed.getText()));
		student.setStu_tel(Long.parseLong(this.stu_tel.getText()));
		student.setStu_cid(this.stu_cid.getText());
		student.setStu_class(this.stu_class.getText());
		student.setStu_back(Integer.parseInt(this.stu_back.getText()));
//		if(StringUtil.isEmpty(student.getStu_num())) {
//			JOptionPane.showMessageDialog(null, "学号不能为空");
//			return;
//		}
//		if(StringUtil.isEmpty(student.getStu_name())) {
//			JOptionPane.showMessageDialog(null, "姓名不能为空");
//			return;
//		}
//		if(StringUtil.isEmpty(student.getStu_dor_num())) {
//			JOptionPane.showMessageDialog(null, "宿舍号不能为空");
//			return;
//		}
//		if(StringUtil.isEmpty(Integer.toString(student.getStu_bed()))) {
//			JOptionPane.showMessageDialog(null, "床位号不能为空");
//			return;
//		}
//		if(StringUtil.isEmpty(Long.toString(student.getStu_tel()))) {
//			JOptionPane.showMessageDialog(null, "电话不能为空");
//			return;
//		}
//		if(StringUtil.isEmpty(student.getStu_cid())) {
//			JOptionPane.showMessageDialog(null, "辅导员编号不能为空");
//			return;
//		}
//		if(StringUtil.isEmpty(student.getStu_class())) {
//			JOptionPane.showMessageDialog(null, "班级不能为空");
//			return;
//		}
//		if(StringUtil.isEmpty(Integer.toString(student.getStu_back()))) {
//			JOptionPane.showMessageDialog(null, "考勤不能为空");
//			return;
//		}
		
		if(studentService.saveStudent(student)>0) {
			JOptionPane.showMessageDialog(null, "添加成功");
			resetValue();
		}else {
			JOptionPane.showMessageDialog(null, "添加失败");
		}
		
		
	}

	/**
	 * 重置事件处理
	 * @param evt
	 */
	private void resetValueActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		this.resetValue();
		
	}

	/**
	 * 重置表单
	 */
	private void resetValue() {
		this.stu_num.setText("");
		this.stu_name.setText("");
		this.stu_dor_num.setText("");
		this.stu_bed.setText("");
		this.stu_tel.setText("");
		this.stu_cid.setText("");
		this.stu_class.setText("");
		this.stu_back.setText("");
	}
//	   //判断该对象是否有空
//    public static boolean isAllFieldNull(Object obj) throws Exception{
//        Class stuCla = (Class) obj.getClass();// 得到类对象
//        Field[] fs = stuCla.getDeclaredFields();//得到属性集合
//        boolean flag = true;
//        for (Field f : fs) {//遍历属性
//            f.setAccessible(true); // 设置属性是可以访问的(私有的也可以)
//            Object val = f.get(obj);// 得到此属性的值
//            if(val!=null) {//只要有1个属性不为空,那么就不是所有的属性值都为空
//                flag = false;
//                break;
//            }
//        }
//        return flag;
//    }

}
