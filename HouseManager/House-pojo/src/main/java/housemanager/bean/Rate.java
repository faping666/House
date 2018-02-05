package housemanager.bean;

/**
 * 利率
 * @author faping
 *
 */
public class Rate {
private Integer rid;
private String rname;
private Integer state;
public Integer getRid() {
	return rid;
}
public void setRid(Integer rid) {
	this.rid = rid;
}
public String getRname() {
	return rname;
}
public void setRname(String rname) {
	this.rname = rname;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
@Override
public String toString() {
	return "Rate [rid=" + rid + ", rname=" + rname + ", state=" + state + "]";
}

}
