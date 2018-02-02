/*package com.schoolerp.DaoImpl;


import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.schoolerp.Dao.StudentDao;
import com.schoolerp.model.Users;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory sessionfactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllStudent() {
		Session session=sessionfactory.getCurrentSession();
		Query<Users> query=session.createQuery("from Users");
		List<Users> customers = query.getResultList();
		return customers;
	}

	@Override
	public Users getStudent(String Id) {
		return null;
	}

	@Override
	public void AddStudent() {
		
	}
	
}
*/