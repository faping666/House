package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 
 * 商圈表
 * @author faping
 * 
 */
@Alias("circle")
public class Circle {

	private Integer cid;
	private String cname;
	private Integer state;
	private Integer aid;  //外键 区域表area
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "Circle [cid=" + cid + ", cname=" + cname + ", state=" + state + ", aid=" + aid + "]";
	}
	
}
