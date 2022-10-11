package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.core.validate.CourseValidator;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager {

	CourseDao courseDao;
	CourseValidator courseValidator;
	Logger[] loggers;

	public CourseManager(CourseDao courseDao, CourseValidator courseValidator, Logger[] loggers) {
		this.courseDao = courseDao;
		this.courseValidator = courseValidator;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		if (courseValidator.isValid(course)) {
			
			this.courseDao.add(course);
			System.out.println("Kurs eklendi :" + course.getCourseName());

			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}

		}

	}

	public void delete(Course course) {
		
		this.courseDao.delete(course);
		System.out.println(course.getCourseName() + " başarılı bir şekilde silindi");

	}

	public void update(Course course) {
		
		this.courseDao.update(course);
		System.out.println(course.getCourseName() + " başarılı bir şekilde güncellendi");
	}

}
