package sys2_2.model;

public class Dormitory {
	@Override
	public String toString() {
		return "������Ϣ [���Һ�=" + dor_num + ", ¥��=" + bulid_num + ", ¥��=" + b_num + ", ��������=" + kind
				+ "]";
	}
	private String dor_num;		//�����
	private String bulid_num;	//¥��
	private String b_num;		//¥��
	private int kind;			//��������
	
	public String getDor_num() {
		return dor_num;
	}
	public void setDor_num(String dor_num) {
		this.dor_num = dor_num;
	}
	public String getBulid_num() {
		return bulid_num;
	}
	public void setBulid_num(String bulid_num) {
		this.bulid_num = bulid_num;
	}
	public String getB_num() {
		return b_num;
	}
	public void setB_num(String b_num) {
		this.b_num = b_num;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public Object[] gerarrys() {
		Object[] obj= {kind,dor_num};
		return obj;
	}
	public Object[] getArryT() {
		Object[] obj= {bulid_num,b_num,dor_num};
		return obj;
	}
}
