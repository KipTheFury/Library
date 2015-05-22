/**
 *
 */
package org.kb.library.model;

import javax.persistence.Entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Kyle
 *
 */
@Entity
public class Book extends Item {

	public Book() {

	}

	public Book(final String name) {

		super(name);
	}

	@Override
	public String toString() {

		final ToStringBuilder builder = new ToStringBuilder(this,
				ToStringStyle.SHORT_PREFIX_STYLE);

		builder.append("id", id).append("name", name)
		.append("availableCopies", availableCopies);

		return builder.build();
	}

}
