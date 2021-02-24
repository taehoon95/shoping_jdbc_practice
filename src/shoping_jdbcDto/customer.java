package shoping_jdbcDto;

public class customer {
	private String cusNo;
	private String cusName;
	private String birth;
	private String callNo;
	private String gender;

	public customer() {
	}

	public customer(String cusNo) {
		super();
		this.cusNo = cusNo;
	}

	public customer(String cusNo, String cusName, String birth, String callNo, String gender) {
		super();
		this.cusNo = cusNo;
		this.cusName = cusName;
		this.birth = birth;
		this.callNo = callNo;
		this.gender = gender;
	}

	public String getCusNo() {
		return cusNo;
	}

	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getCallNo() {
		return callNo;
	}

	public void setCallNo(String callNo) {
		this.callNo = callNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s %s", cusNo, cusName, birth, callNo, gender);
	}

}
