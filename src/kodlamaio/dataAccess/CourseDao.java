package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public interface CourseDao {
	
	void add(Course course);
	void delete(Course course);
	void update(Course course);
}
