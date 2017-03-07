package com.beingjavaguys.services;

import java.util.List;

import com.beingjavaguys.domain.EquipmentMaster;
import com.beingjavaguys.domain.EquipmentType;
import com.beingjavaguys.domain.Facility;
import com.beingjavaguys.domain.User;

public interface UserService {
public void insertData(User user);

	public List<User> getUserList();

	public void deleteData(String id);

	public User getUser(String id);

	public void updateData(User user);
	public List<EquipmentType> getEquipmentTypeList();
	public void insertEquipment(EquipmentMaster em);

	public List<Facility> getFacilityMasterList();
}
