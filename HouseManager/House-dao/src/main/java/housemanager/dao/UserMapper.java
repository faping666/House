package housemanager.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import housemanager.bean.Username;

public interface UserMapper {
	@Select("select * from username where uid=#{value}")
	public Username load(Integer uid);
	
	public List<Username> findAll();
	
	@Insert({"insert into username(uname,password) values(#{uname},#{password})"})
	public void save(Username user);
	
	@Update({"update username set uname=#{uname},password=#{password},state=#{state} where uid=#{uid}"})
	public void update(Username user);
	
}
