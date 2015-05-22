/**
 *
 */
package org.kb.library.controller;

import java.util.List;

import org.kb.library.dao.InventoryDao;
import org.kb.library.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kyle
 *
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {

	private static final Logger LOG = LoggerFactory
			.getLogger(InventoryController.class);

	@Autowired
	@Qualifier(value = "JPA")
	InventoryDao inventoryDao;

	@RequestMapping(value = "/listInventory", method = RequestMethod.GET)
	public List<Item> listInventory() {

		LOG.debug("ENTRY");

		final List<Item> inventory = inventoryDao.listInventory();

		LOG.debug("EXIT [" + inventory + "]");

		return inventory;
	}
}
