package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao{
	
	String message1 ="Hibernate ile veritabanına eklendi : ";
	String message2 ="Hibernate ile veritabanından silindi : ";
	String message3 ="Hibernate ile güncellendi : ";
	
	@Override
	public void add(Course course) {
		System.out.println(message1+course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println(message2+course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println(message3+course.getCourseName());
		
	}


}


