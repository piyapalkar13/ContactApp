package com.infosys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.infosys.domain.User;

@Repository
public class UserDAOImpl extends BaseDao implements UserDao{

	public void save(User u) {
		
		
		String sql="INSERT INTO use(name,phone,email,address,loginName,password,role,loginStatus)";
		
	}

	public void update(User u) {
		// TODO Auto-generated method stub
		
	}

	public void delete(User u) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Integer userId) {
		// TODO Auto-generated method stub
		
	}

	public User findById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByProperty(String propName, Object propValue) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
	
	

