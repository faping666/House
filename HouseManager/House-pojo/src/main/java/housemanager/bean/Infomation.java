package housemanager.bean;
/**
 * 资讯表
 * @author faping
 *
 */
public class Infomation {
private Integer iid;
private String iname;//名称
private String info;//类容
private Integer state;
public Integer getIid() {
	return iid;
}
public void setIid(Integer iid) {
	this.iid = iid;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
@Override
public String toString() {
	return "Infomation [iid=" + iid + ", iname=" + iname + ", info=" + info + ", state=" + state + "]";
}

}
