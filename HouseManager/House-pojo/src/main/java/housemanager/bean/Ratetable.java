package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 利率表
 * @author faping
 *
 */
@Alias("retetable")
public class Ratetable {
	private Integer rtid;
	private String rtname;
	private Integer state;
	private String rate1;//1-5年
	private String rate2;//5-30年
	private Integer rid; //rate利率外键
	public Integer getRtid() {
		return rtid;
	}
	public void setRtid(Integer rtid) {
		this.rtid = rtid;
	}
	public String getRtname() {
		return rtname;
	}
	public void setRtname(String rtname) {
		this.rtname = rtname;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getRate1() {
		return rate1;
	}
	public void setRate1(String rate1) {
		this.rate1 = rate1;
	}
	public String getRate2() {
		return rate2;
	}
	public void setRate2(String rate2) {
		this.rate2 = rate2;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "Ratetable [rtid=" + rtid + ", rtname=" + rtname + ", state=" + state + ", rate1=" + rate1 + ", rate2="
				+ rate2 + ", rid=" + rid + "]";
	}
	
}
