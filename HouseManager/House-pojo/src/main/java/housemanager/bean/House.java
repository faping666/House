package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 楼盘表
 * @author faping
 *
 */
@Alias("house")
public class House {
private Integer hid;
private String hname; //楼盘名字
private Integer aid; //区域外键Area
private Integer hsid;//hstate楼盘状态表
private Integer cid;//circle商圈表 
private Integer pid;//premises楼盘类型
private Integer ptid;//ptype类型
private Integer sid;//spruce 装修
private Integer gid;//gallery图库
private Double price; //价格
private String opentime;//开盘时间
private String gettime;//交房时间
private String address;//地址
private String tel; //电话
private String school; //学区所属
private String developers;//开发商
private String developersid;//开发商许可证
private String coveredArea;//建筑面积
private String floorspace;//占地面积
private String plotRatio;//容积率
private String greenigRate;//绿化率
private String pripertyManagement; //物业公司
private Double propertyManagermentFee;//物业管理费
private Integer carport; //车位
private String discountsinfo; //优惠信息
private String surroundingFacility;//周边配套信息
private Integer htypeid;//housetype房源类型 
private Integer state; //状态字段 
public Integer getHid() {
	return hid;
}
public void setHid(Integer hid) {
	this.hid = hid;
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public Integer getAid() {
	return aid;
}
public void setAid(Integer aid) {
	this.aid = aid;
}
public Integer getHsid() {
	return hsid;
}
public void setHsid(Integer hsid) {
	this.hsid = hsid;
}
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public Integer getPtid() {
	return ptid;
}
public void setPtid(Integer ptid) {
	this.ptid = ptid;
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public Integer getGid() {
	return gid;
}
public void setGid(Integer gid) {
	this.gid = gid;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getDevelopers() {
	return developers;
}
public void setDevelopers(String developers) {
	this.developers = developers;
}
public String getDevelopersid() {
	return developersid;
}
public void setDevelopersid(String developersid) {
	this.developersid = developersid;
}
public String getCoveredArea() {
	return coveredArea;
}
public void setCoveredArea(String coveredArea) {
	this.coveredArea = coveredArea;
}
public String getFloorspace() {
	return floorspace;
}
public void setFloorspace(String floorspace) {
	this.floorspace = floorspace;
}
public String getPlotRatio() {
	return plotRatio;
}
public void setPlotRatio(String plotRatio) {
	this.plotRatio = plotRatio;
}
public String getGreenigRate() {
	return greenigRate;
}
public void setGreenigRate(String greenigRate) {
	this.greenigRate = greenigRate;
}
public String getPripertyManagement() {
	return pripertyManagement;
}
public void setPripertyManagement(String pripertyManagement) {
	this.pripertyManagement = pripertyManagement;
}
public Double getPropertyManagermentFee() {
	return propertyManagermentFee;
}
public void setPropertyManagermentFee(Double propertyManagermentFee) {
	this.propertyManagermentFee = propertyManagermentFee;
}
public Integer getCarport() {
	return carport;
}
public void setCarport(Integer carport) {
	this.carport = carport;
}
public String getDiscountsinfo() {
	return discountsinfo;
}
public void setDiscountsinfo(String discountsinfo) {
	this.discountsinfo = discountsinfo;
}
public String getSurroundingFacility() {
	return surroundingFacility;
}
public void setSurroundingFacility(String surroundingFacility) {
	this.surroundingFacility = surroundingFacility;
}
public Integer getHtypeid() {
	return htypeid;
}
public void setHtypeid(Integer htypeid) {
	this.htypeid = htypeid;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
@Override
public String toString() {
	return "House [hid=" + hid + ", hname=" + hname + ", aid=" + aid + ", hsid=" + hsid + ", cid=" + cid + ", pid="
			+ pid + ", ptid=" + ptid + ", sid=" + sid + ", gid=" + gid + ", price=" + price + ", opentime=" + opentime
			+ ", gettime=" + gettime + ", address=" + address + ", tel=" + tel + ", school=" + school + ", developers="
			+ developers + ", developersid=" + developersid + ", coveredArea=" + coveredArea + ", floorspace="
			+ floorspace + ", plotRatio=" + plotRatio + ", greenigRate=" + greenigRate + ", pripertyManagement="
			+ pripertyManagement + ", propertyManagermentFee=" + propertyManagermentFee + ", carport=" + carport
			+ ", discountsinfo=" + discountsinfo + ", surroundingFacility=" + surroundingFacility + ", htypeid="
			+ htypeid + ", state=" + state + "]";
}

}
