package sys2_2.service;

import sys2_2.model.Admin;

public interface AdminService {
	public int saveAdmin(Admin admin);
	public Admin getAdmin(String name);
}
