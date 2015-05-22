package org.kb.library.dao.impl;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.kb.library.dao.jpa.BookRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class JPAInventoryDaoImplTest {

	@InjectMocks
	private JPAInventoryDaoImpl jpaDao;

	@Mock
	private BookRepository mockBookRepository;

	@Before
	public void setUp() throws Exception {

		initMocks(this);
	}

	@Test
	public void canListInventory() {

		jpaDao.listInventory();

		verify(mockBookRepository).findAll();
	}

}
