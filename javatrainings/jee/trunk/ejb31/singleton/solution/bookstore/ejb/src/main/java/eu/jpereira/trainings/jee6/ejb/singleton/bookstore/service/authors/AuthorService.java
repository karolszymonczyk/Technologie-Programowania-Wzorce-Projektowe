package eu.jpereira.trainings.jee6.ejb.singleton.bookstore.service.authors;

import java.util.List;
import javax.ejb.Local;

import eu.jpereira.trainings.jee6.ejb.singleton.bookstore.model.Author;

@Local
public interface AuthorService {
	public List<Author> getAllAuthors(); 
	public void addAuthor(Author author);
		
}
