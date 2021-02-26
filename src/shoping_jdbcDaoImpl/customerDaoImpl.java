package shoping_jdbcDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import native_jdbc_programing.util.JdbcUtil;
import shoping_jdbcDao.customerDao;
import shoping_jdbcDto.customer;
import shoping_jdbcDto.product;
import shoping_jdbcDto.sale;

public class customerDaoImpl implements customerDao {
	private static final customerDaoImpl instance = new customerDaoImpl();
	
	public static customerDaoImpl getInstance() {
		return instance;
	}
	
	private customerDaoImpl() {}

	private customer getCustomer(ResultSet rs) throws SQLException {
		String cusNo = rs.getString("cusno");
		String cusName = rs.getString("cusname");
		String birth = rs.getString("birth");
		String callNo = rs.getString("callNo");
		String gender = rs.getString("gender");
		return new customer(cusNo, cusName, birth, callNo, gender);
	}
	
	@Override
	public List<customer> selectCustomerByAll() {
		String sql = "select cusNo,cusName,birth,callNo,gender from customer";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if(rs.next()) {
				ArrayList<customer> list = new ArrayList<customer>();
				do {
					list.add(getCustomer(rs));
				}while(rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}



	@Override
	public customer selectCustomerByNo(customer cus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCustomer(customer cus) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomer(customer cus) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(int cus) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
