package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 房源信息
 * @author faping
 *
 */
@Alias("houseinfo")
public class Houseinfo {
private Integer id;
private String name;
private Integer state;
private String opentime;
private String gettime;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public String getOpentime() {
	return opentime;
}
public void setOpentime(String opentime) {
	this.opentime = opentime;
}
public String getGettime() {
	return gettime;
}
public void setGettime(String gettime) {
	this.gettime = gettime;
}
@Override
public String toString() {
	return "Houseinfo [id=" + id + ", name=" + name + ", state=" + state + ", opentime=" + opentime + ", gettime="
			+ gettime + "]";
}
}
