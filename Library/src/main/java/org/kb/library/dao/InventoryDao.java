/**
 *
 */
package org.kb.library.dao;

import java.util.List;

import org.kb.library.model.Item;

/**
 * @author Kyle
 *
 */
public interface InventoryDao {

	public List<Item> listInventory();
}
