package housemanager.bean;

import org.apache.ibatis.type.Alias;

/**
 * 评论
 * @author faping
 *
 */
@Alias("comment")
public class Comment {
	
	private Integer cid;
	private String cinfo;
	private Integer state;
	private String time;
	private Integer iid;  //(houseinfo房源信息外键)
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCinfo() {
		return cinfo;
	}
	public void setCinfo(String cinfo) {
		this.cinfo = cinfo;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getIid() {
		return iid;
	}
	public void setIid(Integer iid) {
		this.iid = iid;
	}
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", cinfo=" + cinfo + ", state=" + state + ", time=" + time + ", iid=" + iid
				+ "]";
	}

}
