package kodlamaio.core.validate;

import kodlamaio.entities.Category;

public class CategoryValidator {

	Category[] categories;
	
	public CategoryValidator(Category[] categories) {
		this.categories = categories;
	}

	public boolean isValid(Category category) throws Exception {

		for (Category categories : categories) {

			if (categories.getCategoryName() == category.getCategoryName()) {
				
			 throw new Exception ("Kategori ismi daha önce kullanılmıştır. Lütfen başka bir kategori ismi giriniz.");
			}

		}
		
		return true;
	}

}
