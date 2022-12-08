package sys2_2.dao;

import sys2_2.model.Admin;

public interface AdminDao {
	public int saveAdmin(Admin admin);
	public Admin getAdmin(String name);
}
