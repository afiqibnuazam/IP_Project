//Part of <ModuleName> Module - <YourName>

package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.RecycleActivity;

//using Hibernate
@Service
public class UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	//CRUD OPERATION METHODS HERE
	//1. CREATE
	public void create(Object obj) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(obj);
	}
	
	//2. READ ALL
	@Transactional
	public List<Object> getAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.createQuery("FROM tableName").getResultList();
	}
	
	//3. READ BY ID
	public Object getById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Object.class, id);
	}
	
	//4. UPDATE
	
	
	//5. DELETE
	public void delete(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		// Retrieve the persistent data from the database using the provided id
		Object dataToDelete = currentSession.get(RecycleActivity.class, (int) id);

		// Check if the data exists before deleting
		if (dataToDelete != null) {
			currentSession.delete(dataToDelete); // Delete the data from the database
		}
	}
}
