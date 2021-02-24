package shoping_jdbcDao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import shoping_jdbcDaoImpl.customerDaoImpl;
import shoping_jdbcDto.customer;

public class customerDaoTest {
	
	private static customerDao dao = customerDaoImpl.getInstance();
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testSelectCustomerByAll() {
		System.out.println("testSelectCustomerByAll");
		List<customer> list = dao.selectCustomerByAll();
		Assert.assertNotNull(list);
		for(customer c : list) {
			System.out.println(c);
		}
	}

	@Test
	public void testSelectCustomerByNo() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteCustomer() {
		fail("Not yet implemented");
	}

}
