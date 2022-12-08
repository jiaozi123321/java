package sys2_2.view.Instructor;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sys2_2.model.Dormitory;
import sys2_2.model.Student;
import sys2_2.service.StudentService;
import sys2_2.service.impl.StudentServiceImpl;
import java.awt.event.ActionListener;

public class GetstuInterFrm extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField stu_class;
	private JTable stutable;
	private static StudentService studentService = new StudentServiceImpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetstuInterFrm frame = new GetstuInterFrm();
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
	public GetstuInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("\u73ED\u7EA7\uFF1A");
		
		stu_class = new JTextField();
		stu_class.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getstuSearchActionPerformed(e);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(93)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(stu_class, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(stu_class, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		
		stutable = new JTable();
		stutable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5B66\u53F7", "\u59D3\u540D", "\u5BDD\u5BA4\u53F7", "\u5E8A\u4F4D\u53F7", "\u7535\u8BDD", "\u8F85\u5BFC\u5458\u7F16\u53F7", "\u73ED\u7EA7", "\u8003\u52E4"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(stutable);
		getContentPane().setLayout(groupLayout);
//		String num_class="计科1";
//		this.fillTable(num_class);
	}
	/**
	 * 查询事件处理
	 * @param evt
	 */
	private void getstuSearchActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String num_class =null;
		num_class=this.stu_class.getText();
		this.fillTable(num_class);
	}

	
	private void fillTable(String num_class) {
		DefaultTableModel dtm= (DefaultTableModel) stutable.getModel();
		dtm.setRowCount(0);//清空表格
		//Dormitory dormitory=new Dormitory();
		//dormitory.setBulid_num();
		//dormitory.setB_num("1");
		//dormitory.setDor_num("111");
		List<Student> list = studentService.listClassStudent(num_class);
	
		if(!list.isEmpty()) {
			for(Student s:list) {
				Vector v=new Vector();
				v.add(s.getStu_num());
				v.add(s.getStu_name());
				v.add(s.getStu_dor_num());
				v.add(s.getStu_bed());
				v.add(s.getStu_tel());
				v.add(s.getStu_cid());
				v.add(s.getStu_class());
				v.add(s.getStu_back());
				dtm.addRow(v);
			}
		}
	}
}
