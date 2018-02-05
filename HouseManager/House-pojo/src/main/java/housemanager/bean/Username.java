package housemanager.bean;

import java.io.Serializable;


import org.apache.ibatis.type.Alias;
/**
 * 用户表
 * @author faping
 *
 */
@Alias("username")
public class Username implements Serializable{
	
	private Integer uid;
	private String uname;
	private String password;
	private Integer state;
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Username [uid=" + uid + ", uname=" + uname + ", password=" + password + ", state=" + state + "]";
	}
	
}
