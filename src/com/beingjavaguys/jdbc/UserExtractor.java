package com.beingjavaguys.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.beingjavaguys.domain.User;

public class UserExtractor implements ResultSetExtractor<User> {

	public User extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		User user = new User();
		
		
		
		user.setEquipment_Name(resultSet.getString(3));
		user.setS_NO(resultSet.getInt(4));
		user.setDescription(resultSet.getString(5));
		user.setReg_No(resultSet.getInt(6));
	
		
		return user;
	}

}
