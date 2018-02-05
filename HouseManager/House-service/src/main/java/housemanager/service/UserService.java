package housemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import housemanager.bean.Username;
import housemanager.dao.UserMapper;

@Service(value="user")
public class UserService {
	@Autowired
	private UserMapper usermapper;

	public Username load(Integer uid) {
		// TODO Auto-generated method stub
		return usermapper.load(uid);
	}

	public List<Username> findAll() {
		// TODO Auto-generated method stub
		return usermapper.findAll();
	}

	public void save(Username user) {
		// TODO Auto-generated method stub
		 usermapper.save(user);
	}

	public void update(Username user) {
		// TODO Auto-generated method stub
		usermapper.update(user);
	}


	
	
	
}
