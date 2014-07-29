package com.coalmine.contentprovider.template;

import android.database.Cursor;

/** Used with {@link ContentProviderClientTemplate} query() methods when it's necessary to do more
 * complex processing than simply building a list of objects representing single Cursor rows.  A
 * simple example usage of a RowCallbackHandler is building a Map of objects, keyed on one of the
 * object's fields.
 * 
 *  @see RowMapper */
public interface RowCallbackHandler {
	/** Used to processes each row in the given Cursor, without altering it with calls like {@link Cursor#close()}. */
	void processRow(Cursor cursor, int rowNumber);
}


