package enigma27.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import enigma27.shoppingbackend.dao.CategoryDAO;
import enigma27.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		
		Category category = new Category();
		
		// adding first category
		category.setId(1);
		category.setName("Mobiles");
		category.setDescription("this tab is for mobiles");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		category = new Category();
		
		// adding second category
		category.setId(2);
		category.setName("Laptops");
		category.setDescription("this tab is for Laptops");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
		category = new Category();
		
		// adding third category
		category.setId(3);
		category.setName("Televisions");
		category.setDescription("this tab is for Televisions");
		category.setImageURL("CAT_3.png");
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
