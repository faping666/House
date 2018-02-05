package housemanager.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import housemanager.bean.Area;

public interface AreaMaper {
	
	@Select("select * from area ")
	public List<Area> findAll();
	
	@Select("")
	public Area load(Integer aid);

}
