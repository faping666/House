package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 楼盘类型
 * @author faping
 *
 */
@Alias("premises")
public class Premises {
private Integer pid;
private String pname;
private Integer state;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
@Override
public String toString() {
	return "Premises [pid=" + pid + ", pname=" + pname + ", state=" + state + "]";
}
}
