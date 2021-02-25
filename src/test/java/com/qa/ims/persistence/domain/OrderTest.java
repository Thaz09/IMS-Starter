package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class OrderTest {
	
		
		private static Order testOrder;

		
		@Test
		public void testEquals() {
			EqualsVerifier.simple().forClass(Order.class).verify();
		}
		
		@Test
		public void equalsTest() {
			Object testOrder = new Order((long) 2, (long) 3);
			boolean result = testOrder.equals(true);
			
		}
		
		@Test
		public void OrderConstructor1() {
			
			testOrder = new Order((long) 2, (long) 3);
			assertNotNull(testOrder);
			assertTrue(testOrder instanceof Order);
				
			}
		
		@Test
		public void ItemConstructor2() {
			
			testOrder = new Order((long) 1, (long) 2);
			assertNotNull(testOrder);
			
				
			}

}
