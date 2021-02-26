package shoping_jdbcDao;

import java.util.List;

import shoping_jdbcDto.sale;

public interface saleDao {
	List<sale> selectMain();
	List<sale> selectProduct();
	List<sale> detailInfo();
}
