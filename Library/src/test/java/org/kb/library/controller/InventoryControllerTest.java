package org.kb.library.controller;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.kb.library.dao.InventoryDao;
import org.kb.library.model.Book;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class InventoryControllerTest {

	@InjectMocks
	private InventoryController inventoryController;

	@Mock
	private InventoryDao mockInventoryDao;

	private Book dummyBook;

	@Before
	public void setUp() {

		initMocks(this);

		dummyBook = new Book("Dummy");
	}

	@Test
	public void canListInventory() throws Exception {

		when(mockInventoryDao.listInventory()).thenReturn(
				Arrays.asList(dummyBook));

		assertThat(inventoryController.listInventory()).contains(dummyBook);
	}
}
