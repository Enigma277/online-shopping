package enigma27.shoppingbackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import enigma27.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
	
}