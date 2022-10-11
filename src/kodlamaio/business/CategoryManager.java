package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.core.validate.CategoryValidator;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager {

	CategoryDao categoryDao;
	CategoryValidator categoryValidator;
	Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, CategoryValidator categoryValidator, Logger[] loggers) {
		this.categoryValidator = categoryValidator;
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		if (categoryValidator.isValid(category)) {

			this.categoryDao.add(category);
			System.out.println("Yeni kategori eklendi: " + category.getCategoryName());
			
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}

		}

	}

	public void delete(Category category) {
		
		this.categoryDao.delete(category);
		System.out.println(category.getCategoryName() + "başarılı bir şekilde silindi");
	}

	public void update(Category category) {
		
		this.categoryDao.update(category);
		System.out.println(category.getCategoryName() + " başarılı bir şekilde güncellendi");
	}
}
