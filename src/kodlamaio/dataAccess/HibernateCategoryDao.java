package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	
	String message1 ="Hibernate ile veritabanına eklendi : ";
	String message2 ="Hibernate ile veritabanından silindi : ";
	String message3 ="Hibernate ile güncellendi : ";
	
	@Override
	public void add(Category category) {
		System.out.println(message1+category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(message2+category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println(message3+category.getCategoryName());
		
	}
}
