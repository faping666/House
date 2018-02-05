package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 区域表
 * @author faping
 *
 */

@Alias("area")
public class Area {
	
	private Integer aid;
	private String aname;
	private Integer state;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Area [aid=" + aid + ", aname=" + aname + ", state=" + state + "]";
	}
	

}
