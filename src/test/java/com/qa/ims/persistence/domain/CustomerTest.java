package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class CustomerTest {
	
	private static Customer testCustomer;

	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Customer.class).verify();
	}
	
	
	
	@Test
	public void equalsTest() {
		Object testCustomer = new Customer("john","henry");
		boolean result = testCustomer.equals(true);
		
	}
	
	@Test
	public void CustomerConstructor1() {
		
		testCustomer = new Customer("david","long");
		assertNotNull(testCustomer);
		assertTrue(testCustomer instanceof Customer);
			
		}
	
	@Test
	public void CustomerConstructor2() {
		
		testCustomer = new Customer("david","long");;
		assertNotNull(testCustomer);
		
			
		}
	

}
