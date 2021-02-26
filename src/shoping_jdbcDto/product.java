package shoping_jdbcDto;

public class product {
	private String product;
	private String proName;
	private int proPrice;

	

	public product(String product) {
		this.product = product;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s", product, proName, proPrice);
	}

}
