package seedu.addressbook.common;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {
	
	/*
	 *  Tests isAnyNull method
	 */
	@Test
	public void isAnyNull_noNull() {
		assertFalse(Utils.isAnyNull("abc"));
	}
	@Test
	public void isAnyNull_someNull() {
		assertTrue(Utils.isAnyNull("ABC", null));
	}
	@Test
	public void isAnyNull_empty() {
		assertFalse(Utils.isAnyNull());
	}
	/*
	 * Tests elementsAreUnqiue
	 */
	@Test
	public void elementsAreUnique_allUnique() {
		ArrayList<Integer> testAllUnique = new ArrayList<Integer>();
		testAllUnique.add(1);
		testAllUnique.add(2);
		testAllUnique.add(3);
		assertTrue(Utils.elementsAreUnique(testAllUnique));
	}
	@Test
	public void elementsAreUnique_noUnique() {
		ArrayList<Integer> noUnique = new ArrayList<Integer>();
		noUnique.add(1); 
		noUnique.add(1); 
		noUnique.add(1);
		assertFalse(Utils.elementsAreUnique(noUnique));
	}
	@Test
	public void elementsAreUnique_empty() {
		ArrayList<Integer> empty = new ArrayList<Integer>();
		assertTrue(Utils.elementsAreUnique(empty));
	}
}
