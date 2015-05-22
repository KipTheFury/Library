/**
 *
 */
package org.kb.library.dao.jpa;

import org.kb.library.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Kyle
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
