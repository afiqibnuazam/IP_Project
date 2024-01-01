//Part of <ModuleName> Module - <YourName>

package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


//using JDBC Template
@Service
public class TemplateDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//CRUD OPERATION METHODS HERE
	//1. CREATE
	
	
	//2. READ ALL
	
	
	//3. READ BY ID
	
	
	//4. UPDATE
	
	
	//5. DELETE
}
