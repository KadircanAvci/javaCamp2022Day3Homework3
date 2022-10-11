package kodlamaio.dataAccess;

import kodlamaio.entities.Educator;

public class HibernateEducatorDao implements EducatorDao {

	String message1 ="Hibernate ile veritabanına eklendi : ";
	String message2 ="Hibernate ile veritabanından silindi : ";
	String message3 ="Hibernate ile güncellendi : ";
	
	@Override
	public void add(Educator educator) {
		System.out.println(message1+educator.getFirstName()+" "+educator.getLastName());
		
	}

	@Override
	public void delete(Educator educator) {
		System.out.println(message2+educator.getFirstName()+" "+educator.getLastName());
		
	}

	@Override
	public void update(Educator educator) {
		System.out.println(message3+educator.getFirstName()+" "+educator.getLastName());
		
	}

}
