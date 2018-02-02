/*package com.schoolerp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.schoolerp.Dao.StudentDao;
import com.schoolerp.Service.StudentService;
import com.schoolerp.model.Users;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentdao;
	@Override
	public void AddStudent() {
	}
	
	@Override
	@Transactional
	public List<Users> getAllStudent() {
		
		List<Users> student=studentdao.getAllStudent();
		return student;
	}
}
*/