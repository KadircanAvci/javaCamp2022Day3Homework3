package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao{
	
	String message1 ="JDBC ile veritabanına eklendi : ";
	String message2 ="JDBC ile veritabanından silindi : ";
	String message3 ="JDBC ile güncellendi : ";
	
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
