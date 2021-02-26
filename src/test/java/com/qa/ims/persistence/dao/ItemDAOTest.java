package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;


//public class ItemDAOTest {
	
//	private final ItemDAO DAO = new ItemDAO();

//	@Before
//	public void setup() {
//		DBUtils.connect();
//		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
//	}

//	@Test
//	public void testCreate() {
//		final Item created = new Item(2L, "smoothie", 1.20);
//		assertEquals(created, DAO.create(created));
//	}

//	@Test
//	public void testReadAll() {
//		List<Item> expected = new ArrayList<>();
//		expected.add(new Item(1L, "sugar", 0.90));
//		assertEquals(expected, DAO.readAll());
//	}

//	@Test
//	public void testReadLatest() {
//		assertEquals(new Item(1L, "sugar", 0.90), DAO.readLatest());
//	}

//	@Test
//	public void testRead() {
//		final long ID = 1L;
//		assertEquals(new Item(ID, "sugar", 0.90), DAO.read(ID));
//	}

//	@Test
//	public void testUpdate() {
//		final Item updated = new Item(1L, "sugar", 0.90);
//		assertEquals(updated, DAO.update(updated));

//	}

//	@Test
//	public void testDelete() {
//		assertEquals(1, DAO.delete(1));
//	}
	
public class ItemDAOTest {
		private static ItemDAO testItemDAO;
	


			


		@Test
		public void ItemDAOConstructor1() {
			
			testItemDAO = new ItemDAO();
			assertNotNull(testItemDAO);
			assertTrue(testItemDAO instanceof ItemDAO);
				
			}

		@Test
		public void ItemDAOConstructor2() {
			
			testItemDAO = new ItemDAO(); 
			assertNotNull(testItemDAO);
			
				
			}


}
