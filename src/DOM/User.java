package DOM;

public class User {
	private String name;
	private String pwd;
	private String time;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public User(String nameIn,String pwdIn,String dateIn)
	{
		name = nameIn;
		pwd = pwdIn;
		time = dateIn;
	}
	public User()
	{
	}
}
