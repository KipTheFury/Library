/**
 *
 */
package org.kb.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Kyle
 *
 */
@Entity
public abstract class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	protected String name;

	protected int availableCopies;

	public Item() {

	}

	public Item(final String name) {

		this.name = name;
		this.availableCopies = 0;
	}
}
