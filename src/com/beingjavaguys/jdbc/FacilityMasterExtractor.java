package com.beingjavaguys.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.beingjavaguys.domain.EquipmentType;
import com.beingjavaguys.domain.Facility;
public class FacilityMasterExtractor implements ResultSetExtractor<Facility> {

	public Facility extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		List userList = new ArrayList();
		Facility Type = new Facility();
		System.out.println("result: "+resultSet.toString());
		System.out.println("result: "+resultSet.getString(2));
		Type.setFaciltiy_id(resultSet.getInt(1));
		Type.setFaciltiy_Manager_id(resultSet.getInt(2));
		Type.setArea_Manager_id(resultSet.getInt(3));
		Type.setEquipment_Name(resultSet.getString(4));
		Type.setCreate_Date(resultSet.getDate(5));
		Type.setLatitude(resultSet.getFloat(6));
		Type.setLongitude(resultSet.getFloat(7));
				System.out.println("Type:" +Type);
		
		return Type;
	}
}
