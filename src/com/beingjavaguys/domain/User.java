package com.beingjavaguys.domain;

import java.util.Date;

public class User {
	private int Equipment_Id;
	private String Equipment_Type_Name;
	private String equipment_Name;
	private int  s_NO;
	private String description;
	private int reg_No;
	private Date Start_Date;
	private Date End_Date;
	private String Facility_Name;
	
	public int getEquipment_Id() {
		return Equipment_Id;
	}
	public void setEquipment_Id(int equipment_Id) {
		Equipment_Id = equipment_Id;
	}
	public String getEquipment_Type_Name() {
		return Equipment_Type_Name;
	}
	public void setEquipment_Type_Name(String equipment_Type_Name) {
		Equipment_Type_Name = equipment_Type_Name;
	}
	public String getEquipment_Name() {
		return equipment_Name;
	}
	public void setEquipment_Name(String eqipmentName) {
		equipment_Name = eqipmentName;
	}
	public int getS_NO() {
		return s_NO;
	}
	public void setS_NO(int sNO) {
		s_NO = sNO;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descriptions) {
		description = descriptions;
	}
	public int getReg_No() {
		return reg_No;
	}
	public void setReg_No(int regNo) {
		reg_No = regNo;
	}
	public Date getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(Date start_Date) {
		Start_Date = start_Date;
	}
	public Date getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(Date end_Date) {
		End_Date = end_Date;
	}
	public String getFacility_Name() {
		return Facility_Name;
	}
	public void setFacility_Name(String facility_Name) {
		Facility_Name = facility_Name;
	}
	
}
