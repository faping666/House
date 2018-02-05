package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 房源类型
 * @author faping
 *
 */
@Alias("housetype")
public class Housetype {
private Integer htypeid;
private String htypename;
private Integer state;
public Integer getHtypeid() {
	return htypeid;
}
public void setHtypeid(Integer htypeid) {
	this.htypeid = htypeid;
}
public String getHtypename() {
	return htypename;
}
public void setHtypename(String htypename) {
	this.htypename = htypename;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
@Override
public String toString() {
	return "Housetype [htypeid=" + htypeid + ", htypename=" + htypename + ", state=" + state + "]";
}
}
