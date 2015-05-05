package DOM;

public class Finance {
	private int id;
	private int num;
	private String financetype;
	private String type;
	private String spendingtime;
	private String remark;
	private int userid;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setFinancetype(String financetype) {
		this.financetype = financetype;
	}
	public String getFinancetype() {
		return financetype;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setSpendingtime(String spendingtime) {
		this.spendingtime = spendingtime;
	}
	public String getSpendingtime() {
		return spendingtime;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark() {
		return remark;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getUserid() {
		return userid;
	}
	
}
