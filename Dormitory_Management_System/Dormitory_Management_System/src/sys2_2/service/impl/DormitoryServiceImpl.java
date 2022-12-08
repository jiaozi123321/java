package sys2_2.service.impl;

import java.util.List;

import sys2_2.dao.DormitoryDao;
import sys2_2.dao.impl.DormitoryDaoImpl;
import sys2_2.model.Dormitory;
import sys2_2.model.Student;
import sys2_2.service.DormitoryService;

public class DormitoryServiceImpl implements DormitoryService{
	private DormitoryDao dormitoryDao =  new DormitoryDaoImpl();
	@Override
	public Dormitory getDormitory(String dor_num) {
		// TODO Auto-generated method stub
		return dormitoryDao.getDormitory(dor_num);
	}
	@Override
	public int managementDormitory(Dormitory dormitory) {
		// TODO Auto-generated method stub
		return dormitoryDao.managementDormitory(dormitory);
	}
	@Override
	public List<Student> getStudentDormitory(Dormitory dormitory) {
		// TODO Auto-generated method stub
		return dormitoryDao.getStudentDormitory(dormitory);
	}

}
