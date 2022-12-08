package sys2_2.view.Instructor;

import java.awt.EventQueue;
import java.util.List;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sys2_2.model.Student;
import sys2_2.service.StudentService;
import sys2_2.service.impl.StudentServiceImpl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExportClassStudentInterFrm extends JInternalFrame {
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
					ExportClassStudentInterFrm frame = new ExportClassStudentInterFrm();
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
	public ExportClassStudentInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setTitle("\u5BFC\u51FA\u8D1F\u8D23\u73ED\u7EA7\u672A\u5F52\u5B66\u751F\u540D\u5355");
		setBounds(100, 100, 450, 300);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("\u73ED\u7EA7\uFF1A");
		
		stu_class = new JTextField();
		stu_class.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resrtPerformed(e);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(57)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(stu_class, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(63)
							.addComponent(btnNewButton)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(stu_class, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		stutable = new JTable();
		stutable.setModel(new DefaultTableModel(
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
		scrollPane.setViewportView(stutable);
		getContentPane().setLayout(groupLayout);

	}
	protected void resrtPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String num_class =null;
		num_class=this.stu_class.getText();
		this.fillTable(num_class);
		
	}

	private void fillTable(String num_class) {
		DefaultTableModel dtm= (DefaultTableModel) stutable.getModel();
		dtm.setRowCount(0);//Çå¿Õ±í¸ñ
		//Dormitory dormitory=new Dormitory();
		//dormitory.setBulid_num();
		//dormitory.setB_num("1");
		//dormitory.setDor_num("111");
		List<Student> list = studentService.listStudentCnoback(num_class);
	
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
