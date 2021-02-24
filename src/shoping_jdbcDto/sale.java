package shoping_jdbcDto;

public class sale {
	private String date;
	private customer cusNo;
	private product product;
	private int saleRate;

	public sale() {
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public customer getCusNo() {
		return cusNo;
	}

	public void setCusNo(customer cusNo) {
		this.cusNo = cusNo;
	}

	public product getProduct() {
		return product;
	}

	public void setProduct(product product) {
		this.product = product;
	}

	public int getSaleRate() {
		return saleRate;
	}

	public void setSaleRate(int saleRate) {
		this.saleRate = saleRate;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s", date, cusNo, product, saleRate);
	}

}
