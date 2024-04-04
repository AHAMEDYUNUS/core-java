package Interfaceday4;
import java.util.Scanner;
public class CustmerDetails implements BounsPoints, DoorDelivery{
	private String customerName;
	private String phoneNumber;
	private String streetName;
	private double billAmount;
	private int distance;
	
	public CustmerDetails() {};
	public CustmerDetails(Scanner get) {
		super();
		System.out.print("Enter name: ");
		this.customerName=get.nextLine();
		System.out.print("Enter PH number: ");
		this.phoneNumber=get.nextLine();
		System.out.print("Enter streetname: ");
		this.streetName=get.nextLine();
		System.out.print("Enter billAmount: ");
		this.billAmount=get.nextDouble();
		System.out.print("Enter distance: ");
		this.distance=get.nextInt();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public double CalculateBonusPoints() {
		if (billAmount>=250) {
			return billAmount/10;
		}
		return 0;
	}
	@Override
	public String toString() {
        return "CustmerDetails [customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", streetName="
                + streetName + ", billAmount=" + billAmount + ", distance=" + distance + ", BonusPoints="
                + CalculateBonusPoints() + ", DeliveryCharge=" + deliveryCharge() + "]";
    }
	@Override
	public double deliveryCharge() {
		if(distance>=25) {
			return 8*distance;
		}else if (distance>=15&&distance<25) {
			return 5*distance;
		}else if(distance<15) {
			return 2*distance;
		}
		return 0;
	}
	
	
}


