package com.kit.admissions;

class Dayscholar extends Student{
	private int busNumber;
	private int distance;

	public Dayscholar(int studentId, String name, String gender, String department, double collegeFee, int roomNumber, String blockName, String roomType, int busNumber, int distance) {
		super(studentId, name, department, gender, collegeFee);
		this.busNumber=busNumber;
		this.distance=distance;
		
	}
	public Dayscholar(int studentId, String name, String department, String gender, String category, double collegeFee,
			int busNumber2, int distance2) {
		// TODO Auto-generated constructor stub
	}
	public double calculateTotalFee() {
		double busFee;
		if (distance>30&&distance<=40) {
			busFee=28000;
		}else if(distance>20&&distance<=30) {
			busFee=20000;
		}else if(distance>10&&distance<=20) {
			busFee=12000;
		}else {
			busFee=6000;
		}
		return collegeFee+busFee;
	
	}
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}