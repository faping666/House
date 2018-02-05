package housemanager.bean;

/**
 * 装修
 * @author faping
 *
 */
public class Spruce {
private Integer sid;
private String sname; //精装 简装 毛坯 房改房
private Integer state;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
@Override
public String toString() {
	return "Spruce [sid=" + sid + ", sname=" + sname + ", state=" + state + "]";
}

}
