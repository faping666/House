package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 楼盘状态表
 * @author faping
 *
 */
@Alias("hstate")
public class Hstate {
private Integer hsid;
private String hsname;
private Integer state;
public Integer getHsid() {
	return hsid;
}
public void setHsid(Integer hsid) {
	this.hsid = hsid;
}
public String getHsname() {
	return hsname;
}
public void setHsname(String hsname) {
	this.hsname = hsname;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
@Override
public String toString() {
	return "Hstate [hsid=" + hsid + ", hsname=" + hsname + ", state=" + state + "]";
}
}
