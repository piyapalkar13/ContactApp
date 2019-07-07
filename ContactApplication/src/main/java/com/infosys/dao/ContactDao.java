package com.infosys.dao;

import java.util.List;

import com.infosys.domain.Contact;
import com.infosys.domain.User;

public interface ContactDao {

	
	public void save(Contact c);
	public void update(Contact c);
	public void delete(Contact c);
	public void delete(Integer contactId);
	public User findById(Integer contactId);
	public List<Contact> findAll();
	public List<Contact>findByProperty(String propName,Object propValue);
	
	
}
