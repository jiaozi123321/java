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

import sys2_2.model.Student;
import sys2_2.service.StudentService;
import sys2_2.service.impl.StudentServiceImpl;

public class ListStuNbackInterFrm extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private static StudentService studentService = new StudentServiceImpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListStuNbackInterFrm frame = new ListStuNbackInterFrm();
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
	public ListStuNbackInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setTitle("\u7EDF\u8BA1\u5F53\u5929\u6240\u6709\u672A\u5F52\u5B66\u751F\u4FE1\u606F");
		setBounds(100, 100, 450, 300);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5B66\u53F7", "\u59D3\u540D", "\u5BDD\u5BA4\u53F7", "\u5E8A\u4F4D\u53F7", "\u7535\u8BDD", "\u8F85\u5BFC\u5458\u53F7", "\u73ED\u7EA7", "\u8003\u52E4"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);

		this.fillTable();
	}
	private void fillTable() {
		DefaultTableModel dtm= (DefaultTableModel) table.getModel();
		dtm.setRowCount(0);//Çå¿Õ±í¸ñ
		List<Student> list =studentService.listStudentNoback();
	
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
