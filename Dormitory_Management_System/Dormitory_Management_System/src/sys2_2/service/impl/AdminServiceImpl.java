package sys2_2.service.impl;

import sys2_2.dao.AdminDao;
import sys2_2.dao.impl.AdminDaoImpl;
import sys2_2.model.Admin;
import sys2_2.service.AdminService;

public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao = new AdminDaoImpl();
	@Override
	public int saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.saveAdmin(admin);
	}
	@Override
	public Admin getAdmin(String name) {
		// TODO Auto-generated method stub
		return adminDao.getAdmin(name);
	}

}
