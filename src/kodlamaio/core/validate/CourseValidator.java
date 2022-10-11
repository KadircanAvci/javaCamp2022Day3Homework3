package kodlamaio.core.validate;

import kodlamaio.entities.Course;

public class CourseValidator {

	private Course[] courses;

	public CourseValidator(Course[] courses) {
		this.courses = courses;

	}

	public boolean isValid(Course course) throws Exception {

		for (Course courses : courses) {

			if (courses.getCourseName() == course.getCourseName()) {

				throw new Exception("Kurs ismi daha önce kullanılmıştır. Lütfen başka bir kurs ismi giriniz.");

			}

		}
		if (course.getPrice() < 0) {
			
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");

		}

		return true;
	}

}
