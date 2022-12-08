package sys2_2.view.Mangement;

import java.awt.EventQueue;
import java.util.List;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sys2_2.model.Dormitory;
import sys2_2.model.Student;
import sys2_2.service.DormitoryService;
import sys2_2.service.impl.DormitoryServiceImpl;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GetDormitoryInterFrm extends JInternalFrame {
	private static DormitoryService dormitoryService = new DormitoryServiceImpl();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable studentTabl;
	private JTextField buid_num;
	private JTextField b_num;
	private JTextField dor_num;
	private JButton btnNewButton;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetDormitoryInterFrm frame = new GetDormitoryInterFrm();
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
	public GetDormitoryInterFrm() {
		setClosable(true);
		setIconifiable(true);
		setTitle("\u67E5\u8BE2\u5BDD\u5BA4\u5165\u4F4F\u4FE1\u606F");
		setBounds(100, 100, 476, 300);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("\u697C\u53F7\uFF1A");
		
		buid_num = new JTextField();
		buid_num.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u697C\u5C42\uFF1A");
		
		b_num = new JTextField();
		b_num.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5BDD\u5BA4\u53F7\uFF1A");
		
		dor_num = new JTextField();
		dor_num.setColumns(10);
		
		btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getdormitorySearchActionPerformed(e);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buid_num, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(b_num, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dor_num, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(buid_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(b_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(dor_num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(43)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(56, Short.MAX_VALUE))
		);
		
		studentTabl = new JTable();
		studentTabl.setModel(new DefaultTableModel(
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
		studentTabl.getColumnModel().getColumn(1).setPreferredWidth(80);
		scrollPane.setViewportView(studentTabl);
		getContentPane().setLayout(groupLayout);

		this.fillTable(new Dormitory());
	}
	
	/**
	 * 查询事件处理
	 * @param evt
	 */
	protected void getdormitorySearchActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		Dormitory dormitory=new Dormitory();
		dormitory.setBulid_num(this.buid_num.getText());
		dormitory.setB_num(this.b_num.getText());
		dormitory.setDor_num(this.dor_num.getText());
		this.fillTable(dormitory);
	}

	private void fillTable(Dormitory dormitory) {
		DefaultTableModel dtm= (DefaultTableModel) studentTabl.getModel();
		dtm.setRowCount(0);//清空表格
		//Dormitory dormitory=new Dormitory();
		//dormitory.setBulid_num();
		//dormitory.setB_num("1");
		//dormitory.setDor_num("111");
		List<Student> list =dormitoryService.getStudentDormitory(dormitory);
	
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
