package ent.sahoo.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import ent.sahoo.shoppingbackend.dao.CatagoryDAO;
import ent.sahoo.shoppingbackend.dto.Catagory;

@Repository("catagoryDAO")
public class CatagoryDAOImpl implements CatagoryDAO {

	private static List<Catagory> catagories = new ArrayList<>();

	static {

		Catagory catagory1 = new Catagory();
		Catagory catagory2 = new Catagory();
		Catagory catagory3 = new Catagory();

		// adding first catagory
		catagory1.setId(1);
		catagory1.setName("Television");
		catagory1.setDescription("Some decription of televison goes here");
		catagory1.setImageURL("CAT_1.png");
		// catagory.setActive(active);

		catagories.add(catagory1);
		
		
		// adding second catagory
		catagory2.setId(2);
		catagory2.setName("Mobile");
		catagory2.setDescription("Some decription of Mobile goes here");
		catagory2.setImageURL("CAT_2.png");
		// catagory.setActive(active);

		catagories.add(catagory2);
		

		// adding third catagory
		catagory3.setId(3);
		catagory3.setName("Laptop");
		catagory3.setDescription("Some decription of Laptop goes here");
		catagory3.setImageURL("CAT_3.png");
		// catagory.setActive(active);

		catagories.add(catagory3);
	
		
	}

	@Override
	public List<Catagory> list() {
		// TODO Auto-generated method stub
		return catagories;
	}

	@Override
	public Catagory get(int id) {
		for (Catagory catagory : catagories) {
			if (catagory.getId()== id) {
				return catagory;
			}
		}
		return null;
	}

}
