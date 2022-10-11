package kodlamaio;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.business.EducatorManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.core.validate.CategoryValidator;
import kodlamaio.core.validate.CourseValidator;
import kodlamaio.dataAccess.HibernateCourseDao;
import kodlamaio.dataAccess.HibernateEducatorDao;
import kodlamaio.dataAccess.JdbcCategoryDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course1 = new Course(1, "Programlamaya Giriş için Temel Kurs", 0, "image1.url");
		Course course2 = new Course(2, "C# + ANGULAR", 0, "image2.url");
		Course course3 = new Course(3, "JAVA + REACT", 0, "image3.url");
		Course course4 = new Course(4, "JavaScript", 0, "image4.url");
		Course course5 = new Course(5, "(.NET) - ", 0, "image5.url");
		Course course6 = new Course(6, "JAVA", 0, "image6.url");

		Course[] courses = { course1, course2, course3, course4, course5, course6 };

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Course course7 = new Course(7, "C++", 5, "image7.url");

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), new CourseValidator(courses),
				loggers);
		courseManager.add(course7);
		

		Category category1 = new Category(1, "Programlama");

		Category[] categories = { category1 };

		Category category3 = new Category(3, "Veri Bilimi");

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), new CategoryValidator(categories),loggers);
		categoryManager.add(category3);
		

		Educator educator1 = new Educator(1, "Engin", "Demiroğ");
		EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);
		educatorManager.add(educator1);
	}

}
