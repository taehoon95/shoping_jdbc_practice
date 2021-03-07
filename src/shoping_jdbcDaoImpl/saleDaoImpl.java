package shoping_jdbcDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import native_jdbc_programing.util.JdbcUtil;
import shoping_jdbcDao.saleDao;
import shoping_jdbcDto.customer;
import shoping_jdbcDto.product;
import shoping_jdbcDto.sale;

public class saleDaoImpl implements saleDao {
	private static final saleDaoImpl instance = new saleDaoImpl();
	
	private saleDaoImpl() {}

	public static saleDaoImpl getInstance() {
		return instance;
	}
	
	private sale getSale(ResultSet rs) throws SQLException {
		int profit = 0;
		String date = rs.getString("date");
		
		customer cusNo = new customer(rs.getString("cusno"));
		
		try{
			cusNo.setCusName(rs.getString("cusName"));	
		}catch (SQLException e) {}
		try{
			cusNo.setCallNo(rs.getString("callno"));
		}catch (SQLException e) {}
		product product = new product(rs.getString("product"));
		try {
			product.setProName(rs.getString("proName"));
			product.setProPrice(rs.getInt("proPrice"));
		}catch (SQLException e) {}
		int saleRate = rs.getInt("salerate");
		int sales = rs.getInt("sale");
		try {
			profit = rs.getInt("profit");
		}catch (SQLException e) {}
		return new sale(date, cusNo, product, saleRate, sales,profit);
	}
	
	@Override
	public List<sale> detailInfo() {
		String sql = "select cusno,date,product,proName,cusName,salerate,proPrice,sale,profit from vw_detail";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if(rs.next()) {
				ArrayList<sale> list = new ArrayList<sale>();
				do {
					list.add(getSale(rs));
				}while(rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<sale> selectMain() {
		String sql = "select * from vw_main";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(rs.next()) {
				ArrayList<sale> list = new ArrayList<>();
				do {
					list.add(getSale(rs));
				}while(rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	

	@Override
	public List<sale> selectProduct() {
		String sql = "select cusno,date,product,proName,salerate,proPrice,sale,profit from vw_product";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(rs.next()) {
				ArrayList<sale> list = new ArrayList<sale>();
				do {
					list.add(getSale(rs));
				}while(rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
