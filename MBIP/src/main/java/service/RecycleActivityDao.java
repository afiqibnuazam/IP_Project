// Part of Recycle Activity Module - Afiq

package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import entity.RecycleActivity;

//using JDBC Template
@Service
public class RecycleActivityDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//CRUD OPERATION METHODS HERE
	//1. CREATE
	public String add() {
		String sql = "INSERT INTO Recycle_Activities () values ()";
		
		return "success";
	}
	
	//2. READ ALL
	public List<RecycleActivity> getAll() {
		String sql = "SELECT * FROM Recycle_Activities";
		List<RecycleActivity> recycleActivityList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<RecycleActivity>(RecycleActivity.class));
		
		return recycleActivityList;
	}
	
	//3. READ BY ID
	public RecycleActivity getById(int id) {
		String sql = "SELECT * FROM Recycle_Activities WHERE id=?";
		try {
	        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<RecycleActivity>(RecycleActivity.class));
	    } catch (EmptyResultDataAccessException e) {
	        return null;
	    }
	}

	//4. UPDATE
	
	
	//5. DELETE
	
}
