package housemanager.bean;

import org.apache.ibatis.type.Alias;
/**
 * 图库
 * @author faping
 *
 */
@Alias("gallery")
public class Gallery {
private Integer gid;
private String gname;
private Integer state;
private String path;
private Integer hid;  //楼盘外键
public Integer getGid() {
	return gid;
}
public void setGid(Integer gid) {
	this.gid = gid;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
public Integer getHid() {
	return hid;
}
public void setHid(Integer hid) {
	this.hid = hid;
}
@Override
public String toString() {
	return "Gallery [gid=" + gid + ", gname=" + gname + ", state=" + state + ", path=" + path + ", hid=" + hid + "]";
}

}
