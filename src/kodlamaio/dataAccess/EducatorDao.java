package kodlamaio.dataAccess;

import kodlamaio.entities.Educator;

public interface EducatorDao {
	
	void add(Educator educator);
	void delete(Educator educator);
	void update(Educator educator);
}
