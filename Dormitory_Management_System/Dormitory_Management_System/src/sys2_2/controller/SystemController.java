package sys2_2.controller;

import java.util.List;
import java.util.Scanner;

import sys2_2.model.Admin;
import sys2_2.model.Dormitory;
import sys2_2.model.Student;
import sys2_2.service.AdminService;
import sys2_2.service.StudentService;
import sys2_2.service.DormitoryService;
import sys2_2.service.impl.AdminServiceImpl;
import sys2_2.service.impl.DormitoryServiceImpl;
import sys2_2.service.impl.StudentServiceImpl;

public class SystemController {
	private static Scanner sc = new Scanner(System.in);
	private static AdminService adminService = new AdminServiceImpl();
	private static StudentService studentService = new StudentServiceImpl();
	private static DormitoryService dormitoryService = new DormitoryServiceImpl();
	public static void main(String[] args) {
		Login();
	}
public static void Login() {
	int select = 0;
	System.out.println("***欢迎使用宿舍管理系统***");
	System.out.println("***输入<< 1 >>-登录系统***");
	System.out.println("***输入<< 0 >>-退出系统***");
	select = sc.nextInt();
	while(true) {
		switch(select) {
		case 1:getAdmin();break;
		case 0:Exit();
		}
		//System.out.println("退出系统！");
	}
}
public static void getAdmin(){
	String name =null;
	String password= null;
	Admin admin =null;
	System.out.println("请输入账号");
	name=sc.next();
	System.out.println("请输入密码");
	password = sc.next();
	admin = adminService.getAdmin(name);
if(password.equals(admin.toString())) {
	System.out.println("登录成功");
	try {
		Thread.sleep(500);
	} catch (Exception e) {
		
	}
	switch(admin.toStringTow()) {
	case 1:adminCreateFace();break;//系统管理员登录
	case 2:DmanagerCreateFace();break;//宿管登录
	case 3:InstructorCreatFace();break;//辅导员登录
	case 4:AssistantCreatFace();break;//学生助理登录
	}
	
}else {
	System.out.println("您输入的账号或密码有误！");
}
}
public static void adminCreateFace() {
	int select =0;
	System.out.println("系统管理员操作界面");
	System.out.println("1：查询寝室入住信息");
	System.out.println("2：删除学生床位信息");
	System.out.println("3：新增学生入住信息");
	System.out.println("4：统计当天所有未归学生信息");
	System.out.println("5：查询班级寝室学生信息");
	System.out.println("6：录入学生当天就寝记录");
	System.out.println("7：导出班级夜不归寝学生名单");
	System.out.println("8：添加学生助理");
	System.out.println("9：管理寝室");
	System.out.println("0：退出管理系统");
	while(true) {
		select = sc.nextInt();
		switch(select) {
		case 1:getDormitory();adminCreateFace();break;
		case 2:deleteStudent();adminCreateFace();break;
		case 3:saveStudent();adminCreateFace();break;
		case 4:listStudenNback();adminCreateFace();break;
		case 5:listClassStudent();adminCreateFace();break;
		case 6:EntryStudent();adminCreateFace();break;
		case 7:ExportClassStudent();adminCreateFace();break;
		case 8:AddAssistant();adminCreateFace();break;
		case 9:managementFac();adminCreateFace();break;
		case 0:Exit();
		}
	}
}
public static void managementFac() {
	Dormitory dormitory = new Dormitory();
	System.out.println("请输入要修改功能的寝室");
	dormitory.setDor_num(sc.next());
	System.out.println("1:能入住 2:不能入住 3:功能性寝室");
	System.out.println("请选择功能");
	dormitory.setKind(sc.nextInt());
	if(dormitoryService.managementDormitory(dormitory)>0) {
		System.out.println("修改成功");
	}else {
		System.out.println("修改失败");
	}
}
//宿管操作界面
public static void DmanagerCreateFace() {
	int select =0;
	System.out.println("1：查询寝室入住信息");
	System.out.println("2：删除学生床位信息");
	System.out.println("3：新增学生入住信息");
	System.out.println("4：统计当天所有未归学生信息");
	System.out.println("0：退出管理系统");
	
	while(true) {
		select = sc.nextInt();
		switch(select) {
		case 1:getDormitory();DmanagerCreateFace();break;
		case 2:deleteStudent();DmanagerCreateFace();break;
		case 3:saveStudent();DmanagerCreateFace();break;
		case 4:listStudenNback();DmanagerCreateFace();break;
		case 0:Exit();
		}
	}
}
public static void saveStudent() {
	Student student = new Student();
	System.out.println("请输入学号");
	student.setStu_num(sc.next());
	System.out.println("请输入姓名");
	student.setStu_name(sc.next());
	System.out.println("请输入宿舍号");
	student.setStu_dor_num(sc.next());
	System.out.println("请输入床位号");
	student.setStu_bed(sc.nextInt());
	System.out.println("请输入手机号");
	student.setStu_tel(sc.nextInt());
	System.out.println("请输入辅导员编号");
	student.setStu_cid(sc.next());
	System.out.println("请输入班级");
	student.setStu_class(sc.next());
	System.out.println("请输入考勤状态");
	student.setStu_back(sc.nextInt());
	if(studentService.saveStudent(student)>0) {
		System.out.println("添加成功");
		//DmanagerCreateFace();
	}else {
		System.out.println("添加失败");
		//DmanagerCreateFace();
	}
}
public static void deleteStudent() {
	String num =null;
	System.out.println("请输入想要删除的学号");
	num=sc.next();
	if(studentService.deleteStudent(num)>0) {
		System.out.println("删除成功");
	}else {
		System.out.println("删除失败");
	}
}
public static void getDormitory() {
	String stu_dor_num=null;
	Dormitory dormitory =null;
	System.out.println("请输入要查询的寝室号");
	stu_dor_num=sc.next();
	dormitory = dormitoryService.getDormitory(stu_dor_num);
	if(dormitory !=null) {
		System.out.println(dormitory.toString());
	}else {
		System.out.println("没有查到该寝室信息");
	}
}
public static void listStudenNback() {
	List<Student> list = studentService.listStudentNoback();
	if(!list.isEmpty()) {
		for(Student s:list) {
			System.out.println(s.toString());
		}
	}else {
		System.out.println("无未归人员");
	}
}
public static void Exit() {
	System.out.println("成功退出！");
	System.exit(0);
}
//辅导员操作界面
public static void InstructorCreatFace() {
	int select =0;
	System.out.println("1：查询班级寝室学生信息");
	System.out.println("2：录入学生当天就寝记录");
	System.out.println("3：导出班级夜不归寝学生名单");
	System.out.println("4：添加学生助理");
	System.out.println("0：退出管理系统");
	while(true) {
		select = sc.nextInt();
		switch(select) {
		case 1:listClassStudent();InstructorCreatFace();break;
		case 2:EntryStudent();InstructorCreatFace();break;
		case 3:ExportClassStudent();InstructorCreatFace();break;
		case 4:AddAssistant();InstructorCreatFace();break;
		case 0:Exit();
		}
	}
}
/*
 * 查询自身负责班级的寝室学生信息
 */
public static void listClassStudent() {
	String num_class =null;
	System.out.println("请输入查询班级");
	num_class=sc.next();
	List<Student> list = studentService.listClassStudent(num_class);
	if(!list.isEmpty()) {
		for(Student s:list) {
			System.out.println(s.toString());
		}
	}else {
		System.out.println("没有相关数据");
	}
}
/*
 * 录入学生当天就寝信息
 */
public static void EntryStudent() {
	String stu_num = null;
	System.out.println("请输入需要录入缺勤学生学号");
	stu_num = sc.next();
	if(studentService.updateSturing(stu_num)>0) {
		System.out.println("录入成功");
	}else {
		System.out.println("录入失败");
	}
}
/*
 * 导出自身班级夜不归寝的学生名单
 */
public static void ExportClassStudent() {
	String stu_class = null;
	System.out.println("请输入需要导出名单的班级");
	stu_class=sc.next();
	List<Student> list = studentService.listStudentCnoback(stu_class);
	if(!list.isEmpty()) {
		for(Student s:list) {
			System.out.println(s.toString());
		}
	}else {
		System.out.println("没有相关数据");
	}
}
/*
 * 添加学生助理
 */
public static void AddAssistant() {

	Admin admin =new Admin();
	System.out.println("请输入需要添加的学生助理姓名");
	admin.setName(sc.next());
	System.out.println("请输入需要学生助理登录密码");
	admin.setPassword(sc.next());
	if(adminService.saveAdmin(admin)>0) {
		System.out.println("添加成功");
	}else {
		System.out.println("添加失败");
	}
}

public static void AssistantCreatFace() {
	int select =0;
	System.out.println("1：录入学生就寝信息");
	System.out.println("0：退出管理系统");
	while(true) {
		select = sc.nextInt();
		switch(select) {
		case 1:EntryStudent();AssistantCreatFace();break;
		case 0:Exit();
		}
	}
}


}
