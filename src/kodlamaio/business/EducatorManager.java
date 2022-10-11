package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.EducatorDao;
import kodlamaio.entities.Educator;

public class EducatorManager {

	EducatorDao educatorDao;
	Logger[] loggers;

	public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}

	public void add(Educator educator) {
		
		this.educatorDao.add(educator);
		System.out.println(educator.getFirstName() + " " + educator.getLastName() + " eklendi.");
		
		for (Logger logger : loggers) {
			logger.log(educator.getFirstName()+" "+educator.getLastName());
		}

	}

	public void delete(Educator educator) {
		
		this.educatorDao.delete(educator);
		System.out.println(educator.getFirstName() + " " + educator.getLastName() + " silindi.");
	}

	public void updadate(Educator educator) {
		
		this.educatorDao.update(educator);
		System.out.println(educator.getFirstName() + " " + educator.getLastName() + " güncellendi.");
	}
}
