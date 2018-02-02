package com.schoolerp.Dao;

import java.util.List;


import com.schoolerp.model.Users;

public interface StudentDao {
	public List<Users> getAllStudent();
	public Users getStudent(String Id);
	public void AddStudent();
}
