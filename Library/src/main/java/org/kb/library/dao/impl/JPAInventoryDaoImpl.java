/**
 *
 */
package org.kb.library.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.kb.library.dao.InventoryDao;
import org.kb.library.dao.jpa.BookRepository;
import org.kb.library.model.Book;
import org.kb.library.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author Kyle
 *
 */
@Repository
@Qualifier(value = "JPA")
public class JPAInventoryDaoImpl implements InventoryDao {

	private static final Logger LOG = LoggerFactory
			.getLogger(JPAInventoryDaoImpl.class);

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Item> listInventory() {

		LOG.debug("ENTRY");

		final List<Item> inventory = new ArrayList<Item>();
		final Iterable<Book> books = bookRepository.findAll();

		if (books != null && books.iterator().hasNext()) {

			for (final Book book : books) {
				inventory.add(book);
			}
		}

		LOG.debug("EXIT - " + inventory);

		return inventory;
	}
}
