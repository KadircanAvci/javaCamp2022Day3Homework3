package kodlamaio.dataAccess;

import kodlamaio.entities.Category;


public class JdbcCategoryDao implements CategoryDao{

	String message1 ="JDBC ile veritabanına eklendi : ";
	String message2 ="JDBC ile veritabanından silindi : ";
	String message3 ="JDBC ile güncellendi : ";
	
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
