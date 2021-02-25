package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class ItemTest {
	
	private static Item testItem;

	
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Item.class).verify();
	}
	
	@Test
	public void equalsTest() {
		Object testItem = new Item("crisps",1.90);
		boolean result = testItem.equals(true);
		
	}
	
	@Test
	public void ItemConstructor1() {
		
		testItem = new Item("crisps", 1.80);
		assertNotNull(testItem);
		assertTrue(testItem instanceof Item);
			
		}
	
	@Test
	public void ItemConstructor2() {
		
		testItem = new Item((long) 1, "crisps", 1.80);
		assertNotNull(testItem);
		
			
		}
	

}
