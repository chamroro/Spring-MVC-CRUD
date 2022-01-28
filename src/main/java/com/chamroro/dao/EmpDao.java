package com.chamroro.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import com.chamroro.beans.Emp;  
  
public class EmpDao {  
	
	@Autowired
	SqlSession sqlSession;
	
	public int insert(Emp p){  
	    int result=sqlSession.insert("emp.insert",p);
	    return result;  
	}  
	
	public int update(Emp p){  
	    int result=sqlSession.update("emp.update",p);
	    return result;  
	}  
	
	public int delete(int id){  
	    int result=sqlSession.delete("emp.delete",id);
	    return result;  
	}  
	
	public Emp get(int id){  
		Emp p=sqlSession.selectOne("emp.get",id);
	    return p;  
	}  
	
	
	public List<Emp> getEmpList(){  
		List<Emp> result=sqlSession.selectList("emp.getEmpList");
	    return result;  
	}  

}