package shoping_jdbcDaoImpl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import shoping_jdbcDao.saleDao;
import shoping_jdbcDto.sale;

public class saleDaoTest {
	private static saleDao dao = saleDaoImpl.getInstance();
	
	@Test
	public void testSelectMain() {
		System.out.println("testSelectMain");
		List<sale> list = dao.selectMain();
		Assert.assertNotNull(list);
		for(sale s : list) {
			System.out.printf("%s%n",s);
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
		System.out.println("testDetailInfo");
		List<sale> list = dao.detailInfo();
		Assert.assertNotNull(list);
		for(sale s : list) {
			System.out.println(s.toString3());
		}
	}

}
