package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 类型
 * @author faping
 *
 */
@Alias("ptype")
public class Ptype {
private Integer ptid;
private String ptname;
private Integer state;
public Integer getPtid() {
	return ptid;
}
public void setPtid(Integer ptid) {
	this.ptid = ptid;
}
public String getPtname() {
	return ptname;
}
public void setPtname(String ptname) {
	this.ptname = ptname;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
@Override
public String toString() {
	return "Ptype [ptid=" + ptid + ", ptname=" + ptname + ", state=" + state + "]";
}
}
