package ent.sahoo.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ent.sahoo.shoppingbackend.dao.CatagoryDAO;
import ent.sahoo.shoppingbackend.dto.Catagory;

@Repository("catagoryDAO")
@Transactional
public class CatagoryDAOImpl implements CatagoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	/*
	 * private static List<Catagory> catagories = new ArrayList<>();
	 * 
	 * static {
	 * 
	 * Catagory catagory1 = new Catagory(); Catagory catagory2 = new Catagory();
	 * Catagory catagory3 = new Catagory();
	 * 
	 * // adding first catagory catagory1.setId(1); catagory1.setName("Television");
	 * catagory1.setDescription("Some decription of televison goes here");
	 * catagory1.setImageURL("CAT_1.png"); // catagory.setActive(active);
	 * 
	 * catagories.add(catagory1);
	 * 
	 * // adding second catagory catagory2.setId(2); catagory2.setName("Mobile");
	 * catagory2.setDescription("Some decription of Mobile goes here");
	 * catagory2.setImageURL("CAT_2.png"); // catagory.setActive(active);
	 * 
	 * catagories.add(catagory2);
	 * 
	 * // adding third catagory catagory3.setId(3); catagory3.setName("Laptop");
	 * catagory3.setDescription("Some decription of Laptop goes here");
	 * catagory3.setImageURL("CAT_3.png"); // catagory.setActive(active);
	 * 
	 * catagories.add(catagory3);
	 * 
	 * }
	 */

	@Override
	public List<Catagory> list() {
		
		String selectActiveCatagory = "FROM Catagory WHERE active= :active";
		Query query =sessionFactory.getCurrentSession().createQuery(selectActiveCatagory);
		query.setParameter("active", true);

		return query.getResultList();
	}

	/*
	 * @Override public Catagory get(int id) { for (Catagory catagory : catagories)
	 * { if (catagory.getId() == id) { return catagory; } } return null; }
	 */

	// Getting single catagory based on Id

	@Override
	public Catagory get(int id) {

		return sessionFactory.getCurrentSession().get(Catagory.class, Integer.valueOf(id));
	}

	@Override
	// @Transactional //we can also use it calss level so that all the method will
	// get the Transactional property
	public boolean add(Catagory catagory) {

		try {
			// Add catagory to the database table
			sessionFactory.getCurrentSession().persist(catagory);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	/*
	 * Updating a single catagory
	 ***/
	@Override
	public boolean update(Catagory catagory) {
		try {
			// Update catagory to the database table
			sessionFactory.getCurrentSession().update(catagory);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	

	@Override
	public boolean delete(Catagory catagory) {
		try {
				catagory.setActive(false);
			// delete(seting as false) catagory to the database table
			sessionFactory.getCurrentSession().update(catagory);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
