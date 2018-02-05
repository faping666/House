package housemanager.bean;

import org.apache.ibatis.type.Alias;
/**
 * 楼盘信息推送
 * @author faping
 *
 */
@Alias("housemessage")
public class Housemessage {
private Integer mid;
private String mname;
private Integer state;
private Integer htypeid;//housetype房源类型外键
public Integer getMid() {
	return mid;
}
public void setMid(Integer mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public Integer getHtypeid() {
	return htypeid;
}
public void setHtypeid(Integer htypeid) {
	this.htypeid = htypeid;
}
@Override
public String toString() {
	return "Housemessage [mid=" + mid + ", mname=" + mname + ", state=" + state + ", htypeid=" + htypeid + "]";
}
}
