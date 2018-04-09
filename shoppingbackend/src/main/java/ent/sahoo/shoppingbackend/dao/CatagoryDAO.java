package ent.sahoo.shoppingbackend.dao;

import java.util.List;

import ent.sahoo.shoppingbackend.dto.Catagory;

public interface CatagoryDAO {
	
		

		List<Catagory> list();

		Catagory get(int id);
		
		boolean add (Catagory catagory);
		boolean update (Catagory catagory);
		boolean delete (Catagory catagory);
		
}
