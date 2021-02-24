package shoping_jdbcDao;

import java.util.List;

import shoping_jdbcDto.customer;

public interface customerDao {
	List<customer> selectCustomerByAll();
	customer selectCustomerByNo(customer cus);
	int insertCustomer(customer cus);
	int updateCustomer(customer cus);
	int deleteCustomer(int cus);
}
