package com.infosys.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public class BaseDao extends NamedParameterJdbcDaoSupport{
@Autowired
	public void setDataSource2(DataSource ds){
	//Cooment
	super.setDataSource(ds);
}
	
	
	
}
