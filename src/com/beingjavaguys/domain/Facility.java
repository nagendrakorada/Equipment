package com.beingjavaguys.domain;

import java.util.Date;

public class Facility {

	private int Faciltiy_id;
	private int Faciltiy_Manager_id;
	private int Area_Manager_id;
	private String Equipment_Name;
	private Date Create_Date;
	private Float Latitude;
	private Float Longitude;
	public int getFaciltiy_id() {
		return Faciltiy_id;
	}
	public void setFaciltiy_id(int faciltiy_id) {
		Faciltiy_id = faciltiy_id;
	}
	public int getFaciltiy_Manager_id() {
		return Faciltiy_Manager_id;
	}
	public void setFaciltiy_Manager_id(int faciltiy_Manager_id) {
		Faciltiy_Manager_id = faciltiy_Manager_id;
	}
	public int getArea_Manager_id() {
		return Area_Manager_id;
	}
	public void setArea_Manager_id(int area_Manager_id) {
		Area_Manager_id = area_Manager_id;
	}
	public String getEquipment_Name() {
		return Equipment_Name;
	}
	public void setEquipment_Name(String equipment_Name) {
		Equipment_Name = equipment_Name;
	}
	public Date getCreate_Date() {
		return Create_Date;
	}
	public void setCreate_Date(Date create_Date) {
		Create_Date = create_Date;
	}
	public Float getLatitude() {
		return Latitude;
	}
	public void setLatitude(Float latitude) {
		Latitude = latitude;
	}
	public Float getLongitude() {
		return Longitude;
	}
	public void setLongitude(Float longitude) {
		Longitude = longitude;
	}
}
