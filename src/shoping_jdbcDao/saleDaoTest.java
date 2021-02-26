package shoping_jdbcDao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


import shoping_jdbcDaoImpl.saleDaoImpl;
import shoping_jdbcDto.sale;

public class saleDaoTest {
	private static saleDao dao = saleDaoImpl.getInstance();
	
	@Test
	public void testSelectMain() {
		System.out.println("testSelectMain");
		List<sale> list = dao.selectMain();
		Assert.assertNotNull(list);
		for(sale s : list) {
			int i = 1;
			System.out.printf("%d %s%n",i,s);
		}
	}

	@Test
	public void testSelectProduct() {
		System.out.println("testSelectProduct");
		List<sale> list = dao.selectProduct();
		Assert.assertNotNull(list);
		for(sale s : list) {
			System.out.println(s.toString2());
		}
	}

	@Test
	public void testDetailInfo() {
		fail("Not yet implemented");
	}

}
