/**
 * This class is generated by jOOQ
 */
package yvkm.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;

import yvkm.jooq.tables.BookStore;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookStoreRecord extends UpdatableRecordImpl<BookStoreRecord> implements Record1<String> {

	private static final long serialVersionUID = 1672507262;

	/**
	 * Setter for <code>jooq.book_store.name</code>.
	 */
	public void setName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jooq.book_store.name</code>.
	 */
	public String getName() {
		return (String) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<String> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<String> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return BookStore.BOOK_STORE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookStoreRecord value1(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookStoreRecord values(String value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BookStoreRecord
	 */
	public BookStoreRecord() {
		super(BookStore.BOOK_STORE);
	}

	/**
	 * Create a detached, initialised BookStoreRecord
	 */
	public BookStoreRecord(String name) {
		super(BookStore.BOOK_STORE);

		setValue(0, name);
	}
}
