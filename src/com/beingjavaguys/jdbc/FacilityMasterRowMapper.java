package com.beingjavaguys.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.beingjavaguys.domain.EquipmentType;
import com.beingjavaguys.domain.Facility;

public class FacilityMasterRowMapper implements RowMapper<Facility> {

	@Override
	public Facility mapRow(ResultSet resultSet, int line) throws SQLException {
		FacilityMasterExtractor facilityMasterExtractor = new FacilityMasterExtractor();
		return facilityMasterExtractor.extractData(resultSet);
	}

}
