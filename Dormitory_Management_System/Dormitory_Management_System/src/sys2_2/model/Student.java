package sys2_2.model;

public class Student {
	private String stu_num;
	private String stu_name;
	private String stu_dor_num;
	private int stu_bed;
	private long  stu_tel;
	private String stu_cid;
	private String stu_class;
	private int stu_back;
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_dor_num() {
		return stu_dor_num;
	}
	public void setStu_dor_num(String stu_dor_num) {
		this.stu_dor_num = stu_dor_num;
	}
	public int getStu_bed() {
		return stu_bed;
	}
	public void setStu_bed(int stu_bed) {
		this.stu_bed = stu_bed;
	}
	public long getStu_tel() {
		return stu_tel;
	}
	public void setStu_tel(long stu_tel) {
		this.stu_tel = stu_tel;
	}
	public String getStu_cid() {
		return stu_cid;
	}
	public void setStu_cid(String stu_cid) {
		this.stu_cid = stu_cid;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	public int getStu_back() {
		return stu_back;
	}
	public void setStu_back(int stu_back) {
		this.stu_back = stu_back;
	}
	@Override
	public String toString() {
		return "学生信息 [学号=" + stu_num + ", 姓名=" + stu_name + ", 宿舍号=" + stu_dor_num + ", 床位号="
				+ stu_bed + ", 电话=" + stu_tel + ", 辅导员号=" + stu_cid + ", 班级=" + stu_class + ", 考勤="
				+ stu_back + "]";
	}
	public Object[] getArrys() {
		Object[] obj= {stu_num,stu_name,stu_dor_num,stu_bed,stu_tel,stu_cid,stu_class,stu_back};
		return obj;
	}
}
