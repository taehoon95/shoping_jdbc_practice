package shoping_jdbcDto;

public class sale {
	private String date;
	private customer cusNo;
	private product product;
	private int saleRate;
	private int sales;
	private int profit;
	
	public int getProfit() {
		return (int) ((product.getProPrice()*saleRate*1.1) - (product.getProPrice()*saleRate));
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getSales() {
		return (int) (product.getProPrice()*saleRate*1.1);
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public sale(String date, customer cusNo, shoping_jdbcDto.product product, int saleRate, int sales) {
		super();
		this.date = date;
		this.cusNo = cusNo;
		this.product = product;
		this.saleRate = saleRate;
		this.sales = sales;
	}

	public sale(String date, customer cusNo, shoping_jdbcDto.product product, int saleRate, int sales, int profit) {
		super();
		this.date = date;
		this.cusNo = cusNo;
		this.product = product;
		this.saleRate = saleRate;
		this.sales = sales;
		this.profit = profit;
	}

	public sale() {
	}

	public sale(String date) {
		super();
		this.date = date;
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
		return String.format("%s %s %s %s %s %s %s", date, cusNo.getCusNo(), cusNo.getCusName(),cusNo.getCallNo(),product.getProduct(), saleRate,sales);
	}

	public String toString2() {
		return String.format("%4s %4s %4s %4s %4s %5s %5s", cusNo.getCusNo(),date, product.getProduct(),product.getProName(), saleRate,product.getProPrice(),sales,profit);
	}
	
	public String toString3() {
		return String.format("%4s %4s %4s %4s %4s %5s %5s %s", date,product.getProduct(),product.getProName(),cusNo.getCusName(),saleRate,product.getProPrice(),sales,profit);
	}
}
