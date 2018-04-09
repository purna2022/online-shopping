package ent.sahoo.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ent.sahoo.shoppingbackend.dao.CatagoryDAO;
import ent.sahoo.shoppingbackend.dto.Catagory;

public class CatagoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CatagoryDAO catagoryDAO;

	private Catagory catagory;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("ent.sahoo.shoppingbackend");
		context.refresh();
		catagoryDAO = (CatagoryDAO) context.getBean("catagoryDAO");
	}

	/*
	 * @Test public void testAddCatagory() { catagory = new Catagory();
	 * 
	 * catagory.setName("Mobile");
	 * catagory.setDescription("Some decription of Laptop goes here");
	 * catagory.setImageURL("CAT_3.png");
	 * 
	 * assertEquals("Successfully added catagory inside the table!", true,
	 * catagoryDAO.add(catagory)); }
	 */

	/*
	 * //Fetching a single catagory
	 * 
	 * @Test public void testGetCatagory() { catagory = catagoryDAO.get(2);
	 * 
	 * 
	 * assertEquals("Successfully fetched single catagory from table the table!",
	 * "Television",catagory.getName()); }
	 */

	/*
	 * //Fetching a single catagory
	 * 
	 * @Test public void testGetCatagory() { catagory = catagoryDAO.get(2);
	 * 
	 * 
	 * assertEquals("Successfully fetched single catagory from table the table!",
	 * "Television",catagory.getName()); }
	 */

	// Fetching a single catagory
	/*
	 * @Test public void testUpdateCatagory() { catagory = catagoryDAO.get(2);
	 * catagory.setName("TV");
	 * 
	 * assertEquals("Successfully updated single catagory in the table!", true,
	 * catagoryDAO.update(catagory)); }
	 */

	/*
	 * @Test public void testDeleteCatagory() { catagory = catagoryDAO.get(2);
	 * aassertEquals("Successfully updated single catagory in the table!", true
	 *  catagoryDAO.delete(catagory)) 	
	 */

	/*
	 * @Test public void testListCatagory() { catagory = catagoryDAO.get(2);
	 * assertEquals("Successfully fetched  the list of catagories from  the table!",
	 * 3, catagoryDAO.list().size()); }
	 */
	@Test
	public void testCRUDCatagory() {
		catagory = new Catagory();

		catagory.setName("Laptop");
		catagory.setDescription("Some decription of laptop goes here");
		catagory.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added catagory inside the table!", true, catagoryDAO.add(catagory));
		
		catagory = new Catagory();

		catagory.setName("Television");
		catagory.setDescription("Some decription of Television goes here");
		catagory.setImageURL("CAT_1.png");

		assertEquals("Successfully added catagory inside the table!", true, catagoryDAO.add(catagory));
		
		//Fetching and updating the catagory
		
		catagory = catagoryDAO.get(2);
		catagory.setName("TV");
		 
		assertEquals("Successfully updated single catagory in the table!", true,catagoryDAO.update(catagory));
		
		// Deleting a catagory 
		
		assertEquals("Successfully updated single catagory in the table!", true,catagoryDAO.delete(catagory));
		
		//Fetching the list
		
		assertEquals("Successfully fetched  the list of catagories from  the table!",1, catagoryDAO.list().size());
		
	}
}
