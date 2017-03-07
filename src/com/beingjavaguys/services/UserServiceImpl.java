package com.beingjavaguys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.beingjavaguys.dao.UserDao;
import com.beingjavaguys.domain.EquipmentMaster;
import com.beingjavaguys.domain.EquipmentType;
import com.beingjavaguys.domain.Facility;
import com.beingjavaguys.domain.User;


public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;

	@Override
	public void insertData(User user) {
		userdao.insertData(user);
	}

	@Override
	public List<User> getUserList() {
		return userdao.getUserList();
	}
	@Override
	public List<EquipmentType> getEquipmentTypeList() {
		return userdao.getEquipmentTypeList();
	}

	@Override
	public void deleteData(String id) {
		userdao.deleteData(id);
		
	}

	@Override
	public User getUser(String id) {
		return userdao.getUser(id);
	}

	@Override
	public void updateData(User user) {
		userdao.updateData(user);
		
	}

	@Override
	public void insertEquipment(EquipmentMaster em) {
		userdao.insertEquipment(em);
		
	}
	@Override
	public List<Facility> getFacilityMasterList() {
		// TODO Auto-generated method stub
		 return userdao.getFacilityMasterList();
	}


	
}
