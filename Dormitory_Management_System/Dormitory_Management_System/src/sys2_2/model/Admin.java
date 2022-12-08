package sys2_2.model;

public class Admin {
	private int id;				//’À∫≈id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	private String name;		//’À∫≈
	private String password;	//’À∫≈√‹¬Î
	private int kind;			//’Àªß¿‡–Õ
	public Object[] getArrays() {
		Object[] obj= {name,password};
		return obj;
	}
	@Override
	public String toString() {
		return  password;
	}
	public int toStringTow() {
		return kind;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String name, String password, int kind) {
		super();
		this.name = name;
		this.password = password;
		this.kind = kind;
	}
	
	
}
