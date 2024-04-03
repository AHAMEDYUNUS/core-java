package com.kit.admissions;

class Hosteller extends Student{
	private int roomNumber;
	private String blockName;
	private String roomType;
	
	public Hosteller(int studentId, String name, String gender, String department, double collegeFee, String category, int roomNumber, String blockName, String roomType) {
		super();
		this.roomNumber=roomNumber;
		this.blockName=blockName;
		this.roomType=roomType;
	}
	public double calculateTotalFee() {
		double hostelFee;
		if(blockName.equals("A")){
			hostelFee=60000;
		}else if(blockName.equals("B")){
			hostelFee=50000;
		}else {
			hostelFee=40000;
		}
		double totalFee;
		if(roomType.equals("AC")) {
			totalFee = getCollegeFee()+hostelFee+8000;
		}else {
			totalFee = getCollegeFee()+hostelFee+5000; 
		}
		return totalFee;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
}
