package com.beingjavaguys.domain;

import java.util.Date;

//to insert operation on EquipmentMaster Table
public class EquipmentMaster {
	private int Equipment_Id;
	private String Equipment_Type_Name;
	private String Equipment_Name;
	private int  S_NO;
	private String Description;
	private int Reg_No;
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
		return Equipment_Name;
	}
	public void setEquipment_Name(String eqipmentName) {
		Equipment_Name = eqipmentName;
	}
	public int getS_NO() {
		return S_NO;
	}
	public void setS_NO(int sNO) {
		S_NO = sNO;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getReg_No() {
		return Reg_No;
	}
	public void setReg_No(int regNo) {
		Reg_No = regNo;
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
