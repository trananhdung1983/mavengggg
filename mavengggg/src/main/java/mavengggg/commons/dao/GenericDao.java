package mavengggg.commons.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Generic interface for data Access Object. To be extended or implemented.
 * Contains common persistence methods.
 * 
 * @author TADUNG
 */

public interface GenericDao <T, ID extends Serializable> {
	
	T save(T entity);
	T update(T entity);
	void delete(T entity);
	T findById(ID id);
	List<T> findAll();
	void flush();

}
