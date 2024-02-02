// Part of Recycle Activity Module - Afiq

package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.RecycleActivity;
import entity.User;

//using Hibernate
@Service
public class RecycleActivityDao {

	@Autowired
	private SessionFactory sessionFactory;

	// CRUD OPERATION METHODS HERE
	// 1. CREATE
	@Transactional
	public void save(RecycleActivity recAct) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(recAct);
	}

	// 2. READ ALL
	@Transactional
	public List<RecycleActivity> findAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.createQuery("FROM Recycle_Activities").getResultList();
	}

	// 3. READ BY ID
	@Transactional
	public RecycleActivity findById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(RecycleActivity.class, id);
	}
	
	@Transactional
	public List<RecycleActivity> findByUser(User user) {
	    Session currentSession = sessionFactory.getCurrentSession();
	    return currentSession.createQuery("FROM RecycleActivity WHERE user = :user")
	            .setParameter("user", user)
	            .getResultList();
	}

	// 4. UPDATE
	public void update(int id, RecycleActivity recAct) {
		Session currentSession = sessionFactory.getCurrentSession();

		// Retrieve the persistent data from the database using the provided id
		RecycleActivity existingRecAct = currentSession.get(RecycleActivity.class, (long) id);

		// Check if the data exists before updating
		if (existingRecAct != null) {
			// Update the properties of the existing data with the new values
			existingRecAct.setType(recAct.getType());
			existingRecAct.setWeight(recAct.getWeight());
			existingRecAct.setAmount(recAct.getAmount());
			existingRecAct.setMonth(recAct.getMonth());
			existingRecAct.setPhotoUrl(recAct.getPhotoUrl());
			
			// Save the changes back to the database
			currentSession.merge(existingRecAct);
		}
	}

	// 5. DELETE
	public void delete(int id) {
		Session currentSession = sessionFactory.getCurrentSession();

		// Retrieve the persistent data from the database using the provided id
		RecycleActivity dataToDelete = currentSession.get(RecycleActivity.class, (int) id);

		// Check if the data exists before deleting
		if (dataToDelete != null) {
			currentSession.delete(dataToDelete); // Delete the data from the database
		}
	}
}
